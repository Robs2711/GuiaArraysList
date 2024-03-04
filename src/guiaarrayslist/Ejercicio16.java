package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio16 {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("Pikachu");
        original.add("Charizard");
        original.add("Bulbasaur");
        ArrayList<String> clon = new ArrayList<>(original);
        System.out.println("ArrayList original: " + original);
        System.out.println("ArrayList clon: " + clon);
    }  
}
