package com.coop.coop.Bbdd;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_usuario;
    private Integer ruta;
    private Integer folio;
    private String nombre_adicional;
    private String calle_entrega;
    private Integer numero_entrega;
    @OneToOne
    @JoinColumn(name="id_tarifa")
    private TarifaCategoria tarifaCategoria;
    @ManyToOne
    @JoinColumn(name = "id_socio")
    private Asociados asociados;




}
