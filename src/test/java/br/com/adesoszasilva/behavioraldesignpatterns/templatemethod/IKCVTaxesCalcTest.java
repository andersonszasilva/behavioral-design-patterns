package br.com.adesoszasilva.behavioraldesignpatterns.templatemethod;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class IKCVTaxesCalcTest {

	@Test
	public void testCalculateICPPTaxMinimumRate() {
		Order order = new Order(Arrays.asList(new Item("Item 1", 250.0),
				new Item("Item 2", 250.0)
				));
		
		Double taxValue = new TaxesCalc().calculate(order, new IKCV());
		assertEquals(taxValue, 30, 0.01);
	}
	
	@Test
	public void testCalculateICPPTaxMaximumRate() {
		Order order = new Order(Arrays.asList(new Item("Item 1", 250.0),
				new Item("Item 2", 260.0)
				));
		
		Double taxValue = new TaxesCalc().calculate(order, new IKCV());
		assertEquals(taxValue, 51, 0.01);
	}

}
