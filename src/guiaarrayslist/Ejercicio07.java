package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio07 {
    public static void main(String[] args) {
        ArrayList<String> nomb= new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        String dtobuscar = "Jigglypuff";
        int indice = nomb.indexOf(dtobuscar);
        if (indice != -1) {
            System.out.println("El elemento \"" + dtobuscar+ "\" se encuentra en la posición " + indice + " de la lista.");
        } else {
            System.out.println("El elemento \"" + dtobuscar+ "\" no se encuentra en la lista.");
        }
    }
}