import java.util.ArrayList;
import java.util.List;

//import models.genericos.Caja;
import models.genericos.Par;
import models.genericos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Caja<String> cajaString = new Caja<>();
         * Caja<Integer> cajaInteger = new Caja<>();
         * Caja<Persona> cajaPersona = new Caja<>();
         * 
         * Par<String,Integer> par = new Par<>();
         * 
         * Persona persona = new Persona();
         * 
         * persona.setNombre("Alex");
         * persona.setEdad(20);
         * 
         * cajaString.guardar("Guardado un String");
         * cajaInteger.guardar(10);
         * cajaPersona.guardar(persona);
         * 
         * System.out.println(cajaString.obtener());
         * System.out.println(cajaInteger.obtener());
         * System.out.println(cajaPersona.obtener());
         * System.out.println(cajaPersona.obtener().getNombre());
         * 
         * par.establecerPar("Hola", 21);
         * 
         * System.out.println(par.obtenerClave());
         * System.out.println(par.obtenerValor());
         */
        // ----------------------------------------------------

        Persona[] personas = {
                new Persona("Jaime", 20),
                new Persona("Pablo",17),
                new Persona("Fabian",22),
                new Persona("Adrian",16),
                new Persona("Paula",19),
                new Persona("Evelyn",15),
                new Persona("Alejandra",23),
                new Persona("Estefania",14),
                new Persona("Carlos",25),
                new Persona("Miguel",21)
        };

        List<Par<String, Integer>> mayores = new ArrayList<>();
        List<Par<Integer, String>> menores = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                Par<String, Integer> parMayor = new Par<>();
                parMayor.establecerPar(persona.getNombre(), persona.getEdad());
                mayores.add(parMayor);
            } else {
                Par<Integer, String> parMenor = new Par<>();
                parMenor.establecerPar(persona.getEdad(), persona.getNombre());
                menores.add(parMenor);
            }
        }

        System.out.println("Mayores de edad:");
        for (Par<String, Integer> mayor : mayores) {
            System.out.println(mayor.obtenerClave() + " - " + mayor.obtenerValor());
        }

        System.out.println("\nMenores de edad:");
        for (Par<Integer, String> menor : menores) {
            System.out.println(menor.obtenerClave()+" - " + menor.obtenerValor());
        }
    }

}
