package excercises.exercise18;


/**
 * Clase Videojuego del ejercicio 18
 */
public class Videojuego implements Entregable {
    /**
     * Título
     */
    private String titulo;

    /**
     * Horas
     */
    private int horas;

    /**
     * Está entregado?
     */
    private boolean entregado;

    /**
     * Género
     */
    private String genero;

    /**
     * Compañía
     */
    private String compania;

    /**
     * Constructor con todos los valores por defecto.
     */
    public Videojuego() {
        this.titulo = "";
        this.horas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    /**
     * Constructor con todos los valores por defecto, excepto:
     *
     * @param titulo Título
     * @param horas  y Horas estimadas
     */
    public Videojuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    /**
     * Constructor con todos los valores por parametrizados:
     *
     * @param titulo   Título
     * @param horas    Horas
     * @param genero   Género
     * @param compania Compañía
     */
    public Videojuego(String titulo, int horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    /**
     * Getter
     *
     * @return Título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Getter
     *
     * @return Horas estimadas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Getter
     *
     * @return Género
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Getter
     *
     * @return Compañía
     */
    public String getCompania() {
        return compania;
    }


    /**
     * Setter
     *
     * @param titulo Título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Setter
     *
     * @param horas Horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Setter
     *
     * @param genero Género
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Setter
     *
     * @param compania Compañía
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * @return Devuelve un String con la información del objeto
     */
    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nHoras: " + horas +
                "\nEntregado: " + entregado +
                "\nGenero: " + genero +
                "\nCompañía: " + compania;
    }

    /**
     * Settea verdadero al atributo Entregado
     */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    /**
     * Settea falso al atributo Entregado
     */
    @Override
    public void devolver() {
        this.entregado = false;
    }

    /**
     * Getter
     *
     * @return Entregado
     */
    @Override
    public boolean isEntregado() {
        return entregado;
    }
}
