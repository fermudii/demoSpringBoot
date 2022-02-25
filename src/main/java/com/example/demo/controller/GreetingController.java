package com.example.demo.controller;

import com.example.demo.model.entity.GreetingEntity;
import com.example.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;


    @GetMapping("/{id}")
    public GreetingEntity getGreetingById(@PathVariable("id") int id) {
        return greetingService.getById(id);
    }
}
