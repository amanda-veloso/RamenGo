package com.redventures.ramengo.services;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class ApiService {
	
	private final String API_URL = "https://api.tech.redventures.com.br/orders/generate-id";
    private final String API_KEY = "ZtVdh8XQ2U8pWI2gmZ7f796Vh8GllXoN7mr0djNf";

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	public String getCodeOrder() { 
		return webClientBuilder.build()
                .post()
                .uri(API_URL)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header("x-api-key", API_KEY)
                .retrieve()
                .bodyToMono(String.class)
                .map(response -> {
                    JSONObject jsonObject = new JSONObject(response);
                    return jsonObject.getString("orderId");
                })
                .block();
	}
	
}
 