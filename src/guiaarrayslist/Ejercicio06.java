package guiaarrayslist;
import java.util.Arrays;
public class Ejercicio06 {
    public static void main(String[] args) {
        String[] list = new String[5];
        list[0] = "Pikachu";
        list[1] = "Charizard";
        list[2] = "Bulbasaur";
        list[3] = "Squirtle";
        list[4] = "Jigglypuff";
        System.out.println("Pokemones originales: " +Arrays.toString(list));
        String pokelim = list[2];
        System.arraycopy(list, 3, list, 2, 2);
        list[4] = null;
        System.out.println("Tercer pokemon eliminado: " +Arrays.toString(list));
    } 
}
