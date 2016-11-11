import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46995932D on 11/11/2016.
 */
public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        boolean b;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dame un caracter papu");
        String letra1=buffer.readLine();

        System.out.println("Venga, uno mas chacho");
        String letra2=buffer.readLine();

        b=letra1.equals(letra2);
        b=letra2.equals(letra1);

        System.out.println(b);




    }
}
