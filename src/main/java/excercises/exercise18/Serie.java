package excercises.exercise18;

public class Serie implements Entregable {
    //        Crear una clase llamada Serie con las siguientes características:
//        Sus atributos son título, numero de temporadas, entregado, género y creador.
    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

//        Los constructores que se implementarán serán:
//        Un constructor por defecto.

    public Serie() {
        this.titulo = "";
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

//        Un constructor con el titulo y creador. El resto por defecto.

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = creador;
    }

//        Un constructor con todos los atributos, excepto de entregado.

    public Serie(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

//        getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nTemporadas: " + temporadas +
                "\nEntregado: " + entregado +
                "\nGenero: " + genero +
                "\nCreador: " + creador;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    public void compareTo(Object a) {

    }
}
