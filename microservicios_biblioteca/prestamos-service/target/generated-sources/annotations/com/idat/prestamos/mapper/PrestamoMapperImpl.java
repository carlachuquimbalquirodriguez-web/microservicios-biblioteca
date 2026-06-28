package com.idat.prestamos.mapper;

import com.idat.prestamos.dto.PrestamoDTO;
import com.idat.prestamos.model.Prestamo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-27T00:31:37-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25 (Oracle Corporation)"
)
@Component
public class PrestamoMapperImpl implements PrestamoMapper {

    @Override
    public PrestamoDTO toDTO(Prestamo prestamo) {
        if ( prestamo == null ) {
            return null;
        }

        PrestamoDTO prestamoDTO = new PrestamoDTO();

        prestamoDTO.setId( prestamo.getId() );
        prestamoDTO.setLibroId( prestamo.getLibroId() );
        prestamoDTO.setNombreCliente( prestamo.getNombreCliente() );
        prestamoDTO.setFechaPrestamo( prestamo.getFechaPrestamo() );
        prestamoDTO.setFechaDevolucion( prestamo.getFechaDevolucion() );
        prestamoDTO.setEstado( prestamo.getEstado() );

        return prestamoDTO;
    }

    @Override
    public Prestamo toEntity(PrestamoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Prestamo prestamo = new Prestamo();

        prestamo.setId( dto.getId() );
        prestamo.setLibroId( dto.getLibroId() );
        prestamo.setNombreCliente( dto.getNombreCliente() );
        prestamo.setFechaPrestamo( dto.getFechaPrestamo() );
        prestamo.setFechaDevolucion( dto.getFechaDevolucion() );
        prestamo.setEstado( dto.getEstado() );

        return prestamo;
    }
}
