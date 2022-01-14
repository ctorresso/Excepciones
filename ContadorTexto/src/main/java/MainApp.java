import java.io.*;

public class MainApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Faltan el Nombre del Archivo");
            System.exit(1);
        }

        String fileName = args[0];
        FileReader fileReader = null;

        try {
            fileReader = new FileReader((fileName));
        } catch (FileNotFoundException e) {
            System.out.println("El nombre del el archivo no existe");
            System.exit(2);

        }

        BufferedReader in = new BufferedReader((fileReader));

        String textLine = null;
        int contador = 0;


        while (true) {
            try {
                if (!((textLine = in.readLine()) != null))
                    break;
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de entrada");
                System.exit(3);
            }
            contador++;


        }

        try {
            in.close();
        } catch (IOException e) {

        }
        System.out.println("El archivo " + fileName + " tiene " + contador + " lineas");


    }

}
