package com.idat.prestamos.controller;
import com.idat.prestamos.dto.*; import com.idat.prestamos.service.PrestamoService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/prestamos") public class PrestamoController{
 private final PrestamoService service; public PrestamoController(PrestamoService service){this.service=service;}
 @GetMapping public List<PrestamoDTO> listar(){return service.listar();}
 @GetMapping("/{id}") public ResponseEntity<PrestamoDTO> buscar(@PathVariable Long id){return service.buscar(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @GetMapping("/{id}/detalle") public ResponseEntity<PrestamoDetalleDTO> detalle(@PathVariable Long id){return service.detalle(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @PostMapping public ResponseEntity<PrestamoDTO> guardar(@RequestBody PrestamoDTO dto){return new ResponseEntity<>(service.guardar(dto), HttpStatus.CREATED);} 
 @PutMapping("/{id}") public ResponseEntity<PrestamoDTO> actualizar(@PathVariable Long id,@RequestBody PrestamoDTO dto){return service.actualizar(id,dto).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
 @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id){return service.eliminar(id)?ResponseEntity.noContent().build():ResponseEntity.notFound().build();}
}
