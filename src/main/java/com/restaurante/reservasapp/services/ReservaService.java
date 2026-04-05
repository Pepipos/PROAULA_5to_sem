package com.restaurante.reservasapp.services;

import java.util.List;

import com.restaurante.reservasapp.models.Reserva;

public interface ReservaService {

    public Reserva guardarReserva(Reserva reserva);

    public Reserva obtenerReserva(String id);

    public void eliminarReserva(String id);

    public List<Reserva> listarReservas();

}
