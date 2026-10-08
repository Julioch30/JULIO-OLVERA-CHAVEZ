package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/empleos")
public class EmpleoController {

    @GetMapping("/prueba")
    public Map<String, String> obtenerEmpleoPrueba() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("estatus", "exito");
        respuesta.put("mensaje", "El endpoint de empleos está funcionando correctamente.");
        respuesta.put("plataforma", "Power You");
        respuesta.put("puesto_disponible", "Practicante de Desarrollo Backend");
        
        return respuesta;
    }
}