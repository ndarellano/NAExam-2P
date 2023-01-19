package com.naexam.second.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "atencionclientes")

public class AtencionCliente {
    
    @Id
    private String codigoUsuario;

    private String nombreCompleto;
    private Integer numeroEscritorioAsignado;

    @Version
    private Long version;
}
