import java.util.Stack;

/**
 * Class Caso
 */
public class Caso {
    private int numero_De_Computadores;
    private int numero_De_Conexiones;
    private int computador_A;
    private int computador_B;
    private Stack<Conexion> conexion;

    /**
     * Constructor
     * @param numero_De_Computadores
     * @param numero_De_Conexiones
     * @param computador_A
     * @param computador_B
     * @param conexion
     */
    public Caso(int numero_De_Computadores, int numero_De_Conexiones, int computador_A, int computador_B,Stack<Conexion> conexion) {
        this.numero_De_Computadores = numero_De_Computadores;
        this.numero_De_Conexiones = numero_De_Conexiones;
        this.computador_A = computador_A;
        this.computador_B = computador_B;
        this.conexion = conexion;
    }

}
