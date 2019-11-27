package br.com.adesoszasilva.behavioraldesignpatterns.mediator;

public class User {

	private String name;
	private ChatRoomMediator chatRoom;
	
	public User(String name, ChatRoomFactory chatRoomFactory) {
		this.name = name;
		this.chatRoom = chatRoomFactory.createChatRoom();
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		chatRoom.showMessage(this, message);
	}

}
