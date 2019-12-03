package br.com.adesoszasilva.behavioraldesignpatterns.observer;

import java.io.File;

public interface EventListener {

	void update(String eventType, File file);

}
