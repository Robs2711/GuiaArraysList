package guiaarrayslist;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio11 {
    public static void main(String[] args) {
       ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        System.out.println("Lista original:");
        for (String nombre : nomb) {
            System.out.println("\"" + nombre + "\"");
        }
        Collections.reverse(nomb);
        System.out.println("\nLista despues de invertir los elementos:");
        for (String nombre : nomb) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}