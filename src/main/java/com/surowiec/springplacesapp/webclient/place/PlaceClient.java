package com.surowiec.springplacesapp.webclient.place;

import com.surowiec.springplacesapp.webclient.place.dto.GooglePlaceDto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PlaceClient {

    private final WebClient webClient = WebClient.create();

    public GooglePlaceDto getPlace(String input) {

        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input{name}" +
                                "&inputtype=textquery&fields=photos,formatted_address,name,rating,opening_hours," +
                                "geometry&key=AIzaSyD6QEsSI4lVS9rXvzISJzfLm6f6ZWVp7II")
                        .build(input))
                .retrieve()
                .bodyToMono(GooglePlaceDto.class)
                .block();
    }
}
