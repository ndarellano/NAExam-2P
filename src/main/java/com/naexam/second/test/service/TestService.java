package com.naexam.second.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.naexam.second.test.model.test;
import com.naexam.second.test.repository.testRepository;

@Service
public class TestService {
   
    private final testRepository testRepository;

    public TestService(testRepository testRepository) {
         this.testRepository = testRepository;
    }

    public void save(test test) {
        testRepository.save(test);
    }

    public test findByEmail(String email) {
        return testRepository.findByEmail(email);
    }

    public test findByUsername(String username) {
        return testRepository.findByUsername(username);
    }

    public List<test> findByNombre(String nombre) {
        return testRepository.findByNombre(nombre);
    }

    public void delete(test test) {
        testRepository.delete(test);
    }

    public List<test> findAll() {
        return testRepository.findAll();
    }

    public test findById(String id) {
        return testRepository.findById(id).orElse(null);
    }
}
