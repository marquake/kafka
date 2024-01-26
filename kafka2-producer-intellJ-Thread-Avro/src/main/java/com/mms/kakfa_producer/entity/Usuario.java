package com.mms.kakfa_producer.entity;

import lombok.Data;

@Data
public class Usuario {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private String domicilio;
    private String dni;

}