package br.com.adesoszasilva.behavioraldesignpatterns.chainofresponsibility;

import com.thoughtworks.xstream.XStream;

public class XmlResponse implements Response {

	private Response anotherResponse;

	public XmlResponse(Response anotherResponse) {
		this.anotherResponse = anotherResponse;
	}

	@Override
	public String response(Request request, Account account) {
		if(request.getType() == RequestType.XML) {
			String xml = new XStream().toXML(account);
			return xml;
		}
		else if(anotherResponse != null)
			return anotherResponse.response(request, account);
		else
			throw new RuntimeException("Invalid request type!");
	}

}
