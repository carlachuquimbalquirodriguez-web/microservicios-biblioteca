package com.idat.prestamos.repository;
import com.idat.prestamos.model.Prestamo; import org.springframework.data.jpa.repository.JpaRepository;
public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{}
