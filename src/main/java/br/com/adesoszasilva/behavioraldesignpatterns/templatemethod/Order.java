package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
	
	private List<Item> items = new ArrayList<Item>();;
	private Double value;
	
	public Order(List<Item> items) {
		this.value = items.stream().mapToDouble(Item::getValor).sum();
		this.items = items; 
	}
	
	public Double getValue() {
		return value;
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}

}
