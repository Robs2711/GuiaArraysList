package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio09 {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("Pikachu");
        original.add("Charizard");
        original.add("Bulbasaur");
        original.add("Squirtle");
        original.add("Jigglypuff");
        ArrayList<String> copia = new ArrayList<>();
        copia.addAll(original);
        System.out.println("ArrayList original: " + original);
        System.out.println("ArrayList copia: " + copia);
    }
}
