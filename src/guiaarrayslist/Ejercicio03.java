package guiaarrayslist;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      String[] nomb= new String[4];
     for(int i=0;i<nomb.length;i++){
         System.out.println("Ingrese el nombre de los pokemones"+i+1+":");
         nomb[i]= scanner.nextLine();
     }
     System.out.println("Ingrese el pokemon extra");
     String extraNomb= scanner.nextLine();
     String[] newNomb= new String[nomb.length+1];
     newNomb[0]=extraNomb;
     for(int i=0;i<nomb.length;i++){
         newNomb[i+1]=nomb[i];  
     }
     System.out.println("Los nombres actualizados");
     for(int i=0;i<newNomb.length;i++){
         System.out.println((i+1)+","+newNomb);
     }
    }
}