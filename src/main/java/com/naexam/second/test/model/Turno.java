package com.naexam.second.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "turnos")
public class Turno {
    
    @Id
    private Integer numeroTurno;
    
    private String cedulaCliente;
    private String nombreCliente;
    private String codigoUsuarioEjecutivo;
    private DateTime fechaHoraGeneracion;
    private DateTime fechaHoraInicioAtencion;
    private DateTime fechaHoraFinAtencion;
    private Integer calificacion;

    @Version
    private Long version;
}
    
}
