package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

public class TaxesCalc {
	
	public Double calculate(Order order, Tax tax) {
		return tax.calculate(order);
	}

}
