package com.example.spring_api_peliculas.exception;

public class RecursoNoEncontradoException extends RuntimeException {
    public RecursoNoEncontradoException(Long id) {
        super("No se encontró la película con ID: " + id);
    }
}
