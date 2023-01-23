package com.naexam.second.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface TurnoRepository {
    Turno findByNumeroTurno(String numeroTurno);
}
