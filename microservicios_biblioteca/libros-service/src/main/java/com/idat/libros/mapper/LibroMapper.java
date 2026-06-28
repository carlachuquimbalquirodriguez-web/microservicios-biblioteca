package com.idat.libros.mapper;
import com.idat.libros.dto.LibroDTO; import com.idat.libros.model.Libro; import org.mapstruct.Mapper;
@Mapper(componentModel="spring") public interface LibroMapper{ LibroDTO toDTO(Libro libro); Libro toEntity(LibroDTO dto); }
