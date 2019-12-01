package br.com.adesoszasilva.behavioraldesignpatterns.memento;

import static br.com.adesoszasilva.behavioraldesignpatterns.memento.WaterStates.GAS;
import static br.com.adesoszasilva.behavioraldesignpatterns.memento.WaterStates.LIQUID;
import static br.com.adesoszasilva.behavioraldesignpatterns.memento.WaterStates.SOLID;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterTest {

	private WaterStatesMemento waterStatesMemento;

	@Test
	public void test() {
		Water water = new Water();
		waterStatesMemento = new WaterStatesMemento();
		updateWaterStates(water);
		
		water.warm();
		updateWaterStates(water);
		water.freeze();
		updateWaterStates(water);
		
		assertEquals(LIQUID, waterStatesMemento.getState(0));
		assertEquals(GAS, waterStatesMemento.getState(1));
		assertEquals(SOLID, waterStatesMemento.getState(2));
		
	}

	private void updateWaterStates(Water water) {
		WaterStates state = water.getState();
		waterStatesMemento.addStates(state);
	}

}
