package br.com.adesoszasilva.behavioraldesignpatterns.chainofresponsibility;

public class Request {
	
	public RequestType type;
	
	public Request(RequestType type) {
		this.type = type;
	}

	public RequestType getType() {
		return type;
	}

}
