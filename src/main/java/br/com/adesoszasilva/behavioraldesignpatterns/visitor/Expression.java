package br.com.adesoszasilva.behavioraldesignpatterns.visitor;

public interface Expression {

	int evaluate();
	String accept(PrinterVisitor visitor);

}
