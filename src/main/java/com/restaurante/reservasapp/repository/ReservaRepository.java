package com.restaurante.reservasapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restaurante.reservasapp.models.Reserva;

public interface ReservaRepository extends MongoRepository<Reserva, String> {

}
