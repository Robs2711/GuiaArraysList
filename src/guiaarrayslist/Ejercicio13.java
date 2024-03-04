package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio13 {
    public static void main(String[] args) {
               ArrayList<String> primerosPokemon = new ArrayList<>();
        primerosPokemon.add("Pikachu");
        primerosPokemon.add("Charizard");
        primerosPokemon.add("Bulbasaur");
        ArrayList<String> segundosPokemon = new ArrayList<>();
        segundosPokemon.add("Bulbasaur");
        segundosPokemon.add("Squirtle");
        segundosPokemon.add("Jigglypuff");
        if (primerosPokemon.equals(segundosPokemon)) {
            System.out.println("Los conjuntos de Pokémon son iguales");
        } else {
            System.out.println("Los conjuntos de Pokémon no son iguales");
        }
    }
}
