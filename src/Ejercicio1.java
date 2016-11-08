import java.util.Scanner;
import java.io.*;
/**
 * Created by 46995932D on 08/11/2016.
 */
public class Ejercicio1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String palabra = null;
        System.out.println("introduce una palabra");
        palabra= scanner.next();

        System.out.println(palabra.charAt(0));
    }
}
