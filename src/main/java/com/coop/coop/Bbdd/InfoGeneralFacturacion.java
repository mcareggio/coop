package com.coop.coop.Bbdd;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="info_general_facturacion")
public class InfoGeneralFacturacion {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Integer mes_periodo;
    private Integer anio_periodo;
    private double fnee;
    private double dc_bancarios;

}
