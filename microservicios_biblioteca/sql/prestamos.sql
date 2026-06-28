CREATE TABLE IF NOT EXISTS prestamos (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  libro_id BIGINT NOT NULL,
  nombre_cliente VARCHAR(120) NOT NULL,
  fecha_prestamo VARCHAR(20) NOT NULL,
  fecha_devolucion VARCHAR(20),
  estado VARCHAR(30) NOT NULL
);
INSERT INTO prestamos (libro_id, nombre_cliente, fecha_prestamo, fecha_devolucion, estado) VALUES
(1, 'Carlos Suarez', '2026-06-27', '2026-07-05', 'ACTIVO'),
(2, 'Ana Torres', '2026-06-28', '2026-07-06', 'ACTIVO'),
(3, 'Luis Mendoza', '2026-06-29', '2026-07-07', 'PENDIENTE');
