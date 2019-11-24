package br.com.adesoszasilva.behavioraldesignpatterns.chainofresponsibility;

import com.google.gson.Gson;

public class JsonResponse implements Response {

	private Response anotherResponse;

	public JsonResponse(Response anotherResponse) {
		this.anotherResponse = anotherResponse;
	}

	@Override
	public String response(Request request, Account account) {
		if(request.getType() == RequestType.JSON) {
			String json = new Gson().toJson(account);
			return json;
		}
		else if(anotherResponse != null) 
			return anotherResponse.response(request, account);
		else 
			throw new RuntimeException("Invalid request type!");


	}

}
