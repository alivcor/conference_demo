package com.iresium.repository;

import com.iresium.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl {


    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Abhinandan");
        speaker.setLastName("Dubey");

        speakers.add(speaker);
        
    }



}
