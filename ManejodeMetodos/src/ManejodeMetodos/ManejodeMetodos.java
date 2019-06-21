/*
 *
 */
package ManejodeMetodos;

/**
 *
 * @author Salas
 */
public class ManejodeMetodos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Operacion.metodoUno();
        Operacion.metodoTres("52");
        Operacion.metodoUno();
        String m = Operacion.metodoDos();
        System.out.println(m);
        Operacion.metodoTres("20", "51");
        System.out.println(m);
        Operacion.metodoUno();
    }
}
