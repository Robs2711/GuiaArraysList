package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio19 {
    public static void main(String[] args) {
       ArrayList<String> nomb = new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        int nCap = 3;
        ArrayList<String> nuevoArrayList = new ArrayList<>(nomb.subList(0, nCap));
        nomb = nuevoArrayList;
        System.out.println("Lista después de reducir la capacidad:");
        for (String nombre : nomb) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}