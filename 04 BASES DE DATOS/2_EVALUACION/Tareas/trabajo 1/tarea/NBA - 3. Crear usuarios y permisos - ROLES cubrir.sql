#--------------------------------------------------------------------------------------------
#	1.	UTILIZAMOS LA BASE DE DATOS 'NBA'
#--------------------------------------------------------------------------------------------
#	USE <base de datos>
#--------------------------------------------------------------------------------------------
			use nba;
#--------------------------------------------------------------------------------------------
#	2. 	BORRAMOS Y CREAMOS LOS ROLES
#--------------------------------------------------------------------------------------------
#	Rol asociado a NBA y a cada Conferencia (Este, Oeste) y a cada División (Atlántico, Sudeste, Central, Pacífico, Sudoeste y Noroeste)
#--------------------------------------------------------------------------------------------
#	CREATE ROLE <rol>
#--------------------------------------------------------------------------------------------

#DROP ROLE IF EXISTS role_Admin;
#CREATE ROLE role_Admin;
DROP ROLE IF EXISTS nba;
CREATE ROLE nba;
DROP ROLE IF EXISTS conferencia_este;
CREATE ROLE conferencia_este;
DROP ROLE IF EXISTS conferencia_oeste;
CREATE ROLE conferencia_oeste;
DROP ROLE IF EXISTS division_atlantico;
CREATE ROLE division_atlantico;
DROP ROLE IF EXISTS division_sudeste;
CREATE ROLE division_sudeste;
DROP ROLE IF EXISTS division_central;
CREATE ROLE division_central;
DROP ROLE IF EXISTS division_pacifico;
CREATE ROLE division_pacifico;
DROP ROLE IF EXISTS division_sudoeste;
CREATE ROLE division_sudoeste;
DROP ROLE IF EXISTS division_noroeste;
CREATE ROLE division_noroeste;

#--------------------------------------------------------------------------------------------
#	3. BORRAMOS Y CREAMOS LAS VISTAS
#--------------------------------------------------------------------------------------------
#	DROP VIEW IF EXISTS <vista>							CREATE VIEW	<vista>	AS <consulta>
#--------------------------------------------------------------------------------------------
#		Vista General de TODOS los Equipos, otra para TODOS los Jugadores, otra para TODAS las Estadísticas y otra para TODOS los partidos
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la Conferencia ESTE
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la Conferencia OESTE
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Atlantica
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Sudeste
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Central
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Pacífico
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Sudoeste
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Noroeste
#--------------------------------------------------------------------------------------------
	
#		Vista General de TODOS los Equipos, otra para TODOS los Jugadores, otra para TODAS las Estadísticas y otra para TODOS los partidos

    DROP VIEW IF EXISTS VistaNBA_EQUIPOS;						CREATE VIEW VistaNBA_EQUIPOS						AS SELECT * FROM NBA.equipos;
	DROP VIEW IF EXISTS VistaNBA_JUGADORES;						CREATE VIEW VistaNBA_JUGADORES						AS SELECT * FROM NBA.jugadores;
	DROP VIEW IF EXISTS VistaNBA_ESTADISTICAS;					CREATE VIEW VistaNBA_ESTADISTICAS					AS SELECT * FROM NBA.estadisticas;
	DROP VIEW IF EXISTS VistaNBA_PARTIDOS;						CREATE VIEW VistaNBA_PARTIDOS						AS SELECT * FROM NBA.partidos;


#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la Conferencia ESTE
    
    DROP VIEW IF EXISTS VistaCONFERENCIA_ESTE_EQUIPOS;			CREATE VIEW VistaCONFERENCIA_ESTE_EQUIPOS			AS SELECT * FROM NBA.equipos 		where Conferencia = 'East';
	DROP VIEW IF EXISTS VistaCONFERENCIA_ESTE_JUGADORES;		CREATE VIEW	VistaCONFERENCIA_ESTE_JUGADORES			AS SELECT * FROM NBA.jugadores 		where Nombre 	  IN (select nombre from VistaCONFERENCIA_ESTE_EQUIPOS);
    DROP VIEW IF EXISTS VistaCONFERENCIA_ESTE_ESTADISTICAS;		CREATE VIEW VistaCONFERENCIA_ESTE_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaCONFERENCIA_ESTE_JUGADORES);
	DROP VIEW IF EXISTS VistaCONFERENCIA_ESTE_PARTIDOS;			CREATE VIEW VistaCONFERENCIA_ESTE_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaCONFERENCIA_ESTE_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaCONFERENCIA_ESTE_EQUIPOS);
    
   
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la Conferencia OESTE

	DROP VIEW IF EXISTS VistaCONFERENCIA_OESTE_EQUIPOS;			CREATE VIEW VistaCONFERENCIA_OESTE_EQUIPOS			AS SELECT * FROM NBA.equipos 		where Conferencia = 'West';
    DROP VIEW IF EXISTS VistaCONFERENCIA_OESTE_JUGADORES;		CREATE VIEW	VistaCONFERENCIA_OESTE_JUGADORES		AS SELECT * FROM NBA.jugadores 		where Nombre 	  IN (select nombre from VistaCONFERENCIA_OESTE_EQUIPOS);
	DROP VIEW IF EXISTS VistaCONFERENCIA_OESTE_ESTADISTICAS;	CREATE VIEW VistaCONFERENCIA_OESTE_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaCONFERENCIA_OESTE_JUGADORES);
    DROP VIEW IF EXISTS VistaCONFERENCIA_OESTE_PARTIDOS;		CREATE VIEW VistaCONFERENCIA_OESTE_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaCONFERENCIA_OESTE_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaCONFERENCIA_OESTE_EQUIPOS);
    
    
