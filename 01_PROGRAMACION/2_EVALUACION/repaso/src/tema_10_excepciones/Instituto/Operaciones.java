package tema_10_excepciones.Instituto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {
    public static Alumno altaAlumno () {
        Scanner sc = new Scanner(System.in);
        String dni, nombre, direccion, ciclo;
        int edad;
        double notaMedia, importeMat;
        Date fechaInc;
        boolean datosValidos = false;
        do {
            try {
                System.out.println("Introduzca nombre, Dni, edad, direccion");
                nombre = sc.nextLine();
                dni = sc.nextLine();
                edad = sc.nextInt();
                sc = new Scanner(System.in);
                direccion = sc.nextLine();

                System.out.println("Introduzca ahora ciclo, nota media, importe de matrícula");
                ciclo = sc.nextLine();
                notaMedia = sc.nextDouble();
                importeMat = sc.nextDouble();
                sc = new Scanner(System.in);

                System.out.println("Introduzca fecha de matriculacion (dd/MM/yyyy)");
                fechaInc = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                datosValidos = true;
                return new Alumno(ciclo, notaMedia, importeMat, fechaInc, dni, nombre, edad, direccion);
            } catch (ParseException | InputMismatchException e) {
                datosValidos = false;
                System.out.println("ERROR: Los datos introducidos no son correctos");
            }
        } while (!datosValidos);
        return null;
    }

    public static Profesor altaProfesor(ArrayList<Especialidad> esp) {
        Scanner sc = new Scanner(System.in);
        String dni, nombre, direccion, tipoJornada;
        int edad, idEsp;
        double sueldo;
        Date fechaInc;
        boolean datosValidos = false;
        do {
            try {
                System.out.println("Introduzca nombre, Dni, edad, direccion");
                nombre = sc.nextLine();
                dni = sc.nextLine();
                edad = sc.nextInt();
                sc = new Scanner(System.in);
                direccion = sc.nextLine();

                System.out.println("Introduzca ahora tipo de jornada y sueldo");
                tipoJornada = sc.nextLine();
                sueldo = sc.nextDouble();
                sc = new Scanner(System.in);

                System.out.println("Las especialidades disponibles son:");
                System.out.println(esp.toString());

                System.out.println("Introduzca ahora el identificador de la especialidad");
                idEsp = sc.nextInt();
                sc = new Scanner(System.in);

                System.out.println("Introduzca fecha de incorporación al centro (dd/MM/yyyy)");
                fechaInc = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                datosValidos = true;
                return new Profesor(tipoJornada, sueldo, esp.get(idEsp), fechaInc, dni, nombre, edad, direccion);
            } catch (ParseException | InputMismatchException e) {
                datosValidos = false;
                System.out.println("ERROR: Los datos introducidos no son correctos");
            }
        } while (!datosValidos);
        return null;
    }

    public static void consultas (int cod, ArrayList<Miembro> miembros) {
        for (Miembro m : miembros) {
            System.out.println("____________________");
            if (cod == 1 && m instanceof Alumno)
                System.out.println(m.toString());
            if (cod == 2 && m instanceof Profesor)
                System.out.println(m.toString());
        }
    }

    public static void edadMediaProfesorado (ArrayList<Miembro> miembros) {
        int sumaEdad = 0;
        int contProfesores = 0;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i) instanceof Profesor) {
                sumaEdad += ((Profesor) miembros.get(i)).getEdad();
                contProfesores++;
            }
        }
        System.out.println("La edad media de los profesores es: " + sumaEdad/contProfesores);
    }

    public static void notaMediaDAM(ArrayList<Miembro> miembros) {
        double sumaNotas = 0;
        int contAlumnos = 0;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i) instanceof Alumno && ((Alumno) miembros.get(i)).getCiclo().equalsIgnoreCase("DAM")) {
                sumaNotas += ((Alumno) miembros.get(i)).getNotaMedia();
                contAlumnos++;
            }
        }
        System.out.println("La nota media de los alumnos de DAM es: " + sumaNotas/contAlumnos);
    }

    public static void sueldoMedioProfesorado (ArrayList<Miembro> miembros) {
        int sumaSueldos = 0;
        int contProfesores = 0;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i) instanceof Profesor) {
                sumaSueldos += ((Profesor) miembros.get(i)).getSueldo();
                contProfesores++;
            }
        }
        System.out.println("El sueldo medio de los profesores es: " + sumaSueldos/contProfesores);
    }
}
