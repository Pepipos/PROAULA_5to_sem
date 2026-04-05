package com.restaurante.reservasapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.reservasapp.models.Mesa;
import com.restaurante.reservasapp.repository.MesaRepository;
import com.restaurante.reservasapp.services.MesaService;

@Service
public class MesaServiceImpl implements MesaService {

    @Autowired
    private MesaRepository repo;

    @Override
    public Mesa guardarMesa(Mesa mesa) {
        return repo.save(mesa);

    }

    @Override
    public Mesa obtenerMesa(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarMesa(String id) {
        repo.deleteById(id);
    }

    @Override
    public List<Mesa> listarMesas() {
        return repo.findAll();
    }

}
