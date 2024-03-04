package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio20 {
    public static void main(String[] args) {
       ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        int nTam= 5;
        while (nomb.size() < nTam) {
            nomb.add(null);
        }
        System.out.println("Lista después de aumentar el tamaño:");
        for (String nombre : nomb) {
            System.out.println(nombre);
        }
    }
}
