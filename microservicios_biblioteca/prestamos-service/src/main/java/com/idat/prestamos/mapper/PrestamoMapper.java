package com.idat.prestamos.mapper;
import com.idat.prestamos.dto.PrestamoDTO; import com.idat.prestamos.model.Prestamo; import org.mapstruct.Mapper;
@Mapper(componentModel="spring") public interface PrestamoMapper{ PrestamoDTO toDTO(Prestamo prestamo); Prestamo toEntity(PrestamoDTO dto); }
