import java.io.*;

public class Ejercicio13 {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Diguem el teu nom");
        String nombre=buffer.readLine();
        System.out.println("Diguem el teu cognom");
        String apellidos=buffer.readLine();
        System.out.println("Any de naixement");
        Integer año= Integer.parseInt(buffer.readLine());
        System.out.println("Nota mitja del cicle");
        Double nota=Double.parseDouble(buffer.readLine());

        Thread.currentThread().sleep(1000);
        System.out.println("El menu se esta cargando...");


        try{
            int opcio = 0;
            while(opcio != 7){

                Thread.currentThread().sleep(5000);

                System.out.println("1. Nom i cognoms complerts");
                System.out.println("2. Edat, et dire si ets o no major d'edat");
                System.out.println("3. Nota media");
                System.out.println("4. Nota de dos companys més del cicle, et dire la nota mitja, la mes alta y la mes baixa");
                System.out.println("5. Et donare el nombre de caràcters que té el nom, mostrar la inicial del nom, i mostrar la inicial del cognom.");
                System.out.println("6. Donam el nom i el cognom de dos companys del cicle i et dire si hi ha algun nom igual, i ordenar alfabèticament, primer els noms, i després els cognoms.");
                System.out.println("7. Sortir del programa.");

                System.out.println("Opcio ??");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {

                    case 1:
                        System.out.println("Opcio 1");
                        System.out.println("El teu nom y cognom complert es " +nombre+ " " +apellidos);
                        System.out.println("En 5 segons es tornara a mostrar el menu");
                        break;
                    case 2:
                        int edad = 2016-año;
                        System.out.println("Opcio 2");
                        if (año>=1998){
                        System.out.println("La teva edat es " +edad+ " y eres menor de edad");
                        }
                        else {
                        System.out.println("La teva edat es " + edad+ " y eres mayor de edad");
                    }
                        System.out.println("En 5 segons es tornara a mostrar el menu");

                        break;

                    case 3:
                        System.out.println("Opcio 3");
                        if (nota<=5){
                            System.out.println("Estas suspes amb la nota de " +nota+ " .");
                        }
                        else if (nota<=5.9){
                            System.out.println("Estas aprobat amb un suficient amb la nota de " +nota+ " .");
                        }
                        else if (nota<=6.9){
                            System.out.println("Estas aprobat amb un be amb la nota de " +nota+ " .");
                        }
                        else if (nota<=8.9){
                            System.out.println("Estas aprobat amb un notable amb la nota de " +nota+ " .");
                        }
                        else if (nota <=10){
                            System.out.println("Estas aprobat amb un excel·lent amb la nota de " +nota+ " .");
                        }

                        System.out.println("En 5 segons es tornara a mostrar el menu");
                        break;

                    case 4:


                    default: System.out.println("Opcio incorrecta. 1 a 7.");
                }
            }
        }
        catch (Exception e){
            System.out.println("Tienes que poner el numero de la opcion");
        }
    }
}