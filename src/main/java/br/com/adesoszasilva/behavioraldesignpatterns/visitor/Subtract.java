package br.com.adesoszasilva.behavioraldesignpatterns.visitor;

public class Subtract implements Expression {

	private Expression expressionLeft;
	private Expression expressionRight;

	public Subtract(Expression expressionLeft, Expression expressionRight) {
		this.expressionLeft = expressionLeft;
		this.expressionRight = expressionRight;
	}


	@Override
	public int evaluate() {
		int left = expressionLeft.evaluate();
		int right = expressionRight.evaluate();
		
		return left - right;
	}


	@Override
	public String accept(PrinterVisitor visitor) {
		return visitor.visitSubtract(this);
		
	}
	
	public Expression getExpressionLeft() {
		return expressionLeft;
	}
	
	public Expression getExpressionRight() {
		return expressionRight;
	}

}
