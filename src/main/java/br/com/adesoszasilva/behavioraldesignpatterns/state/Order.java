package br.com.adesoszasilva.behavioraldesignpatterns.state;

public class Order {

	protected double value;
	private OrderStatus status;

	public Order(double value) {
		this.value = value;
		this.status = new OnApprovalStatus();
	}

	public void giveDiscount() {
		status.giveDiscount(this);
	}

	public void approve() {
		this.status = new ApprovedStatus();
	}

	public void finish() {
		this.status = new FinishedStatus();

	}

	public void disapprove() {
		this.status = new DisapprovedStatus();
	}


}
