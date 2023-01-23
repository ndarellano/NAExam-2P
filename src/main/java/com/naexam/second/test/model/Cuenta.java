package com.naexam.second.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "cuentas")
public class Cuenta {

    @Id
    private String numeroCuenta;

    private String tipoCuenta;
    private BigDecimal saldoPromedio;
}
