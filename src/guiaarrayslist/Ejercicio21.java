package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio21 {
    public static void main(String[] args) {
       ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        String nuevoPokemon = "Venusaur";
        nomb.set(1, nuevoPokemon);
        System.out.println("Lista después de reemplazar el segundo elemento:");
        for (String nombre : nomb) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}