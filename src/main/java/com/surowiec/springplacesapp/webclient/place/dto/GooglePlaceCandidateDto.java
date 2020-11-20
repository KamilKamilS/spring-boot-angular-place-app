package com.surowiec.springplacesapp.webclient.place.dto;

public class GooglePlaceCandidateDto {

    private GooglePlaceGeometryDto geometry;
    private String formatted_address;
    private String name;
    private float rating;

    public GooglePlaceGeometryDto getGeometry() {
        return geometry;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public String getName() {
        return name;
    }
}
