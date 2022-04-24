package excercises.exercise17;

import excercises.exercise17.Electrodomestico;

public class Lavadora extends Electrodomestico {
    private double carga;
    final double cargaDef = 5;

    //    Un constructor por defecto.
    public Lavadora() {
        this.carga = cargaDef;
    }

    // Un constructor con el precio y peso. El resto por defecto.
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = cargaDef;
    }


//    Un constructor con la carga y el resto de atributos heredados. Recuerda que debes
//    llamar al constructor de la clase padre.
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

//    Los métodos que se implementara serán:
//    Método get de carga.

    public double getCarga() {
        return carga;
    }


//    precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino
//    es así no se incrementara el precio. Llama al método padre y añade el código necesario.
//    Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben
//    afectar al precio.
    public double precioFinal() {
        if (carga > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
