import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws IOException {
        if(args.length ==0){
            System.out.println("Falta el nombre del archivo");
            System.exit(1);
        }

        String fileName= args[0];
        FileReader fileReader=null;

        try{
            fileReader= new FileReader(fileName);
        }catch (FileNotFoundException e){
            System.out.println("El nombre del archivo no se encuentra");
            System.exit(2);
        }

        BufferedReader in= new BufferedReader(fileReader);
        String str;
        int contador =0;
        int lineas=0;
        while((str=in.readLine()) !=null){
            String token[]= str.split("(?=\\s+)");
            lineas++;
            //System.out.println(str);

            for (int i = 0; i < token.length; i++) {
                contador++;
            }
            if(token.length==1){
                contador--;
            }
            //System.out.println(contador);
        }
        System.out.println("Tiene: " + lineas + " lineas");
        System.out.println("Tiene "+contador + " palabras");





    }

}
