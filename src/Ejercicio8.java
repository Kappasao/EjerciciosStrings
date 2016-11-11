import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46995932D on 11/11/2016.
 */
public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ponme un caracter");
        String letra= buffer.readLine();

        if (Character.isUpperCase(letra.charAt(0))){
            System.out.println("Es mayuscula");
        }
        else{
            System.out.println("Es minuscula");
        }
    }
}
