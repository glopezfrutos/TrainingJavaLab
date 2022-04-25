package excercises.exercise18;

/**
 * Interfaz con los métodos entregar, devolver y si está entregado
 */
public interface Entregable {
    /**
     * Settea verdadero al atributo Entregado
     */
    void entregar();

    /**
     * Settea falso al atributo Entregado
     */
    void devolver();

    /**
     * @return Devuelve verdadero si está entregado
     */
    boolean isEntregado();
}
