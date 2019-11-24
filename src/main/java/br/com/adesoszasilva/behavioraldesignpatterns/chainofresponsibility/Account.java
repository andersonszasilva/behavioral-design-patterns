package br.com.adesoszasilva.behavioraldesignpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class Account {
	
	private String owner;
	private BigDecimal balance;
	
	public Account(String owner, BigDecimal balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}

}
