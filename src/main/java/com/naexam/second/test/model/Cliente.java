package com.naexam.second.test.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "clientes")
public class Cliente {
    
    @Id
    private String cedula;
    
    private String nombres; 
    private String apellidos;
    private Date fechaNacimiento;
    private String direccionPrincipal;
    private String telefono;
    private String correoElectronico;

    private List<Cuenta>cuentas;

    @Version
    private Long version;
}
