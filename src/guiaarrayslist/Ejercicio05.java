package guiaarrayslist;
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
              String[] nomb = new String[5];
        nomb[0] = "Pikachu";
        nomb[1] = "Charizard";
        nomb[2] = "Bulbasaur";
        nomb[3] = "Squirtle";
        nomb[4] = "Jigglypuff";
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 nombres originales:");
        for (int i = 0; i < nomb.length; i++) {
            System.out.println((i + 1) + ". " + nomb[i]);
        }
        System.out.println("\nCual quiere reemplazar?:");
        String nombaremplazar = scanner.nextLine();
        System.out.println("Ingrese el nuevo pokemon:");
        String newNomb= scanner.nextLine();

        int nombremplazado = -1;
        for (int i = 0; i < nomb.length; i++) {
            if (nomb[i].equals(nombaremplazar)) {
                nombremplazado = i;
                break;
            }
        }
        if (nombremplazado != -1) {
            nomb[nombremplazado] = newNomb;
            System.out.println("\nEstos son los nombres actuales:");
            for (int i = 0; i < nomb.length; i++) {
                System.out.println((i + 1) + ". " + nomb[i]);
            }
        } else {
            System.out.println("Hubo un error al encontrar el nombre");
        }
        scanner.close();
    }
    
}
