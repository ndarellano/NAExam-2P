package com.naexam.second.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naexam.second.test.model.test;

public interface testRepository extends MongoRepository<test, String> {
    test findByEmail(String email);
    test findByUsername(String username);
    List<test> findByNombre(String nombre);
}