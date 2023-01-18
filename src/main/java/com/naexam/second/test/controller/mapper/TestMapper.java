package com.naexam.second.test.controller.mapper;

import com.naexam.second.test.controller.dto.TestRS;
import com.naexam.second.test.model.test;

public class TestMapper {
    public static TestRS toTestRS(test test) {
        return TestRS.builder()
                .email(test.getEmail())
                .username(test.getUsername())
                .build();
    }    
    
}
