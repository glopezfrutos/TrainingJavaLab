package excercises;

import excercises.exercise18.Videojuego;
import excercises.exercise18.Serie;


public class Exercise18 {
    public static void exercise() {
//        Ahora crea una aplicación ejecutable y realiza lo siguiente:
//        Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
        Videojuego[] arrVideojuego = new Videojuego[5];
        Serie[] arrSerie = new Serie[5];
//                Crea un objeto en cada posición del array, con los valores que desees, puedes usar
//                distintos constructores.
        arrVideojuego[0] = new Videojuego();
        arrVideojuego[1] = new Videojuego();
        arrVideojuego[2] = new Videojuego("GTA V", 100);
        arrVideojuego[3] = new Videojuego("Tetris", 15);
        arrVideojuego[4] = new Videojuego("Civilization VI", 150, "Estrategia", "Firaxis Games");
        arrSerie[0] = new Serie();
        arrSerie[1] = new Serie("The Sopranos", 6, "Drama", "David Chase");
        arrSerie[2] = new Serie("The wire", 5, "Drama", "David Simon");
        arrSerie[3] = new Serie("Braking Bad", "Vince Gilligan");
        arrSerie[4] = new Serie("Succession","Jesse Armstrong");
//                Entrega algunos Videojuegos y Series con el método entregar().
        arrVideojuego[0].entregar();
        arrVideojuego[2].entregar();
        arrVideojuego[4].entregar();
        arrSerie[1].entregar();
        arrSerie[3].entregar();
//                Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.

        System.out.println("\nSe devolvieron " + contarDevolver(arrSerie) + " series y " +
                contarDevolver(arrVideojuego) + " videojuegos.\n");
//        Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.
//        Muéstralos en pantalla con toda su información (usa el método toString()).
        System.out.println("Datos del videojuego con más horas estimadas:\n" +
                compareTo(arrVideojuego).toString());
        System.out.println("\nDatos de la serie con más temporadas:\n" +
                compareTo(arrSerie).toString());
    }

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

    public static Videojuego compareTo(Videojuego[] arrVideojuego) {
        Videojuego mayor = arrVideojuego[0];
        for (int i = 0; i < arrVideojuego.length; i++) {
            if (arrVideojuego[i].getHoras() > mayor.getHoras()) {
                mayor = arrVideojuego[i];
            }
        }
        return mayor;
    }

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
