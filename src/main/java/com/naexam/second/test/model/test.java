package com.naexam.second.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "test")
@CompoundIndexes(
        @CompoundIndex(name = "idex_mailusername", def = "{'email': 1, 'username': 1}", unique = true)
)
public class test {
    @Id
    private String id;
    private String email;
    private String username;

    @Indexed
    private String birthdate;
    private String nombre;
    private String apellido;

    @Version
    private Long version;
}
