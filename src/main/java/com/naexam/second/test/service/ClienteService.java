package com.naexam.second.test.controller.dto;

import org.springframework.stereotype.Service;

import com.naexam.second.test.model.Cliente;
import com.naexam.second.test.repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void crearCliente(Cliente cliente) {
        cliente.setNombre(cliente.getNombre());
        cliente.setApellido(cliente.getApellido());
        if(cliente.getFechaNacimiento().after(new Date())){
            throw new RuntimeException("La fecha de nacimiento es invalida "+ cliente.getFechaNacimiento());
        } else {
            cliente.setFechaNacimiento(cliente.getFechaNacimiento());
        }
        cliente.setDireccion(cliente.getDireccion());
        cliente.setTelefono(cliente.getTelefono());
        cliente.setCorreo(cliente.getCorreo());
        this.clienteRepository.findByCedula(cliente.getCedula()).ifPresent(c -> {
            throw new RuntimeException("Ya existe un cliente con la cedula "+ cliente.getCedula());
        });
        this.clienteRepository.save(cliente);
    }

    public Cliente findByCedula(String cedula) {
        Optional<Cliente> clienteOPt = this.clienteRepository.findByCedula(cedula);
        if(clienteOPt.isPresent()){
            return clienteOPt.get();
        } else {
            throw new RuntimeException("No existe un cliente con la cedula "+ cedula);
        }
    }
}
