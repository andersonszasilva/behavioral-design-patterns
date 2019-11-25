package br.com.adesoszasilva.behavioraldesignpatterns.command;

import static br.com.adesoszasilva.behavioraldesignpatterns.command.OrderStatus.NEW;
import static br.com.adesoszasilva.behavioraldesignpatterns.command.OrderStatus.PAIDOUT;

import java.math.BigDecimal;

public class Order {

	private String customer;
	private BigDecimal value;
	private OrderStatus status;

	public Order(String customer, BigDecimal value) {
		this.customer = customer;
		this.value = value;
		this.status = NEW;
	}

	public void pay() {
		this.status = PAIDOUT;
	}

	public void delivery() {
		this.status = OrderStatus.DELIVERED;
	}

	public String getCustomer() {
		return customer;
	}

	public BigDecimal getValue() {
		return value;
	}

	public OrderStatus getStatus() {
		return status;
	}


}
