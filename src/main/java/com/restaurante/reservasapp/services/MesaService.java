package com.restaurante.reservasapp.services;

import java.util.List;

import com.restaurante.reservasapp.models.Mesa;

public interface MesaService {

    public Mesa guardarMesa(Mesa mesa);

    public Mesa obtenerMesa(String id);

    public void eliminarMesa(String id);

    public List<Mesa> listarMesas();
}
