package br.com.adesoszasilva.behavioraldesignpatterns.iterator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IteratorTest {

	private List<Customer> customers;

	@Test
	public void test() {
		customers = Arrays.asList(
				new Customer("Anderson"),
				new Customer("João"),
				new Customer("Maria")
				);
		
		List<String> customerNames = new ArrayList<String>();
		Iterator<Customer> iterator = customers.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next().getName();
			customerNames.add(name);
		}
		
		assertEquals(getCustomerNameByPosition(0), "Anderson");
		assertEquals(getCustomerNameByPosition(1), "João");
		assertEquals(getCustomerNameByPosition(2), "Maria");

	}

	private String getCustomerNameByPosition(int position) {
		return customers.get(position).getName();
	}

}
