package com.restaurante.reservasapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.reservasapp.models.Mesa;
import com.restaurante.reservasapp.services.MesaService;

@RestController
@RequestMapping("mesas")
public class MesaController {

    private final MesaService mesa;

    public MesaController(MesaService mesa) {
        this.mesa = mesa;
    }

    @GetMapping("/listar")
    public List<Mesa> listarMesas() {
        return mesa.listarMesas();
    }

    @PostMapping("/guardar")
    public Mesa guardarMesa(@RequestBody Mesa mesa) {
        return this.mesa.guardarMesa(mesa);
    }

}
