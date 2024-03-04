package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio17 {
    public static void main(String[] args) {
     ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        nomb.clear();
        if (nomb.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }
    }
}
