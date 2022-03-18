package com.example.demo.controller;

import com.example.demo.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    public SampleService sampleService;

    @GetMapping("/helloservice")
    public String hello() {
        return "Thank you for calling Hello Service";
    }

    @GetMapping("/helloservice/{pathVariable}")
    public String helloWithPath(@PathVariable("pathVariable") String variable) {
        return sampleService.getSampleResponse(variable);
    }

    @GetMapping("/codetype")
    public String getCodeType() {
        return sampleService.getCustomConfigurationValue("codetype");
    }

    @GetMapping("/author")
    public String getCodeAuthor() {
        return sampleService.getCustomConfigurationValue("author");
    }
}