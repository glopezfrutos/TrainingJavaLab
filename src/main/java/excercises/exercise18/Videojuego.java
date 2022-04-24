package excercises.exercise18;

public class Videojuego implements Entregable {

//    Crearemos una clase Videojuego con las siguientes características:
//
//    Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compania;

//    Por defecto, las horas estimadas serán de 10 horas y entregado false.
//    El resto de atributos serán valores por defecto según el tipo del atributo.


//    Los constructores que se implementaran serán:
//    Un constructor por defecto.
    public Videojuego() {
        this.titulo = "";
        this.horas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

//    Un constructor con el titulo y horas estimadas. El resto por defecto.
    public Videojuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

//    Un constructor con todos los atributos, excepto de entregado.
    public Videojuego(String titulo, int horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

//    Los métodos que se implementara serán:
//    Métodos get de todos los atributos, excepto de entregado.
    public String getTitulo() {
        return titulo;
    }

    public int getHoras() {
        return horas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }


//    Métodos set de todos los atributos, excepto de entregado.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

//    Sobrescribe los métodos toString.
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean entregar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public boolean isEntregado() {
        return false;
    }

    @Override
    public void compareTo(Object a) {

    }
}
