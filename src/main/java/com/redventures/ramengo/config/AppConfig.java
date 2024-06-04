package com.redventures.ramengo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Bean
    WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	}
    
    @Bean
     FilterRegistrationBean<ApiKeyAuthFilter> apiKeyFilter() {
        FilterRegistrationBean<ApiKeyAuthFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ApiKeyAuthFilter());
        registrationBean.addUrlPatterns("/api/*"); 
        return registrationBean;
    }
}
