/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.generator

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.pascal.block
import org.xtext.example.mydsl.pascal.digit_sequence
import org.xtext.example.mydsl.pascal.factor
import org.xtext.example.mydsl.pascal.integer_number
import org.xtext.example.mydsl.pascal.program
import org.xtext.example.mydsl.pascal.real_number
import org.xtext.example.mydsl.pascal.scale_factor
import org.xtext.example.mydsl.pascal.term

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PascalGenerator extends AbstractGenerator {
	
	private int currentReg;
	private int currentLine;
	private Map<String, String> mapRegs;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (p: resource.allContents.toIterable.filter(program)) {			
			currentReg = 0;
			currentLine = 0;
			mapRegs = new HashMap<String, String>();
			fsa.deleteFile("output.asm");
			fsa.generateFile("output.asm", p.block.compile);
		}

	}	
	
	def getNextLine(){
		currentLine +=8;
		return currentLine+": ";
	}
	
	def getNextReg(){
		currentReg++;
		return "R"+currentReg;
	}
	def getCurrentReg(){
		return "R"+currentReg;
	}
	
	def compile(block block) '''
		«getNextLine() + "LD SP #stackStart"»
		«block.compileVariableDeclaration»
		«block.compileAttribution»
		«getNextLine() + "BR *0(SP)"»
	'''
	
	def compileVariableDeclaration(block block) '''
		«var declaration_variable = block.declaration_part.variable_declaration_part»
		«FOR variables_declaration : declaration_variable.variable_declaration»
			«FOR name : variables_declaration.identifier_list.identifier»
				«getNextLine() + "LD " + nextReg+ ", " + name»
				«mapRegs.put(name, getCurrentReg)»
			«ENDFOR»
		«ENDFOR»
	'''
	
	def compileAttribution(block block) '''	
		«FOR statement:block.statement_part.statement_sequence.statement»
				«IF statement !== null && statement.simple_statement !== null && statement.simple_statement.assignment_statement !== null && statement.simple_statement.assignment_statement.expression !== null»
					«FOR simple_expression: statement.simple_statement.assignment_statement.expression.simple_expression»
						«var List<Integer> listSum = new ArrayList<Integer>()»
						«var List<String> listSign= new ArrayList<String>()»
						«var List<Integer> listMul = new ArrayList<Integer>()»
						«var variableLeftName = statement.simple_statement.assignment_statement.variable.entire_variable.identifier.identifier»
						«IF simple_expression !== null»
							«FOR term:simple_expression.term»													
								«IF simple_expression.addition_operator.size == 0 && term.multiplication_operator.size == 0»
									«IF term !== null»
										«FOR factor: term.factor»
											«getCodeExpression(factor, variableLeftName)»
										«ENDFOR»
									«ENDIF»
								«ENDIF»
								«IF simple_expression.addition_operator.size == 0 && term.multiplication_operator.size > 0»
									«FOR multiplication_operator: term.multiplication_operator»
										«var aux = listSign.add(multiplication_operator)»
									«ENDFOR»
									«IF term !== null»	
										«loadForExpressionAddOrMul(term, variableLeftName, listMul)»
									«ENDIF»
								«ENDIF»
								«IF simple_expression.addition_operator.size > 0 && term.multiplication_operator.size == 0»
									«FOR addition_operator: simple_expression.addition_operator»
										«var aux = listSign.add(addition_operator.sign)»
									«ENDFOR»
									«IF term !== null»	
										«loadForExpressionAddOrMul(term, variableLeftName, listSum)»
									«ENDIF»
								«ENDIF»								
							«ENDFOR»
						«ENDIF»
						«storageMUL(listMul, variableLeftName, listSign)»
						«storageSum(listSum, variableLeftName, listSign)»						
					«ENDFOR»					
				«ENDIF»		
			«ENDFOR»
		'''
	
	def storageMUL(List<Integer> listMul, String variableLeftName, List<String> listSign) '''
		«IF listMul.size > 1»
			«FOR i : 1 .. listMul.size-1»
				«IF listSign.get(i-1).equals('*')»
					«getNextLine() + "MUL "+ "R"+listMul.get(0) + ", R"+ listMul.get(0) + ", R" + listMul.get(i)»
				«ENDIF»
				«IF listSign.get(i-1).equals('/') || listSign.get(i-1).equals('div')»
					«getNextLine() + "DIV "+ "R"+listMul.get(0) + ", R"+ listMul.get(0) + ", R" + listMul.get(i)»
				«ENDIF»
			«ENDFOR»
			«getNextLine() + "ST "+ variableLeftName +", R"+ listMul.get(0)»
		«ENDIF»
	'''
		
	def storageSum(List<Integer> listSum, String variableLeftName, List<String> listSign) '''
		«IF listSum.size > 1»
			«FOR i : 1 .. listSum.size-1»
				«IF listSign.get(i-1).equals("+")»
					«getNextLine() + "ADD "+ "R"+listSum.get(0) + ", R"+ listSum.get(0) + ", R" + listSum.get(i)»
				«ENDIF»
				«IF listSign.get(i-1).equals("-")»
					«getNextLine() + "SUB "+ "R"+listSum.get(0) + ", R"+ listSum.get(0) + ", R" + listSum.get(i)»
				«ENDIF»
			«ENDFOR»
			«getNextLine() + "ST "+ variableLeftName +", R"+ listSum.get(0)»
		«ENDIF»
	'''
	
	def loadForExpressionAddOrMul(term term, String variableLeftName, List<Integer> listOperands)'''
		«FOR factor: term.factor»
			«IF factor !== null && factor.variable !== null && factor.variable.entire_variable !== null»
				«var variableRigthName = factor.variable.entire_variable.identifier.identifier»
				«getNextLine() + "LD " + nextReg + ", " + variableRigthName»
				«var aux = listOperands.add(currentReg)»
			«ENDIF»
			« IF factor !== null && factor.identifier !== null»
				«getNextLine() + "LD " + nextReg + ", " + factor.identifier.identifier»
				«var aux = listOperands.add(currentReg)»
			«ENDIF»
			«IF factor !== null && factor.number !== null»	
				«IF factor.number.integer_number !== null»
					«getNextLine() + "LD " + nextReg + ", #" + getIntegerNumber(factor.number.integer_number)»
					«var aux = listOperands.add(currentReg)»
				«ELSE»
					«getNextLine() + "LD " + nextReg + ", #" + getRealNumber(factor.number.real_number)»
					«var aux = listOperands.add(currentReg)»
				«ENDIF»
			«ENDIF»	
			« IF factor !== null && factor.strings !== null»
				«getNextLine() + "LD " + nextReg + ", " +factor.strings»
				«var aux = listOperands.add(currentReg)»
			«ENDIF»		
		«ENDFOR»
	'''
	
	def getCodeExpression(factor factor, String variableLeftName)'''
		«IF factor !== null && factor.variable !== null && factor.variable.entire_variable !== null»
			«var variableRigthName = factor.variable.entire_variable.identifier.identifier»
			«getNextLine() + "ST " + variableLeftName + ", " + variableRigthName»
		«ENDIF»
		« IF factor !== null && factor.identifier !== null»
			«getNextLine() + "ST " + variableLeftName + ", " + factor.identifier.identifier»
		«ENDIF»
		« IF factor !== null && factor.number !== null»
			«IF factor.number.integer_number !== null»
				«getNextLine() + "ST " + variableLeftName + ", #" + getIntegerNumber(factor.number.integer_number)»
			«ELSE»
				«getNextLine() + "ST " +  variableLeftName + ", #" + getRealNumber(factor.number.real_number)»
			«ENDIF»
		«ENDIF»	
		« IF factor !== null && factor.strings !== null»
			«getNextLine() + "ST " + variableLeftName + ", " +factor.strings»
		«ENDIF»
	'''
	
	def getRealNumber(real_number real_number) {
		var output  = "";
		output += getDigitSequence(real_number.digit_sequence);
		
		if (real_number.digit_sequence2 !== null) {
			output += "." + getDigitSequence(real_number.digit_sequence2)
		}		
		if (real_number.scale_factor !== null) {
			output += getScaleFactor(real_number.scale_factor);
		}
		
		return output;
		
	}
	
	def getScaleFactor(scale_factor factor) {
		var output = "";
		output += "e";
		if (factor.sign !== null) {
			output += factor.sign;
		}
		output += getDigitSequence(factor.digit_sequence);
		
	}
	
	def getDigitSequence(digit_sequence digit_sequence) {
		var output = "";
		if (digit_sequence.sign !== null) {
			output += digit_sequence.sign;
		}
		output += digit_sequence.unsigned_digit_sequence;
		
		return output;
	}
	
	def getIntegerNumber(integer_number integer_number) {
		return getDigitSequence(integer_number.digit_sequence);
	}

}