package br.com.adesoszasilva.behavioraldesignpatterns.chainofresponsibility;

public interface Response {
	
	String response(Request request, Account account);

}
