package br.com.adesoszasilva.behavioraldesignpatterns.visitor;

public class ExpressionNumber implements Expression {

	private int number;
	
	public ExpressionNumber(int number) {
		this.number = number;
	}

	@Override
	public int evaluate() {
		return number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String accept(PrinterVisitor visitor) {
		return visitor.visitNumber(this);
	}

}
