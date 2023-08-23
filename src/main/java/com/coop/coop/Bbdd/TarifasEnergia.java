package com.coop.coop.Bbdd;

import jakarta.persistence.*;

@Entity
public class TarifasEnergia
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer tope_menor;
    private Integer tope_mayor;


    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private TarifaCategoria tarifaCategoria;
    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTope_menor() {
        return tope_menor;
    }

    public Integer getTope_mayor() {
        return tope_mayor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTope_menor(Integer tope_menor) {
        this.tope_menor = tope_menor;
    }

    public void setTope_mayor(Integer tope_mayor) {
        this.tope_mayor = tope_mayor;
    }
}
