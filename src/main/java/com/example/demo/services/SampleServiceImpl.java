package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public String getSampleResponse(String name) {
        return "You have invoked GET API with path variable " + name;
    }


}