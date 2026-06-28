package com.idat.prestamos.client;
import com.idat.prestamos.dto.LibroDTO; import org.springframework.cloud.openfeign.FeignClient; import org.springframework.web.bind.annotation.*;
@FeignClient(name="libros-service", url="${services.libros.url}") public interface LibroClient{ @GetMapping("/api/libros/{id}") LibroDTO buscarPorId(@PathVariable("id") Long id); }
