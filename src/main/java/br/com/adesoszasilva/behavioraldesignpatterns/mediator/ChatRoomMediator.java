package br.com.adesoszasilva.behavioraldesignpatterns.mediator;

import java.util.Date;

public class ChatRoomMediator {
	
	public void showMessage(User user, String message){
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}