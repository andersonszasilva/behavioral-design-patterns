package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

public class IKCV extends TaxTemplate {

	@Override
	public Double calculateTaxMaximumRate(Order order) {
		return order.getValue() * 0.10;
	}

	@Override
	public Double calculateTaxMinimumRate(Order order) {
		return order.getValue() * 0.06;
	}

	@Override
	public boolean shouldUseTaxMaximumRate(Order order) {
		boolean orderValueMoreThanFiveHundred = order.getValue() > 500;
		boolean hasItemMoreThanOneHundred = order.getItems().stream().anyMatch(item -> item.getValor() > 100);
				
		return orderValueMoreThanFiveHundred && hasItemMoreThanOneHundred;
	}


}
