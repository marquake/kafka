package com.mms.kakfa_consumer;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Usuario")
public class Usuario {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private String domicilio;
    private String dni;

}