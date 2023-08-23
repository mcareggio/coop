package com.coop.coop.Bbdd;

import jakarta.persistence.*;

@Entity
@Table(name="Estados")
public class Estados {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_estado;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios usuario;
    private Integer mes_periodo;
    private Integer anio_periodo;
    private String fecha;
    private String hora;
    private Integer estado;
}
