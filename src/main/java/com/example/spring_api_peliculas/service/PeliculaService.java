package com.example.spring_api_peliculas.service;

import com.example.spring_api_peliculas.model.Pelicula;
import java.util.List;
import java.util.Optional;

public interface PeliculaService {
    List<Pelicula> obtenerTodas();
    Optional<Pelicula> obtenerPorId(Long id);
    Pelicula crear(Pelicula pelicula);
    Pelicula actualizar(Long id, Pelicula pelicula);
    Pelicula actualizarParcial(Long id, Pelicula datos);
    void eliminar(Long id);
}
