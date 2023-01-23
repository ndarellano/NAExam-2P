package com.naexam.second.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naexam.second.test.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    Cliente findByCedula(String cedula);
}
