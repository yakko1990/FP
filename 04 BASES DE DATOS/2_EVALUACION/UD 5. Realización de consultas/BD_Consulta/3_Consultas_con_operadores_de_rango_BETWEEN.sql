-- Base de datos Tienda Informática (2 tablas)

-- 1 Muestra los productos cuyo precio sea menor o igual a 120€.
select nombre from producto where precio between 0 and 120;
-- 2 Muestra los productos cuyo precio oscile entre los 80 y 300€.
select nombre from producto where precio between 80 and 300;
-- 3 Muestra los productos cuyo código de fabricante sea 1, 3 ó 5.
select nombre from producto where codigo_fabricante =  1 or codigo_fabricante =  3 or codigo_fabricante =  5;
-- 4 Muestra los productos del fabricante con el código 6 cuyo precio sea mayor a 200€.
select nombre from producto where codigo_fabricante = 6 and precio >200;

-- Base de datos Gestión de Empleados (2 tablas)

-- 1 Muestra el nombre de los departamentos y el presupuesto, de aquellos que tienen un presupuesto mayor o igual a 150000 €.
select nombre, presupuesto from departamento where presupuesto >= 150000;
-- 2 Muestra el nombre de los departamentos y el presupuesto, de aquellos que tienen un presupuesto entre 100000 y 200000 €.
select nombre, presupuesto from departamento where presupuesto between 100000 and 200000;
-- 3 Muestra el nombre de los departamentos que no tienen un presupuesto entre 100000 y 200000 €.
select nombre from departamento where not presupuesto between 100000 and 200000;
-- 4 Muestra el nombre de los departamentos, gastos y presupuesto, de aquellos departamentos donde los gastos sean mayores que el presupuesto del que disponen.
select nombre, gastos, presupuesto from departamento where gastos > presupuesto;

-- Base de datos Gestión de Ventas (3 tablas)

-- 1 Muestra los clientes cuyo número de categoría esté entre 150 y 250.
select * from cliente where categoría between 150 and 250;
-- 2 Muestra los comerciales cuya comisión sea superior al 12%.
select * from comercial where comisión >0.12;
-- 3 Muestra los pedidos cuyo total sea inferior a 200€.
select * from pedido where total < 200;


-- Base de datos NBA (4 tablas)

-- 1 Muestra el jugador y la temporada de quienes hayan realizado entre 3 y 5 rebotes de media por partido.
select jugador, temporada from estadisticas where Rebotes_por_partido between 3 and 5;
-- 2 Muestra los nombres de los jugadores que pesen entre 180 y 230 libras.
select nombre from jugadores where Peso between 180 and 230;
-- 3 Muestra los equipos que hayan recibido entre 50 y 80 puntos del equipo rival.
select equipo_local, equipo_visitante from partidos where puntos_visitante or puntos_local between 50 and 80;
-- 4 Muestra los equipos que hayan recibido menos de 50 puntos del equipo rival.
select equipo_local, equipo_visitante from partidos where puntos_visitante or puntos_local <50;

-- Base de datos DepartamentoOficinas (5 tablas)

-- 1 Muestra los empleados cuya categoría sea Director o Jefe de sección (códigos 1 y 2).
select * from categoria where titulo = "Director" or titulo = "Jefe de sección" ;
select * from empleado where categoria between 1 and 2 ;
-- 2 Muestra los empleados de categoría Administrativo (código 3) cuya edad sea mayor a 35 años.
select * from empleado where categoria = 3 and edad >35;
-- 3 Muestra las categorías cuyo salario sea inferior a 35.000€ o superior a 40.000€.
select categoria from categoria where salario <35000 or salario >40000;
select * from categoria where salario <35000 or salario >40000;

-- Base de datos Jardinería (8 tablas)

-- 1 Muestra nombre y límite de crédito de los clientes que tengan un límite de crédito no superior a 35000 €.
select nombre_cliente, limite_credito from cliente where limite_credito < 35000;
-- 2 Muestra los detalles de los pedidos cuyo precio por unidad de producto oscile entre 12 y 24 €.
select * from detalle_pedido where precio_unidad between 12 and 24;
-- 3 Muestra nombre, apellidos, email y puesto de trabajo de los empleados cuyos códigos de jefe no sean superiores a 3 ni inferiores a 20.
-- ????????????????????????????????????????????????????????????
select nombre, apellido1, apellido2, email, puesto from empleado where codigo_jefe < 3 and codigo_jefe >20; 
-- ????????????????????????????????????????????????????????????
-- 4 Muestra código y nombre de las oficinas cuyo código postal sea superior a 9000.
select codigo_oficina, ciudad from oficina where codigo_postal >900;
-- 5 Muestra los detalles de los pagos cuyo total sea superior a 500 € e inferior a 3000€.
select * from pago where total > 500 and total < 3000;
-- 6 Muestra los productos cuyos precios de venta oscilen entre los 8 y 10 €, y que su cantidad en el stock sea menor de 100.
select * from producto where precio_venta between 8 and 10 and cantidad_en_stock < 100;