-- Base de datos Tienda Informática (2 tablas)
use tienda;
-- 1 Muestra los datos de los fabricantes cuyos códigos van del 2 al 7.
select * from fabricante where codigo between 2 and 7;
-- 2 Muestra los datos de los fabricantes cuyos códigos no sean el 2, 4 y 6.
select * from fabricante where not codigo  in  (2, 4, 6);
-- 3 Muestra los datos de los productos cuyos códigos son 1, 3, 4, y 7.
select * from producto where codigo in (1, 3, 4, 7);

-- Base de datos Gestión de Empleados (2 tablas)
use empleados;
-- 1 Muestra los datos de los departamentos Desarrollo, Sistemas y Contabilidad.

select * from departamento where nombre in ('Desarrollo',  'Sistemas', 'Contabilidad');
-- 2 Muestra los datos de los departamentos cuyo presupuesto no sea 0.

select * from departamento where presupuesto != 0;
select * from departamento where not presupuesto in (0);

-- 3 Muestra los datos de los empleados cuyo departamento sea el 2, 4 ó 5.
select * from empleado where codigo_departamento in (2, 4, 5);

-- 4 Muestra los datos de los empleados apellidados Ruiz o Salas.
select * from empleado where apellido1 in ('Ruiz', 'Salas') OR apellido2 in ('Ruiz', 'Salas');



--  Base de datos Gestión de Ventas (3 tablas)
use ventas;
-- 1 Muestra los datos de los clientes que se llamen Maria o Adela.
select * from cliente where nombre in ('Maria', 'Adela');
-- 2 Muestra los datos de los comerciales que tengan como primer apellido Gómez o Domínguez.
select * from comercial where apellido1 in ('Gómez', 'Domínguez');
-- 3 Muestra los datos de los pedidos realizados por los clientes con los códigos 1, 2 y 6.
select * from pedido where id_cliente in (1, 2, 6);
-- 4 Muestra los datos de los pedidos realizados por los comerciales cuyo códigos no sean 1, 2 ó 6.
select * from pedido where not id_comercial in (1, 2, 6);

-- Base de datos NBA (4 tablas)
use nba;
-- 1 Muestra los nombres y las ciudades de los equipos cuya división sea la Central o la Pacific.
select nombre, ciudad from equipos where division in ('Central', 'Pacific');
-- 2 Muestra el jugador, puntos y asistencias por partido, de los jugadores que hayan realizado 3 ó 5 rebotes de media por partido.
select jugador, Puntos_por_partido, Asistencias_por_partido from estadisticas where Rebotes_por_partido in (3,5);
-- 3 Muestra el nombre y procedencia de los jugadores que procedan de Utah, Michigan, Villanova o Utah.
select nombre, procedencia from jugadores where Procedencia in ('Utah', 'Michigan', 'Villanova', 'Utah');
-- 4 Muestra los equipos locales que hayan logrado 74, 86, 90 ó 100 puntos.
select equipo_local from partidos where puntos_local in (74, 86, 90, 100);


-- Base de datos DepartamentoOficinas (5 tablas)
use departamentooficinas;
-- 1 Muestra el salario de las categorías de Administrativo y Comercial.
select salario from categoria where titulo in ('Administrativo','Comercial');
-- 2 Muestra los empleados de las categorías 1, 3 y 5.
select salario from categoria where titulo in ('Administrativo','Comercial');
-- 3 Muestra los datos de la oficina 11 que aparecen en la tabla dpto_oficinas.
select * from dpto_oficinas where oficina in (11);

-- Base de datos Jardinería (8 tablas)

-- 1 Muestra el nombre del cliente y el del contacto, siendo la ciudad del cliente Barcelona, Madrid o Miami.
select nombre_cliente, nombre_contacto from cliente where ciudad in ('Barcelona', 'Madrid', 'Miami');
-- 2 Muestra el código de los productos vendidos cuyo precio por unidad sea 12, 15, 19 ó 25.
select codigo_producto from detalle_pedido where precio_unidad in (12, 15, 19, 25);
-- 3 Muestra nombre, apellidos, email y puesto de los empleados que no sean Director de oficina ni Representante de ventas.
select nombre, apellido1, apellido2, email, puesto from empleado where not puesto in ('Director Oficina','Representante Ventas');
-- 4 Muestra el tipo de gama de producto y la descripción de las gamas que no sean ni aromáticas ni ornamentales.
select gama, descripcion_texto gama from gama_producto where not gama in ('Aromáticas','Ornamentales');
-- 5 Muestra el código de las oficinas y de sus ciudades, ubicadas en Estados Unidos o en España.
select codigo_oficina, ciudad from oficina where pais in ('España','EEUU');
-- 6 Muestra el detalle de los pagos que no se hayan realizado por PayPal.
select *  from pago where not forma_pago in ('PayPal');
-- 7 Muestra el detalle de los pedidos que no se hayan entregado.
select *  from pedido where not estado in ('entregado');
-- 8 Muestra el detalle de los productos, salvo su código, de aquellos cuyo precio de venta sea 12, 15, 19 ó 25.
select nombre, gama, dimensiones, proveedor, descripcion, cantidad_en_stock, precio_venta, precio_proveedor from producto where precio_venta in (12, 15, 19, 25);
