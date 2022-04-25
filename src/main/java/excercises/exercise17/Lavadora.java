package excercises.exercise17;

/**
 * Clase Lavadora del ejercicio 17
 */
public class Lavadora extends Electrodomestico {
    /**
     * Carga
     */
    private double carga;

    /**
     * Carga por defecto (constante)
     */
    final double cargaDef = 5;

    /**
     * Constructor con todos los valores por defecto.
     */
    public Lavadora() {
        this.carga = cargaDef;
    }

    /**
     * Constructor con todos los valores por defecto, excepto:
     *
     * @param precioBase Precio base
     * @param peso       y peso
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = cargaDef;
    }

    /**
     * Contructor con todos los valores parametrizados:
     *
     * @param precioBase        Precio base
     * @param color             Color
     * @param consumoEnergetico Consumo energético
     * @param peso              Peso
     * @param carga             Carga
     */
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * Getter
      * @return Carga
     */
    public double getCarga() {
        return carga;
    }


    /**
     * @return Devuelve el precio final
     */
    public double precioFinal() {
        if (carga > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }
}
