package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

public class ICPP extends TaxTemplate {

	@Override
	public Double calculateTaxMaximumRate(Order order) {
		return order.getValue() * 0.07;
	}

	@Override
	public Double calculateTaxMinimumRate(Order order) {
		return order.getValue() * 0.05;
	}

	@Override
	public boolean shouldUseTaxMaximumRate(Order order) {
		return order.getValue() >= 500.0;
	}

}
