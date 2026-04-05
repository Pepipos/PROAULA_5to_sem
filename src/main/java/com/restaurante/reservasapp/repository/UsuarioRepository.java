package com.restaurante.reservasapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.restaurante.reservasapp.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Optional<Usuario> findByCorreo(String correo);
}
