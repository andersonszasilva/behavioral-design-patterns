package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ICPPTaxesCalcTest {

	@Test
	public void testCalculateICPPTaxMinimumRate() {
		Order order = new Order(Arrays.asList(new Item("Item 1", 250.0),
				new Item("Item 2", 240.0)
				));
		
		Double taxValue = new TaxesCalc().calculate(order, new ICPP());
		assertEquals(taxValue, 24.5, 0.01);
	}
	
	@Test
	public void testCalculateICPPTaxMaximumRate() {
		Order order = new Order(Arrays.asList(new Item("Item 1", 250.0),
				new Item("Item 2", 250.0)
				));
		
		Double taxValue = new TaxesCalc().calculate(order, new ICPP());
		assertEquals(taxValue, 35, 0.01);
	}

}
