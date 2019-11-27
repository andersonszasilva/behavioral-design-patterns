package br.com.adesoszasilva.behavioraldesignpatterns.mediator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class ChatRoomMedidatorTest {

	@Test
	public void test() {
		ChatRoomMediator mediator = mock(ChatRoomMediator.class);
		User robert = new User("Robert", mediator);
		User john = new User("John", mediator);

		String messageRobert = "Hi! John!";
		robert.sendMessage(messageRobert);
		String messageJohn = "Hello! Robert!";
		john.sendMessage(messageJohn);

		verify(mediator, times(1)).showMessage(robert, messageRobert);
		verify(mediator, times(1)).showMessage(john, messageJohn);
	}

}
