package com.surowiec.springplacesapp.service;

import com.surowiec.springplacesapp.webclient.place.PlaceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GooglePlaceService {

    private PlaceClient placeClient;

    @Autowired
    public GooglePlaceService(PlaceClient placeClient) {
        this.placeClient = placeClient;
    }

    public String getPlace(String input) {
        return placeClient.getPlace(input).toString();
    }



}
