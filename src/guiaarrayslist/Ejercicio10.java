package guiaarrayslist;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio10 {
    public static void main(String[] args) {
         ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        Collections.shuffle(nomb);
        System.out.println("Lista mezclada:");
        for (String nombre : nomb) {
            System.out.println("\"" + nombre + "\"");
        }
    }  
}