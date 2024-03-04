package guiaarrayslist;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String[] nomb = new String[10];
        for (int i = 0; i < nomb.length; i++) {
            System.out.print("Ingrese el nombre del pokemon" + (i + 1) + ": ");
            nomb[i] = scanner.nextLine();
        }
        System.out.print("Ingrese el indice a bucar: ");
        int i = scanner.nextInt();
        if (i >= 0 && i < nomb.length) {
            System.out.println("El nombre del indice solicitado" + i+ " es: " + nomb[i]);
        } else {
            System.out.println("No se encontro el indice, por favor pruebe con otro");
        }
        scanner.close();
    }
}
