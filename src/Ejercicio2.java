import java.io.*;
import java.util.Scanner;

/**
 * Created by 46995932D on 08/11/2016.
 */
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String palabra1 = null;
        String palabra2 = null;
        System.out.println("Dime una palabra");
        palabra1= scanner.next();
        System.out.println("Dime la otra palabra");
        palabra2= scanner.next();

        if (palabra1.equals(palabra2)){

            System.out.println("Las palabras son iguales");

        }
        else {
            System.out.printf("Las palabras no son iguales");


        }




    }
}
