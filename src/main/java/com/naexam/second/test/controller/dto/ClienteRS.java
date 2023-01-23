package com.naexam.second.test.controller.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ClienteRS implements Serializable{
    private String cedula;
    private String nombreCompleto;
    private String telefono;
    private String correoElectronico;
}
