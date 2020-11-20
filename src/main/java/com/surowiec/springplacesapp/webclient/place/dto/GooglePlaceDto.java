package com.surowiec.springplacesapp.webclient.place.dto;

import java.util.List;

public class GooglePlaceDto {

    private List<GooglePlaceCandidateDto> candidates;


    public List<GooglePlaceCandidateDto> getCandidates() {
        return candidates;
    }
}
