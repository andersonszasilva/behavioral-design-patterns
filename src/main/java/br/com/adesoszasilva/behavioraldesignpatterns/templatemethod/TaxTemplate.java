package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

public abstract class TaxTemplate implements Tax {
	
	@Override
	public Double calculate(Order order) {
		if(shouldUseTaxMaximumRate(order)) return calculateTaxMaximumRate(order);
		else return calculateTaxMinimumRate(order);
	}
	
	public abstract Double calculateTaxMaximumRate(Order order);
	public abstract Double calculateTaxMinimumRate(Order order);
	public abstract boolean shouldUseTaxMaximumRate(Order order);

}
