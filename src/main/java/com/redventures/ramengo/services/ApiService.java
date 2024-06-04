package com.redventures.ramengo.services;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class ApiService {
	
	@Value("${api.url}")
	private String apiUrl;
	
	@Value("${red_ventures.api.key}")
	private String apiKey;
	

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	public String getCodeOrder() { 
		return webClientBuilder.build()
                .post()
                .uri(apiUrl)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header("x-api-key", apiKey)
                .retrieve()
                .bodyToMono(String.class)
                .map(response -> {
                    JSONObject jsonObject = new JSONObject(response);
                    return jsonObject.getString("orderId");
                })
                .block();
	}
	
}
 