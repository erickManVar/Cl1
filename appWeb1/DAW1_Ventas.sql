CREATE DATABASE DAW1_Ventas;
USE DAW1_Ventas;


CREATE TABLE Producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    precio DECIMAL(10, 2),
    cantidad INT
);

