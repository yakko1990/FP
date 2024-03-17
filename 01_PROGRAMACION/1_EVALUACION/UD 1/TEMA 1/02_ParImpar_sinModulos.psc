//Escribir un Pseudocódigo que reciba un número 
// y compruebe si es par o impar
Algoritmo parImpar
	Definir resultado como Cadena;
	Definir N Como Entero;
	Escribir "Ingrese el numero: ";
	Leer N;
	
	Si N % 2 = 0 Entonces
		resultado <- "par"
	SiNo
		resultado <- "impar"
	FinSi
	
	Escribir "El número introducido es ", resultado;	
FinAlgoritmo
