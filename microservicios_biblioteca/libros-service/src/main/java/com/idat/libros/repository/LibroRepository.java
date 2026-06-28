package com.idat.libros.repository;
import com.idat.libros.model.Libro; import org.springframework.data.jpa.repository.JpaRepository;
public interface LibroRepository extends JpaRepository<Libro, Long>{}
