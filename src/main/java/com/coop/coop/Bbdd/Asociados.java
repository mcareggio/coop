package com.coop.coop.Bbdd;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias_tarifas")
public class Asociados {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_socio;
    private String nombre;
    private String apellido;
    private String calle;
    private Integer numero_calle;
    private char sexo;
    private double capital_acumulado;
}
