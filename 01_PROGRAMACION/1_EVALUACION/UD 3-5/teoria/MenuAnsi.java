import java.util.Scanner;

public class MenuAnsi {
	public static void main (String[] args) {//throws IOException{ 
			Scanner sc = new Scanner(System.in);
			int opcion;
			
			// Los códigos ANSI no son soportados por todos los terminales
			// ANSI: Borra pantalla y va al inicio
			System.out.print("\u001b[2J\u001b[H"); 	

			// ANSI: Negrita (o cambio de color)	
		    	System.out.print("\u001b[1m"); 
			
		    	System.out.println("Menú de opciones");
	     		System.out.println("----------------");

			// ANSI: Restaura a Normal
     			System.out.print("\u001b[0m"); 
			
     			System.out.println("1.- Suma");
     			System.out.println("2.- Resta");
     			System.out.println("3.- Multiplicación");
     			System.out.println("4.- División\n\n");
     			System.out.println("Teclee opción (1-4)");
			opcion=sc.nextInt();
							
			switch (opcion) {
				case 1: // Subprograma de suma
						break;
				case 2: // Subprograma de resta   
						break;
				case 3: // Subprograma de multiplicación      
						break;
				case 4: //Subprograma de división       
						break;
				default:System.out.println("Opción no válida.\nEl programa finalizará."); 
						break;
			}
			// ANSI: Video Inverso (Se invierte color fondo y letra)
			System.out.println("\u001b[7mHasta otra!\u001b[0m"); 
		}
}
