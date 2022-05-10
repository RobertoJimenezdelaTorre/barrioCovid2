/* INSERT INTO roles (name) VALUES ('USUARIO');
INSERT INTO roles (name) VALUES ('VENDEDOR');
INSERT INTO roles (name) VALUES ('REPARTIDOR');
INSERT INTO roles (name) VALUES ('CONFINADO');
 

INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Gabriel', 'gabriel', '{noop}gabriel', 'Calle Gabriel, 3', '1');
INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Roberto', 'roberto', '{noop}roberto', 'Calle Roberto, 3', '1');
INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Gabriel', 'gabriel@gmail.com', '{noop}gabriel', 'Calle Gabriel, 23', '1');
INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Roberto', 'roberto@gmail.com', '{noop}roberto', 'Calle Roberto, 23', '1');
INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Carlota', 'carlota@gmail.com', '{noop}carlota', 'Calle Carlota, 23', '1');
INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Comercios Irene', 'irene@gmail.com', '{noop}irene', 'Calle Irene, 23', '1');
INSERT INTO usuarios (nombre, username, password, direccion, enabled) VALUES ('Comercios Pedro', 'pedro@gmail.com', '{noop}pedro', 'Calle Pedro, 23', '1');
*/

INSERT INTO usuarios (nombre, username, password, direccion, rol, enabled) VALUES ('Carlota', 'carlota@gmail.com', '{noop}carlota', 'Calle Carlota, 23', 'USUARIO', true);
INSERT INTO usuarios (nombre, username, password, direccion, rol, enabled) VALUES ('Gabriel', 'gabriel@gmail.com', '{noop}gabriel', 'Calle Gabriel, 23', 'VENDEDOR', true);


/* insert into usuarios(username, password, enabled) values ('gabriel@gmail.com', '{noop}gabriel', true);
insert into usuarios(username, password, enabled) values ('carlota@gmail.com', '{noop}carlota', true);
insert into usuarios(username, password, enabled) values ('roberto@gmail.com', '{noop}roberto', true);
insert into usuarios(username, password, enabled) values ('irene@gmail.com', '{noop}irene', true);
insert into usuarios(username, password, enabled) values ('pedro@gmail.com', '{noop}pedro', true);


insert into authorities(username, authority) values ('gabriel@gmail.com', 'ROLE_USUARIO');
insert into authorities(username, authority) values ('gabriel@gmail.com', 'ROLE_REPARTIDOR');
insert into authorities(username, authority) values ('roberto@gmail.com', 'ROLE_USUARIO');
insert into authorities(username, authority) values ('carlota@gmail.com', 'ROLE_USUARIO');
insert into authorities(username, authority) values ('irene@gmail.com', 'ROLE_VENDEDOR');
insert into authorities(username, authority) values ('pedro@gmail.com', 'ROLE_VENDEDOR');
 */

/* 
INSERT INTO users_roles (user_id, role_id) VALUES (1, 1); 
INSERT INTO users_roles (user_id, role_id) VALUES (2, 1);  
INSERT INTO users_roles (user_id, role_id) VALUES (2, 4); 
INSERT INTO users_roles (user_id, role_id) VALUES (3, 1); 
INSERT INTO users_roles (user_id, role_id) VALUES (3, 3); 
INSERT INTO users_roles (user_id, role_id) VALUES (4, 2); 
INSERT INTO users_roles (user_id, role_id) VALUES (5, 2); */


insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Platanos de canarias', 5, '1kg', 'Comercios Paco', 5, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Arroz integral', 0.75, '1kg', 'Comercios Paco', 4, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Tortitas de maiz', 1, '10 uds', 'Comercios Paco', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Patatas de bolsa', 1.50, '500g', 'Comercios Paco', 14, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Mejillones', 3, 'Lata 6-8 uds', 'Comercios Paco', 7, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Leche',  0.90, 'Un tetrabrik', 'Comercios Paco', 9, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Detergente', 4.95, 'Bote de 2 litros', 'Comercios Paco', 12, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Papel higienico', 5, 'Pack de 8 uds', 'Comercios Paco', 14, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Leche',  0.95, 'Un tetrabrik', 'Comercios Loli', 1, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Naranja',  1.50, '1kg', 'Comercios Loli', 5, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Limón',  1, '1kg', 'Comercios Loli', 14, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Alcachofas',  3, '1kg', 'Comercios Loli', 8, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Lentejas',  0.65, '500g', 'Comercios Loli', 12, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Arroz integral',  0.70, '500g', 'Comercios Carmen', 1, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Servilletas',  0.99, 'Pack de 50', 'Comercios Carmen', 2, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Huevos',  1.20, 'Media docena', 'Comercios Carmen', 6, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Queso',  2.20, '100g', 'Comercios Carmen', 9, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Mantequilla',  2, '200g', 'Comercios Carmen', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Alitas de pollo',  4.60, 'Pack 500g', 'Comercios Carmen', 11, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Fingers de queso',  3.60, 'Pack 500g', 'Comercios Carmen', 12, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Harina de fuerza',  2.50, '500g', 'Comercios Carmen', 16, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Harina integral',  3, '500g', 'Comercios Carmen', 4, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Frutos secos',  1.75, '500g', 'Comercios Carmen', 6, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Quinoa',  2.35, '500g', 'Alimentación María Jesus', 11, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Pavo',  1.99, '500g', 'Alimentación María Jesus', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Lubina',  6.50, '1kg', 'Alimentación María Jesus', 1, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Café',  2.50, '300g', 'Alimentación María Jesus', 7, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Macarrones',  0.99, '500g', 'Alimentación María Jesus', 3, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Aceite de oliva',  5, '2 litros', 'Alimentación María Jesus', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Aceite de girasol',  4.5, '2 litros', 'Alimentación María Jesus', 15, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Gel',  3.20, '1 litro', 'Alimentación María Jesus', 5, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Champú',  3.50, '1 litro', 'Alimentación María Jesus', 9, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Pasta de dientes',  2.99, 'Unidad', 'Alimentación María Jesus', 13, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Detergente',  5.99, '3 litros', 'Comercios Mamen', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Pastillas lavavajillas',  5.65, 'Pack de 20', 'Comercios Mamen', 12, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Suavizante',  6.99, '3 litros', 'Comercios Mamen', 1, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Macarrones',  0.95, '500g', 'Comercios Mamen', 24, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Lubina',  6.99, '1kg', 'Comercios Mamen', 18, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Champú',  3.15, '1 litro', 'Comercios Mamen', 3, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Mantequilla',  2.75, '200g', 'Comercios Mamen', 7, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Fingers de queso',  3.50, '500g', 'Comercios Mamen', 8, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Queso',  2.45, '300g', 'Comercios Irene', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Brócoli',  2, '1kg', 'Comercios Irene', 12, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Endivia',  2, '1kg', 'Comercios Irene', 1, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Jamón serrano',  3.25, '400g', 'Comercios Irene', 24, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Jamón cocido',  2.5, '400g', 'Comercios Irene', 18, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Hummus',  2, '100g', 'Comercios Irene', 3, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Leche',  0.85, '1 litro', 'Comercios Irene', 7, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Guacamole',  2.35, '200g', 'Comercios Irene', 8, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Naranja',  1.65, '1kg', 'Comercios Pedro', 10, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Plátano',  2, '1kg', 'Comercios Pedro', 12, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Huevos',  1.20, 'Media docena', 'Comercios Pedro', 1, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Remolacha',  1.99, '1kg', 'Comercios Pedro', 24, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Zanahoria',  2, '1kg', 'Comercios Pedro', 18, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Cebolla',  2.50, '1kg', 'Comercios Pedro', 3, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Ajo',  1.50, 'Cabeza entera', 'Comercios Pedro', 7, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Piña',  2.50, 'Por unidad', 'Comercios Pedro', 8, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Servilletas',  1.99, 'Pack de 100', 'Comercios Pedro', 8, false);
insert into tablaproductos (nombre, precio, descripcion, tienda,  stock, elegido)values('Verduras congeladas',  4, '1kg', 'Comercios Pedro', 8, false);



insert into tiendas (nombre, vendedor, direccion, horario)values('Comercios Paco', 'Paco González', 'Calle de las Heras, 23, Madrid', 'Lunes a viernes: 9h-17h');
insert into tiendas (nombre, vendedor, direccion, horario)values('Comercios Loli', 'Loli San Juan', 'Calle de las Maravillas, 11, Madrid', 'Lunes a viernes: 9h-20h');
insert into tiendas (nombre, vendedor, direccion, horario)values('Comercios Carmen', 'Carmen Pérez', 'Calle Campana, 3, Madrid', 'Lunes a viernes: 9h-14h');
insert into tiendas (nombre, vendedor, direccion, horario)values('Alimentación María Jesus', 'María Jesús García', 'Calle Amapola, 27, Madrid', 'Lunes a viernes: 10h-17h');
insert into tiendas (nombre, vendedor, direccion, horario)values('Comercios Mamen', 'Mamen González', 'Calle de las Ortigas, 1, Madrid', 'Lunes a viernes: 9h-21h');
insert into tiendas (nombre, vendedor, direccion, horario)values('Comercios Irene', 'Irene Garcia', 'Calle de la playa, 12, Madrid', 'Lunes a viernes: 9h-20h');
insert into tiendas (nombre, vendedor, direccion, horario)values('Comercios Pedro', 'Pedro Cobo', 'Calle de Alfredo, 15, Madrid', 'Lunes a viernes: 10h-14h');
