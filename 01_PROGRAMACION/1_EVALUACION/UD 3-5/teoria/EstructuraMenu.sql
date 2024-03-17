            do {
			// println’s con opciones de menú
			System.out.println("1.- Opción 1");
     			System.out.println("2.- Opción 2");
			System.out.println("3.- Salir");
			System.out.println("Seleccione opción:");
			opcion=sc.nextInt();
							
			switch (opcion) {
				case 1: // Opción 1
						break;

				case 2: // Opción 2
						break;
				
				case 3: System.out.println("Hasta Pronto!");      
						break;

				default: System.out.println("Opción no válida."); 
						break;
			}
            }while (cont !=3);