#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Atlantica

    DROP VIEW IF EXISTS VistaDIVISION_ATLANTICA_EQUIPOS;		CREATE VIEW	VistaDIVISION_ATLANTICA_EQUIPOS			AS SELECT * FROM NBA.equipos		where Division = 'Atlantic';
	DROP VIEW IF EXISTS VistaDIVISION_ATLANTICA_JUGADORES;		CREATE VIEW	VistaDIVISION_ATLANTICA_JUGADORES		AS SELECT * FROM NBA.jugadores 		where Nombre 	  IN (select nombre from VistaDIVISION_ATLANTICA_EQUIPOS);
    DROP VIEW IF EXISTS VistaDIVISION_ATLANTICA_ESTADISTICAS;	CREATE VIEW	VistaDIVISION_ATLANTICA_ESTADISTICAS	AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaDIVISION_ATLANTICA_JUGADORES);
	DROP VIEW IF EXISTS VistaDIVISION_ATLANTICA_PARTIDOS;		CREATE VIEW VistaDIVISION_ATLANTICA_PARTIDOS		AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaDIVISION_ATLANTICA_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaDIVISION_ATLANTICA_EQUIPOS);


#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Sudeste

	DROP VIEW IF EXISTS VistaDIVISION_SUDESTE_EQUIPOS;			CREATE VIEW	VistaDIVISION_SUDESTE_EQUIPOS			AS SELECT * FROM NBA.equipos		where Division = 'SouthEast';
    DROP VIEW IF EXISTS VistaDIVISION_SUDESTE_JUGADORES;		CREATE VIEW	VistaDIVISION_SUDESTE_JUGADORES			AS SELECT * FROM NBA.jugadores		where Nombre 	  IN (select nombre from VistaDIVISION_SUDESTE_EQUIPOS);
	DROP VIEW IF EXISTS VistaDIVISION_SUDESTE_ESTADISTICAS;  	CREATE VIEW	VistaDIVISION_SUDESTE_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaDIVISION_SUDESTE_JUGADORES);
    DROP VIEW IF EXISTS VistaDIVISION_SUDESTE_PARTIDOS;			CREATE VIEW	VistaDIVISION_SUDESTE_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaDIVISION_SUDESTE_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaDIVISION_ATLANTICA_EQUIPOS);


#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Central

    DROP VIEW IF EXISTS VistaDIVISION_CENTRAL_EQUIPOS;			CREATE VIEW	VistaDIVISION_CENTRAL_EQUIPOS			AS SELECT * FROM NBA.equipos		where Division = 'Central';
	DROP VIEW IF EXISTS VistaDIVISION_CENTRAL_JUGADORES;		CREATE VIEW	VistaDIVISION_CENTRAL_JUGADORES			AS SELECT * FROM NBA.jugadores		where Nombre 	  IN (select nombre from VistaDIVISION_SUDESTE_EQUIPOS);
    DROP VIEW IF EXISTS VistaDIVISION_CENTRAL_ESTADISTICAS;		CREATE VIEW	VistaDIVISION_CENTRAL_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaDIVISION_CENTRAL_JUGADORES);
	DROP VIEW IF EXISTS VistaDIVISION_CENTRAL_PARTIDOS;			CREATE VIEW	VistaDIVISION_CENTRAL_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaDIVISION_CENTRAL_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaDIVISION_CENTRAL_EQUIPOS);


