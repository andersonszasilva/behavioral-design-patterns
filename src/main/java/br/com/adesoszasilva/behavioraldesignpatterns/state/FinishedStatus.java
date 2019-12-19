package br.com.adesoszasilva.behavioraldesignpatterns.state;

public class FinishedStatus implements OrderStatus {

	@Override
	public void giveDiscount(Order order) {
		throw new RuntimeException("It's not possible to give discount to finished orders");
	}

}
