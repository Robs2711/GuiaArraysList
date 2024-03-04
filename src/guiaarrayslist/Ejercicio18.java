package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio18 {
    public static void main(String[] args) {
     ArrayList<String> nombresPokemon = new ArrayList<>();
        if (nombresPokemon.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }
    }
}
