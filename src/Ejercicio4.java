import java.io.*;

/**
 * Created by 46995932D on 08/11/2016.
 */
public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String frase = null;
        System.out.println("Dime una frase");
        frase = buffer.readLine();

        System.out.println("El numero de caracteres de la frase es " + frase.length());

    }

}
