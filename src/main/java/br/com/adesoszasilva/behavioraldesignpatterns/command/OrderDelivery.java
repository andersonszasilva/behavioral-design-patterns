package br.com.adesoszasilva.behavioraldesignpatterns.command;

public class OrderDelivery implements Command {

	private Order order;

	public OrderDelivery(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		order.delivery();

	}

}
