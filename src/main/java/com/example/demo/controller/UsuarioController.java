package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @GetMapping("/prueba")
    public Map<String, String> obtenerUsuarioPrueba() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("estatus", "exito");
        respuesta.put("mensaje", "El endpoint de usuarios está funcionando correctamente.");
        respuesta.put("usuario_prueba", "Julio");
        respuesta.put("rol", "Desarrollador");
        
        return respuesta;
    }
}