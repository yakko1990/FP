USE Jardineria;
#-------------------------------------------------------------------------------------------
#	1. Crea una vista de los empleados con código, nombre completo, email, puesto de trabajo, extensión y oficina
#-------------------------------------------------------------------------------------------
drop view if exists vista_Empleados_info;

create view vista_Empleados_info as
	SELECT codigo_empleado, concat(nombre, '' , apellido1, '',apellido2) as nombre_completo, email, puesto, extension,codigo_oficina
  from empleado;
#-------------------------------------------------------------------------------------------
#	2. Crea una vista de Clientes y estado de los pedidos, mostrando nombre de la empresa cliente, teléfono, código del pedido y estado en el que se halla
#-------------------------------------------------------------------------------------------
drop view if exists vista_pedidos_Clientes;
create view vista_pedidos_Clientes as 
	select nombre_cliente as Empresa, telefono as Teléfono, codigo_pedido 'Código de pedido', estado as Estado
    from cliente join pedido on cliente.codigo_cliente = pedido.codigo_cliente;
#-------------------------------------------------------------------------------------------
#	3. Crea una vista de los productos que se hallen en stock, mostrando código y nombre del producto y su cantidad en stock

#-------------------------------------------------------------------------------------------
drop view if exists vista_productos_en_stock;
create view vista_productos_en_stock as
	select codigo_producto as Código, nombre as Producto, cantidad_en_stock as Stock from producto
    where cantidad_en_stock >=1;


#-------------------------------------------------------------------------------------------
#	4. Crea una vista sobre los pagos realizados, mostrando el nombre de la empresa cliente, la transacción efectuada, el tipo, fecha y total de pago abonada
#-------------------------------------------------------------------------------------------
drop view if exists vista_Pagos_realizados;
create view vista_Pagos_realizados as 
	select cliente.nombre_cliente as Empresa, pago.id_transaccion,pago.forma_pago as 'Tipo de pago', pago.fecha_pago as Fecha, pago.total as Total from pago join cliente on pago.codigo_cliente = cliente.codigo_cliente;

#-------------------------------------------------------------------------------------------
#	5. Crea una vista de los pedidos pendientes de atender, mostrando código de pedido, fecha de realización del pedido y fecha esperada de recepción
#-------------------------------------------------------------------------------------------
drop view if exists vista_pedidos_pendientes;
create view vista_pedidos_pendientes as 
	select codigo_pedido as codigo, fecha_pedido as 'fecha de realización', fecha_esperada as recepcion from pedido
    where estado in ('pendiente');
#-------------------------------------------------------------------------------------------
#	6. Crea una vista de ventas en función de la gama del producto, mostrando la gama, número de ventas efectuadas y total del dinero obtenido en cada gama
#-------------------------------------------------------------------------------------------
drop view if exists vista_ventas_por_gama;
CREATE view	vista_ventas_por_gama as
	select gama_producto.gama as Gama, count(detalle_pedido.codigo_pedido) as Ventas, (sum(cantidad * precio_unidad)) as 'Importe total',
    (sum(cantidad *precio_unidad)/count(detalle_pedido.codigo_pedido)) as 'Importe medio por venta'
    from gama_producto left join producto on gama_producto.gama = producto.gama
						left join detalle_pedido on producto.codigo_producto = detalle_pedido.codigo_producto
                        group by gama_producto.gama
                        having ventas > 0
                        order by 3;
#-------------------------------------------------------------------------------------------
#	7. Crea una vista mostrando el nombre del país y el número total de clientes que tiene cada uno
#-------------------------------------------------------------------------------------------
drop view if exists vista_cliente_por_pais;
create view vista_cliente_por_pais as 
select count(nombre_cliente) as Cliente, pais as Pais from cliente group by pais;

#-------------------------------------------------------------------------------------------
#	8. Crea una vista que muestre el código y nombre del producto que se hallen agotados
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#	9. Crea una vista sobre el detalle de pedido asociado a los productos, mostrando, código de pedido, nombre producto, cantidad, precio por unidad y precio final
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#	10. Crea una vista entre empleados y oficinas, mostrando código y nombre completo del empleado, puesto de trabajo que realiza, y ciudad y país en donde trabaja
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  11. Crea una vista con los clientes que han excedido su límite de crédito, mostrando en cuánto han excedido ese límite
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  12. Crea una vista del número de ventas efectuadas por ciudad
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  13. Crea una vista que muestre el número de productos que hay por cada Proveedor
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  14. Crea una vista que muestre el nombre de la empresa cliente y el número de órdenes de compra asociadas
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  15. Crea una vista que muestre el número de pedidos por estado en el que se hallen
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  16. Crea una vista que asocie empleados, con identificador y nombre completo, y el número de clientes asignados
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  17. Crea una vista de los productos vendidos, mostrando código de producto, nombre y unidades vendidas
#-------------------------------------------------------------------------------------------

#-------------------------------------------------------------------------------------------
#  18. Crea una vista mostrando el número de pagos efectuados en cada forma de pago
#-------------------------------------------------------------------------------------------

SELECT * FROM jardineria.vista_productos_en_stock 
order by 3;

# Muestra solo los productos cuya cantidad sea mayor a 4

SELECT producto, Stock FROM jardineria.vista_productos_en_stock where Stock > 4 
order by 2;





