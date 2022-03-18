package com.example.demo.services;

import com.example.demo.configuration.CustomConfigurationSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    CustomConfigurationSample customConfigurationSample;

    @Override
    public String getSampleResponse(String name) {
        return "You have invoked GET API with path variable " + name;
    }

    @Override
    public String getCustomConfigurationValue(String attr) {
        if (attr.equalsIgnoreCase("codetype"))
            return "Required value of the property code.type is " + customConfigurationSample.getType();
        else if (attr.equalsIgnoreCase("author"))
            return "Required value of the property code.author is " + customConfigurationSample.getAuthor();
        else
            return "There is no such properties";
    }


}