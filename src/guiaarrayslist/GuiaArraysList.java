package guiaarrayslist;
import java.util.Scanner;
public class GuiaArraysList {
    public static void main(String[] args) {
        //sssssssss
      Scanner scanner= new Scanner(System.in);
      String [] nomb= new String[5];
      for(int i=0;i<nomb.length;i++){
          System.out.println("Ingrese el nombre del pokemon"+i+1+":");
          nomb[i]=scanner.nextLine();
      }
      System.out.println("Los nombres de los pokemones son");
      for(int i=0;i<nomb.length;i++){
          System.out.println((i+1)+","+nomb[i]);
      }
    }
}