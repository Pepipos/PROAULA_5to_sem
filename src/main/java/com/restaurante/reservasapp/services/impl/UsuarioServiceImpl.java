package com.restaurante.reservasapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.restaurante.reservasapp.models.Usuario;
import com.restaurante.reservasapp.repository.UsuarioRepository;
import com.restaurante.reservasapp.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        usuario.setRol("USER");
        return repo.save(usuario);
    }

    @Override
    public Usuario obtenerUsuario(String id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminarUsuario(String id) {
        repo.deleteById(id);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return repo.findAll();
    }

}
