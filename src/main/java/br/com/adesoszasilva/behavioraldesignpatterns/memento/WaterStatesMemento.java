package br.com.adesoszasilva.behavioraldesignpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class WaterStatesMemento {

	private List<WaterStates> states = new ArrayList<>();

	public void addStates(WaterStates state) {
		states.add(state);
	}
	
	public WaterStates getState(int index) {
		return states.get(index);
	}

}
