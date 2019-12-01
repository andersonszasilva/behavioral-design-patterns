package br.com.adesoszasilva.behavioraldesignpatterns.memento;

import static br.com.adesoszasilva.behavioraldesignpatterns.memento.WaterStates.GAS;
import static br.com.adesoszasilva.behavioraldesignpatterns.memento.WaterStates.LIQUID;
import static br.com.adesoszasilva.behavioraldesignpatterns.memento.WaterStates.SOLID;

public class Water {
	
	private WaterStates state = LIQUID;
	
	public void warm() {
		if(state == LIQUID) this.state = GAS;
		else if (state == SOLID) this.state = LIQUID;
	}
	
	public void freeze() {
		this.state = WaterStates.SOLID;
	}
	
	public WaterStates getState() {
		return state;
	}
	
}
