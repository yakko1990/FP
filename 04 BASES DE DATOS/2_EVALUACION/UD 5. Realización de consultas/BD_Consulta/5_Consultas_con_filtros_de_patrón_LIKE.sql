-- 1. Base de datos Tienda Informática (2 tablas).
use tienda;
-- 1 Muestra el listado de los fabricantes cuyo nombre empiece por ‘S’.
select * from fabricante where nombre like 'S%';
-- 2 Muestra el listado de los fabricantes cuyo nombre termine por ‘e’.
select * from fabricante where nombre like '%e';
-- 3 Muestra el listado de los fabricantes cuyo nombre tenga como segunda letra una ‘e’.
select * from fabricante where nombre like '_e%';


-- 2. Base de datos Gestión de Empleados (2 tablas).
use empleados;
-- 1 Muestra los datos de los empleados cuyo nombre empiece por ‘A’.
select * from empleado where nombre like 'A%';
-- 2 Muestra los datos de los empleados cuyo nombre acabe por ‘a’.
select * from empleado where nombre like '%a';
-- 3 Muestra los datos de los empleados cuyo nombre tenga una ‘a’ intermedia.
-- ????????????????????????????????????????????????????????
select * from empleado where nombre like '_%a%_';
-- ???????????????????????????????????????????????????????
-- 3. Base de datos Gestión de Ventas (3 tablas).
use ventas;
-- 1 Muestra los clientes cuyo nombre empiece por ‘Ad’.
select * from cliente where nombre like 'ad%';
-- 2 Muestra los clientes cuyo nombre contenga una ‘o’.
select * from cliente where nombre like '%o%';
-- 3 Muestra los comerciales cuyo segundo apellido acabe en ‘z’.
select * from cliente where apellido2 like '%z';
-- 4 Muestra los pedidos realizados en el mes de octubre.
select * from pedido where fecha like '_____10%';

-- 4. Base de datos NBA (4 tablas).
use nba;
-- 1 Muestra el nombre y ciudad de los equipos cuya ciudad termine en ‘o’.
select nombre, ciudad from equipos where ciudad like '%o';
-- 2 Muestra el nombre del jugador y del equipo, de los jugadores cuyo nombre contenga una ‘u’.
select nombre, Nombre_equipo from jugadores where nombre like '%u%';
-- 3 Muestra el nombre y ciudad del equipo cuya ciudad tenga una ‘h’ como segunda letra.
select nombre, ciudad from equipos where ciudad like '_h%';
-- 4 Muestra el nombre del jugador y del equipo, cuyo nombre de equipo contenga una ‘o’ como antepenúltima letra.
select nombre, nombre_equipo from jugadores where nombre_equipo like '%o__';

-- 5. Base de datos DepartamentoOficinas (5 tablas).
use departamentooficinas;
-- 1 Muestra los nombres de los empleados que empiecen por ‘A’ y acaben en ’z’.
select nombre from empleado where nombre like 'a%z';
-- 2 Muestra los nombres de los empleados que no tengan en nombre y apellidos ninguna ‘a’.
select nombre from empleado where nombre not like '%a%';
-- 3 Muestra los empleados cuyo primer apellido empiece por ‘G’.
select nombre from empleado where nombre like '% g%';
-- 4 Muestra los empleados con un solo nombre y sin apellidos.
select nombre from empleado where nombre like '% ';

-- 6. Base de datos Jardinería (8 tablas).
use jardineria;
-- 1 Muestra nombre y teléfono cada cliente cuyo nombre de contacto empiece por ‘a’.
select nombre_cliente, telefono from cliente where nombre_contacto like 'a%';
-- 2 Muestra nombre y teléfono cada cliente cuyo nombre de contacto acabe en ‘a’.
select nombre_cliente, telefono from cliente where nombre_contacto like '%a';
-- 3 Muestra el nombre de los empleados que contenga una ‘a’.
select nombre from empleado where nombre like '%a%';
-- 4 Muestra los productos cuyo nombre contenga como segundo carácter una ‘j’.
select * from producto where nombre like '_j%';
-- 5 Muestra las oficinas cuya ciudad en la que se ubiquen, tenga como segunda letra ‘a’ y acabe en ‘a’.
select * from oficina where ciudad like '_a%a';
-- 6 Muestra los detalles de los pagos realizados en 2008.
select * from pago where fecha_pago like '2008%';
-- 7 Muestra pedidos realizados en enero y con fecha de entrega esperada en febrero.
select * from pedido where fecha_esperada like '_____02%';
-- 8 Muestra los detalles de los productos cuya descripción contenga ‘de los’ y también ‘árbol que’.
select * from producto where descripcion like '%de los%' and descripcion like '%arbol que%';