#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Pacífico

	DROP VIEW IF EXISTS VistaDIVISION_PACIFIC_EQUIPOS;			CREATE VIEW	VistaDIVISION_PACIFIC_EQUIPOS			AS SELECT * FROM NBA.equipos		where Division = 'Pacific';
	DROP VIEW IF EXISTS VistaDIVISION_PACIFIC_JUGADORES;		CREATE VIEW	VistaDIVISION_PACIFIC_JUGADORES			AS SELECT * FROM NBA.jugadores 		where Nombre 	  IN (select nombre from VistaDIVISION_PACIFIC_EQUIPOS);
    DROP VIEW IF EXISTS VistaDIVISION_PACIFIC_ESTADISTICAS;		CREATE VIEW	VistaDIVISION_PACIFIC_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaDIVISION_PACIFIC_JUGADORES);
	DROP VIEW IF EXISTS VistaDIVISION_PACIFIC_PARTIDOS;			CREATE VIEW VistaDIVISION_PACIFIC_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaDIVISION_PACIFIC_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaDIVISION_PACIFIC_EQUIPOS);


#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Sudoeste

	DROP VIEW IF EXISTS VistaDIVISION_SUDOESTE_EQUIPOS;			CREATE VIEW	VistaDIVISION_SUDOESTE_EQUIPOS			AS SELECT * FROM NBA.equipos		where Division = 'SouthWest';
    DROP VIEW IF EXISTS VistaDIVISION_SUDOESTE_JUGADORES;		CREATE VIEW	VistaDIVISION_SUDOESTE_JUGADORES		AS SELECT * FROM NBA.jugadores		where Nombre 	  IN (select nombre from VistaDIVISION_SUDOESTE_EQUIPOS);
	DROP VIEW IF EXISTS VistaDIVISION_SUDOESTE_ESTADISTICAS; 	CREATE VIEW	VistaDIVISION_SUDOESTE_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaDIVISION_SUDOESTE_JUGADORES);
    DROP VIEW IF EXISTS VistaDIVISION_SUDOESTE_PARTIDOS;		CREATE VIEW	VistaDIVISION_SUDOESTE_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaDIVISION_SUDOESTE_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaDIVISION_SUDOESTE_EQUIPOS);


#		Vista de Equipos, Jugadores, Estadísticas y Partidos sobre la División Noroeste

    DROP VIEW IF EXISTS VistaDIVISION_NOROESTE_EQUIPOS;			CREATE VIEW	VistaDIVISION_NOROESTE_EQUIPOS			AS SELECT * FROM NBA.equipos		where Division = 'NorthWest';
	DROP VIEW IF EXISTS VistaDIVISION_NOROESTE_JUGADORES;		CREATE VIEW	VistaDIVISION_NOROESTE_JUGADORES		AS SELECT * FROM NBA.jugadores		where Nombre 	  IN (select nombre from VistaDIVISION_NOROESTE_EQUIPOS);
    DROP VIEW IF EXISTS VistaDIVISION_NOROESTE_ESTADISTICAS;	CREATE VIEW	VistaDIVISION_NOROESTE_ESTADISTICAS		AS SELECT * FROM NBA.estadisticas	where jugador 	  IN (select codigo from VistaDIVISION_NOROESTE_JUGADORES);
	DROP VIEW IF EXISTS VistaDIVISION_NOROESTE_PARTIDOS;		CREATE VIEW	VistaDIVISION_NOROESTE_PARTIDOS			AS SELECT * FROM NBA.partidos		where EquipoLocal IN (select nombre from VistaDIVISION_NOROESTE_EQUIPOS) AND EquipoVisitante IN (select nombre from VistaDIVISION_NOROESTE_EQUIPOS);




#--------------------------------------------------------------------------------------------
#	4. ASIGNAMOS PRIVILEGIOS (O PERMISOS) A LOS ROLES
#--------------------------------------------------------------------------------------------
#	GRANT <privilegio>	ON <vista>	TO 	<rol>
#--------------------------------------------------------------------------------------------

GRANT ALL ON VistaNBA_EQUIPOS TO nba;
GRANT ALL ON VistaNBA_JUGADORES TO nba;
GRANT ALL ON VistaNBA_ESTADISTICAS TO nba;
GRANT ALL ON VistaNBA_PARTIDOS TO nba;
#GRANT ALL PRIVILEGES ON *.* TO nba;   # esto tb otorgaprivilegios sobre las tablas que no son las vistas.

