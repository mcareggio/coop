package com.coop.coop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coop")
public class Mycontroller {
    @Autowired
    private TarifasRepository tarifasRepository;

    @GetMapping("/verTarifas")
    public String getTarifas(){
        String cadena="";
        Iterable<TarifasEnergia> iterable_tarifas=tarifasRepository.findAll();
        for (TarifasEnergia iterableTarifa : iterable_tarifas) {
            System.out.println(iterableTarifa.getNombre());
        }
        return "it works";
    }
}
