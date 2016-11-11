import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> Vehiculos = new ArrayList<>();
        Coche coche = new Coche("7894-AA", 4);
        Microbus microbus = new Microbus("7894-BB",10);
        Furgoneta furgoneta = new Furgoneta("7894-CC", 3.5);
        Camion camion = new Camion("7894-DD",10);

        Vehiculos.add(coche);
        Vehiculos.add(microbus);
        Vehiculos.add(furgoneta);
        Vehiculos.add(camion);

        Vehiculos.forEach(vehiculo -> System.out.println(vehiculo.getMatricula()+ " - 1 mes: "+vehiculo.precioTotal(30)+" €"));

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce la matricula:");
            String m = buffer.readLine();
            System.out.println("Dias de alquiler del vehiculo:");
            int d = Integer.parseInt(buffer.readLine());
            Vehiculo v = Vehiculos.stream().filter(vehiculo -> vehiculo.getMatricula().equalsIgnoreCase(m)).findFirst().orElse(null);
            if (v==null){
                System.out.println("No existe ningun vehiculo con esa matricula.");
            }else{
                System.out.println(v.precioTotal(d)+" €");
            }
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}
