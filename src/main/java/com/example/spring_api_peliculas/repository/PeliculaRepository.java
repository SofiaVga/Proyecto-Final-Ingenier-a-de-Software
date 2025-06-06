package com.example.spring_api_peliculas.repository;

import com.example.spring_api_peliculas.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
}
