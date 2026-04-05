package com.restaurante.reservasapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.reservasapp.models.Usuario;
import com.restaurante.reservasapp.services.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final UsuarioService usuario;

    public UsuarioController(UsuarioService usuario) {
        this.usuario = usuario;
    }

    @PostMapping("/guardar")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return this.usuario.guardarUsuario(usuario);
    }

    @GetMapping("/listar")
    public List<Usuario> getMethodName() {
        return usuario.listarUsuarios();
    }

}
