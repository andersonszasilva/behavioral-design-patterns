package br.com.adesoszasilva.behavioraldesignpatterns.state;

public class OnApprovalStatus implements OrderStatus {

	@Override
	public void giveDiscount(Order order) {
		order.value -= order.value * 0.05;

	}

}
