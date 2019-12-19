package br.com.adesoszasilva.behavioraldesignpatterns.state;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderStatusTest {

	@Test
	public void shouldGiveDiscountToOrderOnApproval() {
		Order order = new Order(100);
		order.giveDiscount();
		
		assertEquals(95, order.value, 0.001);
	}
	
	@Test
	public void shouldGiveDiscountToApprovedOrder() {
		Order order = new Order(100);
		order.approve();
		order.giveDiscount();
		
		assertEquals(98, order.value, 0.001);
	}
	
	@Test(expected = RuntimeException.class)
	public void shoulNotGiveDiscountToFinishedOrder() {
		Order order = new Order(100);
		order.finish();
		order.giveDiscount();
	}
	
	@Test(expected = RuntimeException.class)
	public void shoulNotGiveDiscountToDisapprovedOrder() {
		Order order = new Order(100);
		order.disapprove();
		order.giveDiscount();
	}
	

}