GRANT ALL ON VistaCONFERENCIA_ESTE_EQUIPOS TO conferencia_este, nba;
GRANT ALL ON VistaCONFERENCIA_ESTE_JUGADORES TO conferencia_este, nba;
GRANT ALL ON VistaCONFERENCIA_ESTE_ESTADISTICAS TO conferencia_este, nba;
GRANT ALL ON VistaCONFERENCIA_ESTE_PARTIDOS TO conferencia_este, nba;

GRANT ALL ON VistaCONFERENCIA_OESTE_EQUIPOS TO conferencia_oeste, nba;
GRANT ALL ON VistaCONFERENCIA_OESTE_JUGADORES TO conferencia_oeste, nba;
GRANT ALL ON VistaCONFERENCIA_OESTE_ESTADISTICAS TO conferencia_oeste, nba;
GRANT ALL ON VistaCONFERENCIA_OESTE_PARTIDOS TO conferencia_oeste, nba;

GRANT ALL ON VistaDIVISION_ATLANTICA_EQUIPOS TO division_atlantico, nba;
GRANT ALL ON VistaDIVISION_ATLANTICA_JUGADORES TO division_atlantico, nba;
GRANT ALL ON VistaDIVISION_ATLANTICA_ESTADISTICAS TO division_atlantico, nba;
GRANT ALL ON VistaDIVISION_ATLANTICA_PARTIDOS TO division_atlantico, nba;

GRANT ALL ON VistaDIVISION_SUDESTE_EQUIPOS TO division_sudeste, nba;
GRANT ALL ON VistaDIVISION_SUDESTE_JUGADORES TO division_sudeste, nba;
GRANT ALL ON VistaDIVISION_SUDESTE_ESTADISTICAS TO division_sudeste, nba;
GRANT ALL ON VistaDIVISION_SUDESTE_PARTIDOS TO division_sudeste, nba;

GRANT ALL ON VistaDIVISION_CENTRAL_EQUIPOS TO division_central, nba;
GRANT ALL ON VistaDIVISION_CENTRAL_JUGADORES TO division_central, nba;
GRANT ALL ON VistaDIVISION_CENTRAL_ESTADISTICAS TO division_central, nba;
GRANT ALL ON VistaDIVISION_CENTRAL_PARTIDOS TO division_central, nba;

GRANT ALL ON VistaDIVISION_PACIFICO_EQUIPOS TO division_pacifico, nba;
GRANT ALL ON VistaDIVISION_PACIFICO_JUGADORES TO division_pacifico, nba;
GRANT ALL ON VistaDIVISION_PACIFICO_ESTADISTICAS TO division_pacifico, nba;
GRANT ALL ON VistaDIVISION_PACIFICO_PARTIDOS TO division_pacifico, nba;

GRANT ALL ON VistaDIVISION_SUDOESTE_EQUIPOS TO division_sudoeste, nba;
GRANT ALL ON VistaDIVISION_SUDOESTE_JUGADORES TO division_sudoeste, nba;
GRANT ALL ON VistaDIVISION_SUDOESTE_ESTADISTICAS TO division_sudoeste, nba;
GRANT ALL ON VistaDIVISION_SUDOESTE_PARTIDOS TO division_sudoeste, nba;

GRANT ALL ON VistaDIVISION_NOROESTE_EQUIPOS TO division_noroeste, nba;
GRANT ALL ON VistaDIVISION_NOROESTE_JUGADORES TO division_noroeste, nba;
GRANT ALL ON VistaDIVISION_NOROESTE_ESTADISTICAS TO division_noroeste, nba;
GRANT ALL ON VistaDIVISION_NOROESTE_PARTIDOS TO division_noroeste, nba;

   
#--------------------------------------------------------------------------------------------
#	5. 	BORRAMOS Y CREAMOS LOS USUARIOS, ASINGNÁNDOLES POR DEFECTO SU ROL ASOCIADO
#	Los usuarios serán creados todos con la misma clave 'abc'
#--------------------------------------------------------------------------------------------
#	CREATE USER <usuario>	IDENTIFIED BY <clave>	DEFAULT ROLE <rol>
#--------------------------------------------------------------------------------------------
#	Fulgencio y Fulgencia
#	Guillermino y Guillermina
#	Pancracio y Pancracia
#	Filomeno y Filomena
#	Anaximandro y Anaximandra
#	Romino y Romina
#	Agapito y Agapita
#	Apolonio y Apolonia
#	Luzdivino y Luzdivina
#--------------------------------------------------------------------------------------------



#	Fulgencio y Fulgencia
	DROP USER IF EXISTS Fulgencio;
    CREATE USER Fulgencio IDENTIFIED BY 'abc';		GRANT nba TO Fulgencio; 				SET DEFAULT ROLE nba for Fulgencio;  
	DROP USER IF EXISTS Fulgencia;
    CREATE USER Fulgencia IDENTIFIED BY 'abc'; 		GRANT nba TO Fulgencia;					SET DEFAULT ROLE nba for Fulgencia;
    
