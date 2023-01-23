package com.naexam.second.test.controller.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naexam.second.test.service.ClienteService;
import com.naexam.second.test.controller.dto.ClienteDto;
import com.naexam.second.test.model.Cliente;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<ClienterRS> getCliente(String cedula) {
        Cliente cliente = clienteService.getCliente(cedula);
        return ResponseEntity.ok(ClienteMapper.toClienteRS(cliente));
    }



    
}
