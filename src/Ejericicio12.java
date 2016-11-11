import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 46995932D on 11/11/2016.
 */
public class Ejericicio12 {
    public static void main(String[] args) throws IOException {
        /*12. Verificar si una cadena de text emmagatzemada en un String, és un NIF correcte o no. Si ho
        és, es mostrarà per consola la seva part numèrica; si no ho és, es mostrarà el missatge "NIF
        no vàlid. Cal tenir en compte el següent: Ex12.java
         Suposar que els NIF tenen 8 dígits, i a continuació, una lletra (és indiferent si és majúscula
        o minúscula).
         Dues condicions que ha de complir el NIF: tenir 9 caràcters i que l’últim sigui una lletra.
         Un cop comprovat això, cal verificar que la resta de caràcters són dígits.*/

        try {

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Escribe un DNI");
            String dni = buffer.readLine();


            if (dni.length() != 9) {
                throw new RuntimeException("El DNI no tiene nueve carácteres.");
            }

            char lletra = dni.charAt(8);
            if (!Character.isLetter(lletra)) {
                throw new RuntimeException("El último carácter del DNI no es una letra.");
            }

            String numsStr = dni.substring(0, 8);
            int nums = Integer.parseInt(numsStr);
            System.out.println("El DNI es correcto.");


        } catch (NumberFormatException nfe) {
            System.out.println("Los 8 primeros carácteres del DNI no representan un número. ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

