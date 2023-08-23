package com.coop.coop.Bbdd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias_tarifas")
public class TarifaCategoria {
    @Id
    private Integer id_tarifa;

    private String categoria;

}
