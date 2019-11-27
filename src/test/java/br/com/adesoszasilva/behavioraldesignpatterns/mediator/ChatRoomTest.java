package br.com.adesoszasilva.behavioraldesignpatterns.mediator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class ChatRoomTest {

	@Test
	public void test() {
		ChatRoomMediator chatRoom = mock(ChatRoomMediator.class);
		ChatRoomFactory chatRoomFactory = new ChatRoomFactory() {
			@Override
			public ChatRoomMediator createChatRoom() {
				return chatRoom;
			}
		};

		User robert = new User("Robert", chatRoomFactory);
		User john = new User("John", chatRoomFactory);

		String messageRobert = "Hi! John!";
		robert.sendMessage(messageRobert);
		String messageJohn = "Hello! Robert!";
		john.sendMessage(messageJohn);

		verify(chatRoom, times(1)).showMessage(robert, messageRobert);
		Mockito.verify(chatRoom, times(1)).showMessage(john, messageJohn);
	}

}
