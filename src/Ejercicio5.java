import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46995932D on 11/11/2016.
 */
public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dime una frase");
        String frase=buffer.readLine();
        System.out.println(frase.replace('a','e'));


    }

}
