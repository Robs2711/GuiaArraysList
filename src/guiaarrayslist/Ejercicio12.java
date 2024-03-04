package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio12 {
    public static void main(String[] args) {
         ArrayList<String> nomb = new ArrayList<>();
        nomb.add("Pikachu");
        nomb.add("Charizard");
        nomb.add("Bulbasaur");
        nomb.add("Squirtle");
        nomb.add("Jigglypuff");
        int iInicio = 1;
        int iFin = 4;
        ArrayList<String> pExtraida = new ArrayList<>(nomb.subList(iInicio, iFin));
        System.out.println("Porción extraída:");
        for (String nombre : pExtraida) {
            System.out.println(nombre);
        }
    }
}