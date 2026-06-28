package com.idat.prestamos.service;

import com.idat.prestamos.client.LibroClient;
import com.idat.prestamos.dto.LibroDTO;
import com.idat.prestamos.dto.PrestamoDTO;
import com.idat.prestamos.dto.PrestamoDetalleDTO;
import com.idat.prestamos.mapper.PrestamoMapper;
import com.idat.prestamos.repository.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PrestamoService {

 private final PrestamoRepository repo;
 private final PrestamoMapper mapper;
 private final LibroClient libroClient;

 public PrestamoService(PrestamoRepository repo, PrestamoMapper mapper, LibroClient libroClient) {
  this.repo = repo;
  this.mapper = mapper;
  this.libroClient = libroClient;
 }

 public List<PrestamoDTO> listar() {
  return repo.findAll()
          .stream()
          .map(mapper::toDTO)
          .collect(Collectors.toList());
 }

 public Optional<PrestamoDTO> buscar(Long id) {
  return repo.findById(id)
          .map(mapper::toDTO);
 }

 public PrestamoDTO guardar(PrestamoDTO dto) {
  return mapper.toDTO(repo.save(mapper.toEntity(dto)));
 }

 public Optional<PrestamoDTO> actualizar(Long id, PrestamoDTO dto) {
  return repo.findById(id).map(prestamo -> {
   prestamo.setLibroId(dto.getLibroId());
   prestamo.setNombreCliente(dto.getNombreCliente());
   prestamo.setFechaPrestamo(dto.getFechaPrestamo());
   prestamo.setFechaDevolucion(dto.getFechaDevolucion());
   prestamo.setEstado(dto.getEstado());

   return mapper.toDTO(repo.save(prestamo));
  });
 }

 public boolean eliminar(Long id) {
  if (!repo.existsById(id)) {
   return false;
  }

  repo.deleteById(id);
  return true;
 }

 public Optional<PrestamoDetalleDTO> detalle(Long id) {
  return repo.findById(id).map(prestamo -> {

   LibroDTO libro = libroClient.buscarPorId(prestamo.getLibroId());

   PrestamoDetalleDTO detalle = new PrestamoDetalleDTO();
   detalle.setId(prestamo.getId());
   detalle.setNombreCliente(prestamo.getNombreCliente());
   detalle.setFechaPrestamo(prestamo.getFechaPrestamo());
   detalle.setFechaDevolucion(prestamo.getFechaDevolucion());
   detalle.setEstado(prestamo.getEstado());
   detalle.setLibro(libro);

   return detalle;
  });
 }
}