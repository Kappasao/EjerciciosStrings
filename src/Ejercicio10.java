import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46995932D on 11/11/2016.
 */
public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Venga, mas caracteres");
        String letra1=buffer.readLine();

        System.out.println("Veeeeenga solo otro mas");
        String letra2=buffer.readLine();

        if (Character.isLowerCase(letra1.charAt(0)) && Character.isLowerCase(letra2.charAt(0))){
            System.out.println("Las letras introducidas son todas minusculas.");

        }

        else{
            System.out.println("Las letras introducidas son mayusculas o hay una de cada :c");
        }
    }
}
