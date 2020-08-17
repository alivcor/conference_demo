package com.iresium.service;

import com.iresium.model.Speaker;
import com.iresium.repository.HibernateSpeakerRepositoryImpl;
import com.iresium.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
