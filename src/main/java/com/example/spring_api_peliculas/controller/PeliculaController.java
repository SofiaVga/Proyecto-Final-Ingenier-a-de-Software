package com.example.spring_api_peliculas.controller;

import com.example.spring_api_peliculas.model.Pelicula;
import com.example.spring_api_peliculas.service.PeliculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService service;

    @GetMapping
    public List<Pelicula> obtenerTodas() {
        return service.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pelicula> crear(@Valid @RequestBody Pelicula pelicula) {
        return new ResponseEntity<>(service.crear(pelicula), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pelicula> actualizar(@PathVariable Long id, @Valid @RequestBody Pelicula pelicula) {
        return ResponseEntity.ok(service.actualizar(id, pelicula));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Pelicula> actualizarParcial(@PathVariable Long id, @RequestBody Pelicula datos) {
        return ResponseEntity.ok(service.actualizarParcial(id, datos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
