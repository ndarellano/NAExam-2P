package com.naexam.second.test.controller.mapper;

import com.naexam.second.test.controller.dto.TurnoRS;
import com.naexam.second.test.model.Turno;

public class TurnoMapper {
    public static TurnoRS toTurnoRS(Turno turno) {
        return TurnoRS.builder()
        .cedula(turno.getCedula())
        .nombreCliente(turno.getNombre() + " " + turno.getApellido())
        .build();
    }
}
