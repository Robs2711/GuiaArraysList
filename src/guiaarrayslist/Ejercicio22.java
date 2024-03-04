package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio22 {
    public static void main(String[] args) {
     ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        nomb.add("Eevee");
        nomb.add("Mewtwo");
        nomb.add("Gyarados");
        nomb.add("Snorlax");
        nomb.add("Vulpix");
        for (int i = 0; i < nomb.size(); i++) {
            System.out.println("Elemento en la posición " + i + ": " + nomb.get(i));
        }
    } 
}
