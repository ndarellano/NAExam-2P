package com.naexam.second.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naexam.second.test.controller.dto.TestRS;
import com.naexam.second.test.controller.mapper.TestMapper;
import com.naexam.second.test.model.test;
import com.naexam.second.test.service.TestService;

@RestController
@RequestMapping("/api/test")
public class TestController {
    
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping()
    public ResponseEntity<List<TestRS>> getTest() {
        List<test> testList = testService.findAll();
        List<TestRS> testRSList = new ArrayList<>();
        if(testList == null || testList.isEmpty())
            return ResponseEntity.noContent().build();
            
        for (test test : testList) {
            testRSList.add(TestMapper.toTestRS(test));
        }
        return ResponseEntity.ok(testRSList);
    }

}
