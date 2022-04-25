package excercises.exercise18;

/**
 * Clase Serie del ejercicio 18
 */
public class Serie implements Entregable {
    /**
     * Título
     */
    private String titulo;
    private int temporadas;

    /**
     * Está entregado?
     */
    private boolean entregado;

    /**
     * Género
     */
    private String genero;

    /**
     * Creador
     */
    private String creador;

    /**
     * Constructor con todos los valores por defecto.
     */
    public Serie() {
        this.titulo = "";
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    /**
     * Constructor con todos los valores por defecto, excepto:
     * @param titulo Título
     * @param creador Creador
     */
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }


    /**
     * Constructor con todos los valores por parametrizados:
     * @param titulo     Título
     * @param temporadas Temporadas
     * @param genero Género
     * @param creador Creador
     * excepto entregado
     */
    public Serie(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    /**
     * Getter
     * @return Título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter
     * @param titulo Título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter
     * @return Temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * Setter
     * @param temporadas Temporadas
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * Getter
     * @return Género
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Setter
     * @param genero Género
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Getter
     * @return Creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * Setter
     * @param creador Creador
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }


    /**
     * @return Devuelve un String con la información del objeto
     */
    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nTemporadas: " + temporadas +
                "\nEntregado: " + entregado +
                "\nGenero: " + genero +
                "\nCreador: " + creador;
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
     * @return Entregado
     */
    @Override
    public boolean isEntregado() {
        return entregado;
    }
}
