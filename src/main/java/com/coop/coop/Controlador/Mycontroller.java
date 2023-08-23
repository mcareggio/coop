package com.coop.coop.Controlador;

import com.coop.coop.Bbdd.TarifasEnergia;
import com.coop.coop.Bbdd.TarifasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coop")
public class Mycontroller {
    @Autowired
    private TarifasRepository tarifasRepository;

    @GetMapping("/verTarifas")
    public @ResponseBody Iterable<TarifasEnergia> getTarifas(){
        return tarifasRepository.findAll();
    }
}
