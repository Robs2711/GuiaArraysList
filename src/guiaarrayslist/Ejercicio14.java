package guiaarrayslist;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio14 {
    public static void main(String[] args) {
      ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        int indice1 = 0;
        int indice2 = 4;
        Collections.swap(nomb, indice1, indice2);
        System.out.println("Lista después del intercambio:");
        for (String nombre : nomb) {
            System.out.println(nombre);
        }
    }
}
