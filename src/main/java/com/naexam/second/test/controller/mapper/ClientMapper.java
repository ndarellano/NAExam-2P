package com.naexam.second.test.controller.mapper;

import com.naexam.second.test.controller.dto.ClienteRS;
import com.naexam.second.test.model.Cliente;

public class ClientMapper {
    public static ClienteRS toClienteRS(Cliente cliente) {
        return ClienteRS.builder()
        .cedula(cliente.getCedula())
        .nombreCompleto(cliente.getNombre() + " " + cliente.getApellido())
        .telefono(cliente.getTelefono())
        .correoElectronico(cliente.getCorreo())
        .build();
    }
}
