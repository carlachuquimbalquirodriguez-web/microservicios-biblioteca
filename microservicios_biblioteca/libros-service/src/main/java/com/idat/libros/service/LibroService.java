package com.idat.libros.service;
import com.idat.libros.dto.LibroDTO; import com.idat.libros.mapper.LibroMapper; import com.idat.libros.model.Libro; import com.idat.libros.repository.LibroRepository; import org.springframework.stereotype.Service; import java.util.*; import java.util.stream.Collectors;
@Service public class LibroService{
 private final LibroRepository repo; private final LibroMapper mapper; public LibroService(LibroRepository repo, LibroMapper mapper){this.repo=repo;this.mapper=mapper;}
 public List<LibroDTO> listar(){return repo.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());}
 public Optional<LibroDTO> buscar(Long id){return repo.findById(id).map(mapper::toDTO);} public LibroDTO guardar(LibroDTO dto){return mapper.toDTO(repo.save(mapper.toEntity(dto)));}
 public Optional<LibroDTO> actualizar(Long id, LibroDTO dto){return repo.findById(id).map(e->{e.setTitulo(dto.getTitulo());e.setAutor(dto.getAutor());e.setEditorial(dto.getEditorial());e.setCategoria(dto.getCategoria());e.setPrecio(dto.getPrecio());e.setStock(dto.getStock());return mapper.toDTO(repo.save(e));});}
 public boolean eliminar(Long id){if(!repo.existsById(id)) return false; repo.deleteById(id); return true;}
}
