package br.com.adesoszasilva.behavioraldesignpatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyCalcTest {

	@Test
	public void testExecuteStrategy() {
		CalcStrategy subtractStrategy = new CalcStrategy(new OperationSubstract());
		CalcStrategy sumStrategy = new CalcStrategy(new OperationAdd());		
		CalcStrategy multiplyStrategy = new CalcStrategy(new OperationMultiply());
		
		assertEquals(5, subtractStrategy.executeStrategy(10, 5));
		assertEquals(15, sumStrategy.executeStrategy(10, 5));
		assertEquals(50, multiplyStrategy.executeStrategy(10, 5));
				
	}

}
