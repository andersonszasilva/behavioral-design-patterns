package br.com.adesoszasilva.behavioraldesignpatterns.command;

import static br.com.adesoszasilva.behavioraldesignpatterns.command.OrderStatus.DELIVERED;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class WorkFlowTest {

	@Test
	public void testProcess() {
		WorkFlow workFlow = new WorkFlow();
		Order order = new Order("Anderson", BigDecimal.valueOf(1000));
		workFlow.addCommands(new PayOrder(order));
		workFlow.addCommands(new OrderDelivery(order));
		
		workFlow.process();
		
		assertEquals(order.getStatus(), DELIVERED);
	}

}
