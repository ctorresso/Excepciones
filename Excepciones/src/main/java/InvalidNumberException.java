
public class InvalidNumberException extends Throwable {

    public InvalidNumberException(){ super();}

    public InvalidNumberException(String mensaje){
        super(mensaje);
    }


    public InvalidNumberException(String mensaje, Throwable causa) {

        super(mensaje,causa);
    }
}
