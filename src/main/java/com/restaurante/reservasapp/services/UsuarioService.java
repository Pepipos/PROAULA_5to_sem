package com.restaurante.reservasapp.services;

import java.util.List;

import com.restaurante.reservasapp.models.Usuario;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario);

    public Usuario obtenerUsuario(String id);

    public void eliminarUsuario(String id);

    public List<Usuario> listarUsuarios();

}
