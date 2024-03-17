Algoritmo diasMes
	Definir dia Como Entero;
	Definir  diasTotales Como Entero;
	
	Escribir " Dime un día: ";
	leer dia
	diasTotales = 0;
	
	Mientras dia <> -1 Hacer
		Escribir "Dime otro dia";
		leer dia;
		Si dia < 32 y dia >0 Entonces
			diasTotales = diasTotales +1
		SiNo 
			Si dia <> -1 Entonces
				Escribir" Error: día inválido ";	
			Fin Si
			
		Fin Si
		
	Fin Mientras
	Escribir "Se han introducido un total de " diasTotales+1 " días";
	
FinAlgoritmo
