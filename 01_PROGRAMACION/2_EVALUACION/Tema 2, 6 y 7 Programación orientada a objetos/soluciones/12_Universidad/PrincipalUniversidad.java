package MasEjercicios.Universidad;

public class PrincipalUniversidad {

    public static void main(String[] args) {

        Persona[] universidad = new Persona[7];

        universidad[0] = new Persona("Tom Jones", 21, "11111111A", 'H', 65, 179 );
        universidad[1] = new Persona("Marta Garcia", 18, "22222222B", 'M', 50, 163 );
        universidad[2] = new Alumnado("Informática", "Ingeniería Informática", "Mario fernandez", 18, "33333333C", 'M', 50, 163 );
        universidad[3] = new Alumnado("Industriales", "Ingeniería Industrial", "Pablo Lopez", -27, "44444444D", 'U', 70, 182 );  ///// sexo y edad incorrecta
        universidad[4] = new AlumnadoInternacional("Alemania","Industriales", "Ingeniería Industrial", "Paula Perez", 26, "", 'M', 60, 170 );
        universidad[5] = new Docente("Programacion", "Jose Antonio Moreno", 15, "55555555E", 'H', 80, 183 );        //////// menor de edad
        universidad[6] = new Docente("Bases de datos", "Maria Jose Fernandez", 52, "77777777F", 'M', 68, 165 );

        for (Persona p: universidad) {
            p.mostrarInfo();
        }
    }
}