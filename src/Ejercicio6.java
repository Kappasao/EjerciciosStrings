import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46995932D on 11/11/2016.
 */
public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dime una frase en mayusculas");
        String frase = buffer.readLine();
        frase=frase.toLowerCase();
        System.out.println(frase);

    }
}