#	Guillermino y Guillermina
	DROP USER IF EXISTS Guillermino;
 	CREATE USER Guillermino IDENTIFIED BY 'abc';	GRANT conferencia_este TO Guillermino; 	SET DEFAULT ROLE conferencia_este for Guillermino;
	DROP USER IF EXISTS Guillermina;
	CREATE USER Guillermina IDENTIFIED BY 'abc'; 	GRANT conferencia_este TO Guillermina;	SET DEFAULT ROLE conferencia_este for Guillermina;
    
#	Pancracio y Pancracia
	DROP USER IF EXISTS Pancracio;
    CREATE USER Pancracio IDENTIFIED BY 'abc';		GRANT conferencia_oeste TO Pancracio; 	SET DEFAULT ROLE conferencia_oeste for Pancracio;
	DROP USER IF EXISTS Pancracia;
    CREATE USER Pancracia IDENTIFIED BY 'abc'; 		GRANT conferencia_oeste TO Pancracia;	SET DEFAULT ROLE conferencia_oeste for Pancracia;
    
#	Filomeno y Filomena
	DROP USER IF EXISTS Filomeno;
    CREATE USER Filomeno IDENTIFIED BY 'abc';		GRANT division_atlantico TO Filomeno; 	SET DEFAULT ROLE division_atlantico for Filomeno;
	DROP USER IF EXISTS Filomena;
    CREATE USER Filomena IDENTIFIED BY 'abc'; 		GRANT division_atlantico TO Filomena;	SET DEFAULT ROLE division_atlantico for Filomena;
    
#	Anaximandro y Anaximandra
	DROP USER IF EXISTS Anaximandro;
 	CREATE USER Anaximandro IDENTIFIED BY 'abc';	GRANT division_sudeste TO Anaximandro; 	SET DEFAULT ROLE division_sudeste for Anaximandro;
	DROP USER IF EXISTS Anaximandra;
	CREATE USER Anaximandra IDENTIFIED BY 'abc'; 	GRANT division_sudeste TO Anaximandra; 	SET DEFAULT ROLE division_sudeste for Anaximandra;

#	Romino y Romina
	DROP USER IF EXISTS Romino;
    CREATE USER Romino IDENTIFIED BY 'abc';			GRANT division_central TO Romino; 		SET DEFAULT ROLE division_central for Romino;
	DROP USER IF EXISTS Romina;
    CREATE USER Romina IDENTIFIED BY 'abc'; 		GRANT division_central TO Romina;		SET DEFAULT ROLE division_central for Romina;
    
#	Agapito y Agapita
	DROP USER IF EXISTS Agapito;
    CREATE USER Agapito IDENTIFIED BY 'abc';		GRANT division_pacifico TO Agapito; 	SET DEFAULT ROLE division_pacifico for Agapito;
	DROP USER IF EXISTS Agapita;
    CREATE USER Agapita IDENTIFIED BY 'abc'; 		GRANT division_pacifico TO Agapita;		SET DEFAULT ROLE division_pacifico for Agapita;
    
#	Apolonio y Apolonia
	DROP USER IF EXISTS Apolonio;
    CREATE USER Apolonio IDENTIFIED BY 'abc';		GRANT division_sudoeste TO Apolonio; 	SET DEFAULT ROLE division_sudoeste for Apolonio;
	DROP USER IF EXISTS Apolonia;
    CREATE USER Apolonia IDENTIFIED BY 'abc'; 		GRANT division_sudoeste TO Apolonia;	SET DEFAULT ROLE division_sudoeste for Apolonia;
    
#	Luzdivino y Luzdivina
	DROP USER IF EXISTS Luzdivino;
    CREATE USER Luzdivino IDENTIFIED BY 'abc';		GRANT division_noroeste TO Luzdivino; 	SET DEFAULT ROLE division_noroeste for Luzdivino;
	DROP USER IF EXISTS Luzdivina;
    CREATE USER Luzdivina IDENTIFIED BY 'abc'; 		GRANT division_noroeste TO Luzdivina;	SET DEFAULT ROLE division_noroeste for Luzdivina;
	
	 
#--------------------------------------------------------------------------------------------
#	6. REFRESCA LOS PRIVILEGIOS
#--------------------------------------------------------------------------------------------
#	FLUSH PRIVILEGES;
#--------------------------------------------------------------------------------------------
	FLUSH PRIVILEGES;
