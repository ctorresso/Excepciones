import com.sun.jdi.InvalidLineNumberException;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.Scanner;

public class NumeroNegativoException{

    static void validate(int num)throws InvalidNumberException{
        if(num<0){
            throw new InvalidNumberException("El numero debe de ser positivo",
                    new Throwable("Number: " + num));
        }
        else {
            double raiz=Math.sqrt(num);
            System.out.println("La raiz cuadrada de " +num +" es: "+ raiz);


        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        int a=0;
        try {
            System.out.println("Ingresa un numero");
            numero=sc.nextInt();
            validate(numero);

        }catch (InvalidNumberException ex){
            System.out.println("Numero Invalido");
            System.out.println("Excepcion Ocurrida: "+ ex );

        }
    }

}
