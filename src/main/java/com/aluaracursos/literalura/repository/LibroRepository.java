package com.aluaracursos.literalura.repository;

import com.aluaracursos.literalura.modelo.CategoriaIdioma;
import com.aluaracursos.literalura.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    Optional<Libro> findLibroBytitulo(String titulo);
    List<Libro> findLibrosByidioma(CategoriaIdioma idioma);
}
