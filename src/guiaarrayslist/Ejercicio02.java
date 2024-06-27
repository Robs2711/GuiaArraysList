package guiaarrayslist;
import java.util.ArrayList;
public class Ejercicio02 {
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
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        ArrayList<Character> caracteres = new ArrayList<>();
        for (char c = 'A'; c <= 'J'; c++) {
            caracteres.add(c);
        }
        System.out.println("Nombres de Pokémon:");
        for (String nombre : nomb) {
            System.out.println(nombre);
        }        
        System.out.println("\nNúmeros:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("\nCaracteres:");
        for (char caracter : caracteres) {
            System.out.println(caracter);
        }
       }
    }