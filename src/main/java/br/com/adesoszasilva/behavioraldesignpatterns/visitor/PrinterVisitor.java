package br.com.adesoszasilva.behavioraldesignpatterns.visitor;

public class PrinterVisitor {

	public String visitSum(Sum sum) {
		StringBuilder str = new StringBuilder("");
		str.append("(");
		str.append(sum.getExpressionLeft().accept(this));
		str.append(" + ");
		str.append(sum.getExpressionRight().accept(this));
		str.append(")");
		
		return str.toString();

	}

	public String visitSubtract(Subtract subtract) {
		StringBuilder str = new StringBuilder("");
		str.append("(");
		str.append(subtract.getExpressionLeft().accept(this));
		str.append(" - ");
		str.append(subtract.getExpressionRight().accept(this));
		str.append(")");
		return str.toString();
	}

	public String visitNumber(ExpressionNumber number) {
		return String.valueOf(number.getNumber());

	}
}