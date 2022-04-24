package excercises;

import excercises.exercise17.Electrodomestico;
import excercises.exercise17.Lavadora;
import excercises.exercise17.Television;

public class Exercise17 {
    public static void exercise() {
//        Crea un array de Electrodomesticos de 10 posiciones.
        Electrodomestico[] arr = new Electrodomestico[10];
        arr[0] = new Electrodomestico();
        arr[1] = new Electrodomestico(120,10);
        arr[2] = new Electrodomestico(80, "NEGRO", 'C', 5);
        arr[3] = new Television();
        arr[4] = new Television(500, 50);
        arr[5] = new Television(300,5);
        arr[6] = new Television(700,"NEGRO", 'A', 50, 50,true);
        arr[7] = new Lavadora();
        arr[8] = new Lavadora(30, 80);
        arr[9] = new Lavadora(300, "GRIS", 'B', 500,10);


//        Ahora, recorre este array y ejecuta el método precioFinal().
//                Deberás mostrar el precio de cada clase, es decir, el precio de todas las
//                televisiones por un lado, el de las lavadoras por otro y la suma de los
//                Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda
//                que Television y Lavadora también son electrodomésticos). Recuerda el uso
//                operador instanceof.

        double sumaElectro = 0;
        double sumaTelevision = 0;
        double sumaLavadora = 0;
        for (int i = 0; i < arr.length; i++) {
            sumaElectro += arr[i].precioFinal();
            if (arr[i] instanceof Television) {
                sumaTelevision += arr[i].precioFinal();
            }
            if (arr[i] instanceof Lavadora) {
                sumaLavadora += arr[i].precioFinal();
            }
        }

        System.out.println("Total electrodomésticos: " + sumaElectro +
                "\nTotal televisiones: " + sumaTelevision +
                "\nTotal lavadoras: "+ sumaLavadora);
    }
}
