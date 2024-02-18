package Exception;

/**
 * Esta clase permite crear excepciones del tipo ValueException.
 * Las exceptiones de este tipo seran lanzadas cuanto un parametro
 * de un metodo tenga un valor invalido.
 * @author Bryan alberto
 */
public class ValueException extends RuntimeException{

    /**
     * constructor por omision.
     */
    public ValueException() {
    }
     
    /**
     * Constructor que inicializa el atributo s de la clase padre.
     * @param s Mensaje de error,
     */
    public ValueException(String s){
        super(s);
    }
}
