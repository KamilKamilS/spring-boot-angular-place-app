package com.surowiec.springplacesapp.controller;

import com.surowiec.springplacesapp.service.GooglePlaceService;
import com.surowiec.springplacesapp.webclient.place.PlaceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

    private final GooglePlaceService placeService;

    public PlaceController(GooglePlaceService placeService) {
        this.placeService = placeService;
    }


    @GetMapping("/place")
    public String getPlace() {
        return placeService.getPlace("Warszawa stadion narodowy");
    }


}
