-- 1. Base de datos Tienda Informática (2 tablas).
use tienda;
-- 1 Muestra los productos que NO tengan asignado un código de fabricante.
select	* from producto where not codigo_fabricante;
-- 2 Muestra los productos que tengan asignado un código de fabricante.
select	* from producto where codigo_fabricante;
-- 3 Muestra los códigos de fabricante que NO estén asignados a ningún fabricante.
select	codigo from fabricante where nombre is null;
-- 4 Muestra los códigos de fabricante que estén asignados a algún fabricante.
select	codigo from fabricante where nombre is not null;

-- 2. Base de datos Gestión de Empleados (2 tablas).
use empleados;
-- 1 Muestra los empleados cuyo segundo apellido sea NULL.
select * from empleado where apellido2 is null;
-- 2 Muestra los empleados cuyo segundo apellido no sea NULL.
select * from empleado where apellido2 is not null;


-- 3. Base de datos Gestión de Ventas (3 tablas).
use ventas;
-- 1 Muestra los clientes sin segundo apellido.
select * from cliente where apellido2 is null;
-- 2 Muestra los clientes sin categoría.
select * from cliente where categoría is null;

-- 3 Muestra los comerciales que no cobren comisión.
select * from comercial where comisión is null;
-- 4 Muestra los pedidos cuyo importe o fecha sea nulo.
select * from pedido where (total or fecha) is null;

-- 4. Base de datos NBA (4 tablas).
use nba;
-- 1 Muestra el nombre de los jugadores que no procedan de ningún equipo.
select * from jugadores where nombre_equipo is null;
select * from jugadores where Procedencia is null;
-- 2 Muestra el nombre de los equipos de la conferencia East que estén asociados a alguna división.
select nombre from equipos where Conferencia = 'east' & Division is not null;


-- 5. Base de datos DepartamentoOficinas (5 tablas).
use departamentooficinas;
-- 1 Muestra los empleados que no estén asignados a ningún departamento.
select * from empleado where departamento is null;
-- 2 Muestra los empleados que sin ninguna categoría.
select * from empleado where categoria is null;
-- 3 Muestra los departamentos que tienen nombre.
select * from departamento where nombre is not null;
-- 4 Muestra las oficinas que, de momento, no estén asociadas a ninguna ciudad.
select * from oficina where ciudad is null;
-- 5 Muestra las oficinas que estén asociadas a alguna ciudad.
select * from oficina where ciudad is not null;

-- 6. Base de datos Jardinería (8 tablas).
use jardineria;
-- 1 Muestra el nombre de los clientes que no tengan segunda dirección.
select * from cliente where linea_direccion2 is null;
-- 2 Muestra los detalles de los pedidos cuyo precio por unidad no sea nulo.
select * from detalle_pedido where precio_unidad is not null;
-- 3 Muestra los pedidos sin comentarios.
select * from pedido where comentarios is null;
-- 4 Muestra los pedidos que no se han entregado aún.
select * from pedido where not estado  = 'entregado';
select * from pedido where fecha_entrega is null;