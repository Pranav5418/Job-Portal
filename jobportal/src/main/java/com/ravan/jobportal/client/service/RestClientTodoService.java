
package com.ravan.jobportal.client.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestClientTodoService {

    private final RestClient restClient;

    public RestClientTodoService(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .defaultHeader("Accept", "application/json")
                .build();
    }
}
