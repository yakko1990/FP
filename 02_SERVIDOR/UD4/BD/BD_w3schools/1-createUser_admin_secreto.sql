-- creamos un usuario admin con contraseña secreto
create user 'admin'@'localhost' identified by 'secreto';
-- le asignamos todos los permisos en el servidor local 
grant all on *.* to admin@'localhost' with grant option;
-- forzamos que se refresque la caché interna 
-- flush privileges;

-- Si quisiéramos eliminarlo
-- drop user 'admin'@'localhost';