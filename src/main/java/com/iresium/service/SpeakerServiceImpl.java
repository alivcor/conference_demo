package com.iresium.service;

import com.iresium.model.Speaker;
import com.iresium.repository.HibernateSpeakerRepositoryImpl;
import com.iresium.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
