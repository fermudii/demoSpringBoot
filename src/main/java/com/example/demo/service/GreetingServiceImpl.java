package com.example.demo.service;

import com.example.demo.dao.GreetingRepository;
import com.example.demo.model.entity.GreetingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Autowired
    GreetingRepository greetingRepository;

    @Override
    public GreetingEntity getById(int id) {
        return greetingRepository.findById(id);
    }
}
