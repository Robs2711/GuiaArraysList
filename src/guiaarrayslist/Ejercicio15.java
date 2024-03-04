package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio15 {
    public static void main(String[] args) {
         ArrayList<String> primerConjuntoPokemon = new ArrayList<>();
        primerConjuntoPokemon.add("Pikachu");
        primerConjuntoPokemon.add("Charizard");
        primerConjuntoPokemon.add("Bulbasaur");
        ArrayList<String> segundoConjuntoPokemon = new ArrayList<>();
        segundoConjuntoPokemon.add("Squirtle");
        segundoConjuntoPokemon.add("Jigglypuff");
        primerConjuntoPokemon.addAll(segundoConjuntoPokemon);
        System.out.println("Lista resultante después de la unión:");
        for (String nombre : primerConjuntoPokemon) {
            System.out.println("\"" + nombre + "\"");
        }
    }
}
