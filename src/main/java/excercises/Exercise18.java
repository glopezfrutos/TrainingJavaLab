package excercises;

import excercises.exercise18.Videojuego;
import excercises.exercise18.Serie;


/**
 * Ejercicio 18
 */
public class Exercise18 {
    /**
     * Se instancian los Objetos y se muestra su información por consola.
     */
    public static void exercise() {
        System.out.println("* Ejercicio 18 - Series y videojuegos *");

        Videojuego[] arrVideojuego = new Videojuego[5];
        Serie[] arrSerie = new Serie[5];

        arrVideojuego[0] = new Videojuego();
        arrVideojuego[1] = new Videojuego();
        arrVideojuego[2] = new Videojuego("GTA V", 100);
        arrVideojuego[3] = new Videojuego("Tetris", 15);
        arrVideojuego[4] = new Videojuego("Civilization VI", 150, "Estrategia", "Firaxis Games");
        arrSerie[0] = new Serie();
        arrSerie[1] = new Serie("The Sopranos", 6, "Drama", "David Chase");
        arrSerie[2] = new Serie("The wire", 5, "Drama", "David Simon");
        arrSerie[3] = new Serie("Braking Bad", "Vince Gilligan");
        arrSerie[4] = new Serie("Succession", "Jesse Armstrong");

        arrVideojuego[0].entregar();
        arrVideojuego[2].entregar();
        arrVideojuego[4].entregar();
        arrSerie[1].entregar();
        arrSerie[3].entregar();

        System.out.println("\nSe devolvieron " + contarDevolver(arrSerie) + " series y " +
                contarDevolver(arrVideojuego) + " videojuegos.\n");

        System.out.println("Datos del videojuego con más horas estimadas:\n" +
                compareTo(arrVideojuego).toString());
        System.out.println("\nDatos de la serie con más temporadas:\n" +
                compareTo(arrSerie).toString());
    }

    /**
     * @param arrSerie Dado un array de objetos Serie
     * @return devuelve la cantidad que hay entregados y marca como devueltos
     */
    public static int contarDevolver(Serie[] arrSerie) {
        int cuentaSerieEntregada = 0;
        for (int i = 0; i < arrSerie.length; i++) {
            if (arrSerie[i].isEntregado()) {
                cuentaSerieEntregada++;
                arrSerie[i].devolver();
            }
        }
        return cuentaSerieEntregada;
    }

    /**
     * @param arrVideojuego Dado un array de objetos Videojuego
     * @return devuelve la cantidad que hay entregados y marca como devueltos
     */
    public static int contarDevolver(Videojuego[] arrVideojuego) {
        int cuentaVideojuegoEntregado = 0;
        for (int i = 0; i < arrVideojuego.length; i++) {
            if (arrVideojuego[i].isEntregado()) {
                cuentaVideojuegoEntregado++;
                arrVideojuego[i].devolver();
            }
        }
        return cuentaVideojuegoEntregado;
    }

    /**
     * @param arrVideojuego Dado un array de objetos Videojuego
     * @return devuelve el Videojuego con más horas.
     */
    public static Videojuego compareTo(Videojuego[] arrVideojuego) {
        Videojuego mayor = arrVideojuego[0];
        for (int i = 0; i < arrVideojuego.length; i++) {
            if (arrVideojuego[i].getHoras() > mayor.getHoras()) {
                mayor = arrVideojuego[i];
            }
        }
        return mayor;
    }

    /**
     * @param array arrSerie Dado un array de objetos Serie
     * @return devuelve la Serie con más temporadas.
     */
    public static Serie compareTo(Serie[] array) {
        Serie mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getTemporadas() > mayor.getTemporadas()) {
                mayor = array[i];
            }
        }
        return mayor;
    }
}
