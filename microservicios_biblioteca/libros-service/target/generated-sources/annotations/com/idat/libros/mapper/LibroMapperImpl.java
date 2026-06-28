package com.idat.libros.mapper;

import com.idat.libros.dto.LibroDTO;
import com.idat.libros.model.Libro;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-27T00:31:11-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class LibroMapperImpl implements LibroMapper {

    @Override
    public LibroDTO toDTO(Libro libro) {
        if ( libro == null ) {
            return null;
        }

        LibroDTO libroDTO = new LibroDTO();

        libroDTO.setId( libro.getId() );
        libroDTO.setTitulo( libro.getTitulo() );
        libroDTO.setAutor( libro.getAutor() );
        libroDTO.setEditorial( libro.getEditorial() );
        libroDTO.setCategoria( libro.getCategoria() );
        libroDTO.setPrecio( libro.getPrecio() );
        libroDTO.setStock( libro.getStock() );

        return libroDTO;
    }

    @Override
    public Libro toEntity(LibroDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Libro libro = new Libro();

        libro.setId( dto.getId() );
        libro.setTitulo( dto.getTitulo() );
        libro.setAutor( dto.getAutor() );
        libro.setEditorial( dto.getEditorial() );
        libro.setCategoria( dto.getCategoria() );
        libro.setPrecio( dto.getPrecio() );
        libro.setStock( dto.getStock() );

        return libro;
    }
}
