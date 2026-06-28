package com.idat.prestamos.model;
import jakarta.persistence.*;
@Entity @Table(name="prestamos") public class Prestamo{
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(name="libro_id") private Long libroId; @Column(name="nombre_cliente") private String nombreCliente; @Column(name="fecha_prestamo") private String fechaPrestamo; @Column(name="fecha_devolucion") private String fechaDevolucion; private String estado;
 public Long getId(){return id;} public void setId(Long id){this.id=id;} public Long getLibroId(){return libroId;} public void setLibroId(Long libroId){this.libroId=libroId;} public String getNombreCliente(){return nombreCliente;} public void setNombreCliente(String nombreCliente){this.nombreCliente=nombreCliente;} public String getFechaPrestamo(){return fechaPrestamo;} public void setFechaPrestamo(String fechaPrestamo){this.fechaPrestamo=fechaPrestamo;} public String getFechaDevolucion(){return fechaDevolucion;} public void setFechaDevolucion(String fechaDevolucion){this.fechaDevolucion=fechaDevolucion;} public String getEstado(){return estado;} public void setEstado(String estado){this.estado=estado;}
}
