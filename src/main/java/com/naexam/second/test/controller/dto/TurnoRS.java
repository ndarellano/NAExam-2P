package com.naexam.second.test.controller.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class TurnoRS implements Serializable {
    private Integer numeroTurno;
    private DateTime fechaHoraGeneracion;
    private String nombreCliente;
    private String codigoUsuarioEjecutivo;
}
