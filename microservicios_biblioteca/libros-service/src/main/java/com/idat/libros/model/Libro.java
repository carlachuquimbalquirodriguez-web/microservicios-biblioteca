package com.idat.libros.model;
import jakarta.persistence.*; import java.math.BigDecimal;
@Entity @Table(name="libros")
public class Libro{
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String titulo; private String autor; private String editorial; private String categoria; private BigDecimal precio; private Integer stock;
 public Long getId(){return id;} public void setId(Long id){this.id=id;} public String getTitulo(){return titulo;} public void setTitulo(String titulo){this.titulo=titulo;} public String getAutor(){return autor;} public void setAutor(String autor){this.autor=autor;} public String getEditorial(){return editorial;} public void setEditorial(String editorial){this.editorial=editorial;} public String getCategoria(){return categoria;} public void setCategoria(String categoria){this.categoria=categoria;} public BigDecimal getPrecio(){return precio;} public void setPrecio(BigDecimal precio){this.precio=precio;} public Integer getStock(){return stock;} public void setStock(Integer stock){this.stock=stock;}
}
