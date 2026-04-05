package com.restaurante.reservasapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restaurante.reservasapp.models.Mesa;

public interface MesaRepository extends MongoRepository<Mesa, String> {

}
