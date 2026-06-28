package com.idat.prestamos.dto;
public class PrestamoDTO{
 private Long id; private Long libroId; private String nombreCliente; private String fechaPrestamo; private String fechaDevolucion; private String estado;
 public Long getId(){return id;} public void setId(Long id){this.id=id;} public Long getLibroId(){return libroId;} public void setLibroId(Long libroId){this.libroId=libroId;} public String getNombreCliente(){return nombreCliente;} public void setNombreCliente(String nombreCliente){this.nombreCliente=nombreCliente;} public String getFechaPrestamo(){return fechaPrestamo;} public void setFechaPrestamo(String fechaPrestamo){this.fechaPrestamo=fechaPrestamo;} public String getFechaDevolucion(){return fechaDevolucion;} public void setFechaDevolucion(String fechaDevolucion){this.fechaDevolucion=fechaDevolucion;} public String getEstado(){return estado;} public void setEstado(String estado){this.estado=estado;}
}
