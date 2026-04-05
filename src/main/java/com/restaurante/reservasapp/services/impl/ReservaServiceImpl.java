package com.restaurante.reservasapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.reservasapp.models.Reserva;
import com.restaurante.reservasapp.repository.ReservaRepository;
import com.restaurante.reservasapp.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository repo;

    @Override
    public Reserva guardarReserva(Reserva reserva) {
        return repo.save(reserva);
    }

    @Override
    public Reserva obtenerReserva(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarReserva(String id) {
        repo.deleteById(id);
    }

    @Override
    public List<Reserva> listarReservas() {
        return repo.findAll();
    }

}
