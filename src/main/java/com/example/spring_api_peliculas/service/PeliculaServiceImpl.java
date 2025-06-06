package com.example.spring_api_peliculas.service;

import com.example.spring_api_peliculas.model.Pelicula;
import com.example.spring_api_peliculas.repository.PeliculaRepository;
import com.example.spring_api_peliculas.exception.RecursoNoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaRepository repo;

    @Override
    public List<Pelicula> obtenerTodas() {
        return repo.findAll();
    }

    @Override
    public Optional<Pelicula> obtenerPorId(Long id) {
        return repo.findById(id);
    }

    @Override
    public Pelicula crear(Pelicula pelicula) {
        return repo.save(pelicula);
    }

    @Override
    public Pelicula actualizar(Long id, Pelicula pelicula) {
        Pelicula existente = repo.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException(id));
        pelicula.setId(id);
        return repo.save(pelicula);
    }

    @Override
    public Pelicula actualizarParcial(Long id, Pelicula datos) {
        Pelicula peli = repo.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException(id));
        if (datos.getTitulo() != null) peli.setTitulo(datos.getTitulo());
        if (datos.getDirector() != null) peli.setDirector(datos.getDirector());
        if (datos.getAnio() != 0) peli.setAnio(datos.getAnio());
        if (datos.getValoracion() != 0) peli.setValoracion(datos.getValoracion());
        return repo.save(peli);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
