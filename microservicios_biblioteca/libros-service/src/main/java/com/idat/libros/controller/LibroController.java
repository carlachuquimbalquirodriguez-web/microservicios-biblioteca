package com.idat.libros.controller;
import com.idat.libros.dto.LibroDTO; import com.idat.libros.service.LibroService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/libros") public class LibroController{
 private final LibroService service; public LibroController(LibroService service){this.service=service;}
 @GetMapping public List<LibroDTO> listar(){return service.listar();}
 @GetMapping("/{id}") public ResponseEntity<LibroDTO> buscar(@PathVariable Long id){return service.buscar(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public ResponseEntity<LibroDTO> guardar(@RequestBody LibroDTO dto){return new ResponseEntity<>(service.guardar(dto), HttpStatus.CREATED);} 
 @PutMapping("/{id}") public ResponseEntity<LibroDTO> actualizar(@PathVariable Long id,@RequestBody LibroDTO dto){return service.actualizar(id,dto).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id){return service.eliminar(id)?ResponseEntity.noContent().build():ResponseEntity.notFound().build();}
}
