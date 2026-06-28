CREATE TABLE IF NOT EXISTS libros (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(120) NOT NULL,
  autor VARCHAR(100) NOT NULL,
  editorial VARCHAR(100),
  categoria VARCHAR(80),
  precio DECIMAL(10,2) NOT NULL,
  stock INT NOT NULL
);
INSERT INTO libros (titulo, autor, editorial, categoria, precio, stock) VALUES
('Spring Boot Profesional', 'Juan Perez', 'IDAT Press', 'Programacion', 120.00, 10),
('Microservicios con Java', 'Ana Torres', 'Tech Books', 'Software', 150.00, 8),
('Bases de Datos MySQL', 'Luis Mendoza', 'Data House', 'Base de Datos', 95.00, 15),
('Docker para Desarrolladores', 'Carla Rojas', 'Cloud Press', 'DevOps', 110.00, 12);
