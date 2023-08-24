package com.coop.coop.modelo;

import com.coop.coop.Bbdd.EstadosRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Estados {
    @Autowired
    private EstadosRepository estadosRepository;
    public Integer[] getEstadoActual() {
    Integer[] periodo={07,2023};
        return periodo;
    }

}
