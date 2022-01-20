import java.lang.invoke.StringConcatException;
import java.security.spec.ECField;
import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner lectTeclado = new Scanner(System.in);
        System.out.println("Ingresar dato: ");
        String a = lectTeclado.next();
        caracterEn(a,7);

        //  Pruebas 1

        /*String a="Jose Lopez";
        int b=7;
        if(args.length ==2){
            //System.out.println("Vamos bien ");

            try {
                a=String.valueOf(args[0]);
            }catch (Exception e){
                System.out.println(e.getCause());
                System.out.println("Error en el formato en el argumento 1  ");
            }
            try {
                b=Integer.parseInt(args[1]);

            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Error de formato en el argumento 2");
                b=0;
            }

            caracterEn(a,b);
        }*/


    }

    public static void caracterEn(String a, int b){
        System.out.println("Argumento en a es: " +a);
        System.out.println("Argumento en b es: "+b);

        try {
            System.out.println(a.charAt(b));

        }catch (Exception e){
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe");

        }

    }

}
