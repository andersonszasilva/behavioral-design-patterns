package br.com.adesoszasilva.behavioraldesignpatterns.visitor;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.adesoszasilva.behavioraldesignpatterns.visitor.Expression;
import br.com.adesoszasilva.behavioraldesignpatterns.visitor.ExpressionNumber;
import br.com.adesoszasilva.behavioraldesignpatterns.visitor.Subtract;
import br.com.adesoszasilva.behavioraldesignpatterns.visitor.Sum;

public class ExpressionTest {

	@Test
	public void test() {
		String expression = "((5 - 15) + (1 - 2))";
		
		Expression numericExpression1 = new Subtract(new ExpressionNumber(5), new ExpressionNumber(15));
		Expression numericExpression2 = new Subtract(new ExpressionNumber(1), new ExpressionNumber(2));
		
		Expression numericExpression = new Sum(numericExpression1, numericExpression2);
		
		int result = numericExpression.evaluate();
		String expressionText = numericExpression.accept(new PrinterVisitor());
		
		assertEquals(-11, result);
		assertEquals(expression, expressionText);
	}

}
