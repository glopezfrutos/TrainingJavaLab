package excercises.exercise17;

/**
 * Clase Televisión del ejercicio 17
 */
public class Television extends Electrodomestico {
    /**
     * Resolución
     */
    private double resolucion;

    /**
     * Tiene sintonizador TDT?
     */
    private boolean sintonizadorTDT;

    /**
     * Resolución por defecto (constante)
     */
    final double resolucionDef = 20;

    /**
     * Sintonizador TDT por defecto (constante)
     */
    final boolean sintonizadorTDTDef = false;

    /**
     * Constructor con todos los valores por defecto.
     */
    public Television() {
        this.resolucion = resolucionDef;
        this.sintonizadorTDT = sintonizadorTDTDef;
    }

    /**
     * Constructor con todos los valores por defecto, excepto:
     *
     * @param precioBase Precio base
     * @param peso       y Peso
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDef;
        this.sintonizadorTDT = sintonizadorTDTDef;
    }

    /**
     * Contructor con todos los valores parametrizados:
     *
     * @param precioBase        Precio base
     * @param color             Color
     * @param consumoEnergetico Consumo energético
     * @param peso              Peso
     * @param resolucion        Resolución
     * @param sintonizadorTDT   y si tiene sintonizador TDT
     */
    public Television(double precioBase, String color, char consumoEnergetico, double peso,
                      double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Getter
     *
     * @return Resolución
     */
    public double getResolucion() {
        return resolucion;
    }

    /**
     * Getter
     *
     * @return Tiene sintonizador TDT?
     */
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    /**
     * @return Devuelve el precio final
     */
    public double precioFinal() {
        return super.precioFinal() * precioPorResolucion() + precioPorSintonizador();
    }

    /**
     * @return Devuelve el precio según la resolución
     */
    private double precioPorResolucion() {
        if (this.resolucion > 40) {
            return 1.3;
        }
        return 1;
    }

    /**
     * @return Devuelve el precio según si tiene sintonizador
     */
    private double precioPorSintonizador() {
        if (this.sintonizadorTDT) {
            return 50;
        }
        return 0;
    }
}
