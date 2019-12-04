package br.com.adesoszasilva.behavioraldesignpatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyCalcTest {

	@Test
	public void testExecuteStrategy() {
		StrategyCalc subtractStrategy = new StrategyCalc(new OperationSubstract());
		StrategyCalc sumStrategy = new StrategyCalc(new OperationAdd());		
		StrategyCalc multiplyStrategy = new StrategyCalc(new OperationMultiply());
		
		assertEquals(5, subtractStrategy.executeStrategy(10, 5));
		assertEquals(15, sumStrategy.executeStrategy(10, 5));
		assertEquals(50, multiplyStrategy.executeStrategy(10, 5));
				
	}

}
