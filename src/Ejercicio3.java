import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by 46995932D on 08/11/2016.
 */
public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String frase1 = null;
        String frase2 = null;
        System.out.println("Dime una frase");
        frase1 = buffer.readLine();
        System.out.println("Dime otra frase");
        frase2 = buffer.readLine();

        System.out.printf(frase1+ " " +frase2);
    }
}
