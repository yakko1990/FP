/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasEjercicios.f_Alquilervehiculos;

/**
 *
 * @author nccasares
 */
public class VehiculosAlquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancias de la clase vehiculo
        Vehiculo vehiculo1= new Vehiculo("4050 ABJ",
                                        "VW",
                                        "GTI",
                                        "Blanco",
                                        100.0);
        
        System.out.print("Datos del vehículo"+vehiculo1.getAtributos());
    
        Vehiculo vehiculo2= new Vehiculo("2345 JVM",
                                        "SEAT",
                                        "Leon",
                                        "Negro",
                                        80.0);
        //Instancias de la clase cliente
        
        Cliente cliente1=new Cliente("30435624X","Juan","Perez");
        
        //instancia de la clase VehiculoAlquilado
        //relaciona cliente1 con el vehiculo1->se alquila con fecha 11/11/2023
        //durante 2 dias
        
        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1,
                                                            vehiculo1,
                                                            11,
                                                            11,
                                                            2023,
                                                            2);

        
        //datos del cliente y vehículo alquilado
        System.out.println("Vehículo alquilado");
        System.out.println("Cliente : " + 
                            alquiler1.getCliente().getNif()+""+
                            alquiler1.getCliente().getNombre()+""+
                            alquiler1.getCliente().getApellidos());
        System.out.println("Vehiculo: " +
                            alquiler1.getVehiculo().getMatricula());
         
        Vehiculo miVehiculo=new Vehiculo("4050 ABJ","VW","GTI","Blanco",100.0);
        Turismo miTurismo = new Turismo("4060 TUR","Skoda","Fabia","Blanco",90.0,2,false);
        Deportivo miDeportivo = new Deportivo ("4080 DEP","Ford","Mustang","Rojo",150.0,2000);
        Furgoneta miFurgoneta = new Furgoneta ("4080 FUR","Fiat","Ducato","Azul",80.0,1200,8);
        
        System.out.println("Vehiculo :"+miVehiculo.getAtributos());
        
        System.out.println("Turismo :"+miTurismo.getAtributos());
        
        System.out.println("Deportivo :"+miDeportivo.getAtributos());
        
        System.out.println("Furgoneta :"+miFurgoneta.getAtributos());
        
        //Invocacion métodos de vehiculo q es superclase
        System.out.print("Turismo : "+
                        miTurismo.getMatricula()+" "+
                        miTurismo.getMarca()+" "+
                        miTurismo.getModelo());
        
        //casting
        //upcasting->conversion ascendente de tipos.Siempre se puede realizar
        Vehiculo miVehiculoCasting = new Turismo ("4090 TUR",
                                            "Skoda","Fabia",
                                            "Negro",
                                            90.0,
                                            2,
                                            true);
        
        System.out.println("Vehículo "+miVehiculoCasting.getAtributos());
        
        //Se le puede asignar referencia existente da la clase Turismo
        miVehiculo=miTurismo;
        
        System.out.println("Vehiculo :"+miVehiculo.getAtributos());
        
        //Conversion descendente->downcasting
        Turismo miNuevoTurismo = (Turismo) miVehiculoCasting;
    }   
    
}
