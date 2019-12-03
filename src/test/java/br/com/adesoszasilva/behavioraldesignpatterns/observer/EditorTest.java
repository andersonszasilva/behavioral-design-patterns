package br.com.adesoszasilva.behavioraldesignpatterns.observer;

import static org.junit.Assert.fail;

import org.junit.Test;

public class EditorTest {


	@Test
	public void test() {
		Editor editor = new Editor();
		editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			fail("Error" + e.getMessage());
		}
	}
}