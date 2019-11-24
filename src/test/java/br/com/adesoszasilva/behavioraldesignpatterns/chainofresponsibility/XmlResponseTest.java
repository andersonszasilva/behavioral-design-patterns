package br.com.adesoszasilva.behavioraldesignpatterns.chainofresponsibility;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class XmlResponseTest {

	private JsonResponse jsonResponse;
	private XmlResponse xmlResponse;
	private String response;
	private Account account;
	private Request request;

	@Test
	public void testResponse() {
		givenReponseType();
		
		whenCallResponse();
		
		thenResponseShouldBe();
	}
	
	private void givenReponseType() {
		xmlResponse = new XmlResponse(null);
		jsonResponse = new JsonResponse(xmlResponse);
		
		account = new Account("Anderson", BigDecimal.valueOf(100000));
		
	}
	
	private void whenCallResponse() {
		request = new Request(RequestType.XML);
		response = jsonResponse.response(request, account);
	}
	
	private void thenResponseShouldBe() {
		assertEquals("<br.com.adesoszasilva.behavioraldesignpatterns.Account>\n" + 
				"  <owner>Anderson</owner>\n" + 
				"  <balance>100000</balance>\n" + 
				"</br.com.adesoszasilva.behavioraldesignpatterns.Account>", response);
	}



}
