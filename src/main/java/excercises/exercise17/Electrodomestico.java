package excercises.exercise17;

/**
 * Clase Electrodoméstico del ejercicio 17
 */
public class Electrodomestico {
    /**
     * Precio base
     */
    private double precioBase;

    /**
     * Precio base por defecto (constante)
     */
    final double precioBaseDef = 100;

    /**
     * Valores posibles para color (constante)
     */
    private enum Color {BLANCO, NEGRO, ROJO, AZUL, GRIS}

    /**
     * Color
     */
    private Color color;

    /**
     * Color por defecto (constante)
     */
    static final Color colorDef = Color.BLANCO;

    /**
     * Valores posibles para Consumo energético (constante)
     */
    protected enum ConsumoEnergetico {A, B, C, D, E, F}

    /**
     * Consumo energético
     */
    private ConsumoEnergetico consumoEnergetico;

    /**
     * Consumo energético por defecto (constante)
     */
    final ConsumoEnergetico consumoEnergeticoDef = ConsumoEnergetico.F;

    /**
     * Peso
     */
    private double peso;

    /**
     * Peso por defecto (constante)
     */
    final double pesoDef = 5;

    /**
     * Constructor con todos los valores por defecto.
     */
    public Electrodomestico() {
        this.precioBase = precioBaseDef;
        this.color = colorDef;
        this.consumoEnergetico = consumoEnergeticoDef;
        this.peso = pesoDef;
    }

    /**
     * Constructor con todos los valores por defecto, a excepción de
     *
     * @param precioBase Precio base
     * @param peso       y Peso
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorDef;
        this.consumoEnergetico = consumoEnergeticoDef;
    }

    /**
     * Contructor con todos los valores parametrizados:
     *
     * @param precioBase        Precio base
     * @param color             Color
     * @param consumoEnergetico Consumo energético
     * @param peso              y Peso.
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    /**
     * Getter
     *
     * @return Precio base
     */
    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Getter
     *
     * @return Color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Getter
     *
     * @return Consumo energético
     */
    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Getter
     *
     * @return Peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param letra dada una letra
     *
     */

    /**
     * @param letra dada una letra
     * @return Comprueba que sea un valor posible y la devuelve, sino devuelve la letra por defecto.
     */
    private ConsumoEnergetico comprobarConsumoEnergetico(char letra) {
        if (containsValidConsumo(String.valueOf(letra))) {
            return ConsumoEnergetico.valueOf(String.valueOf(letra));
        }
        return consumoEnergeticoDef;
    }

    /**
     * @param test A partir de un String,
     * @return devuelve si el mismo existe en el enum ConsumoEnergetico.
     */
    private static boolean containsValidConsumo(String test) {
        for (ConsumoEnergetico consumoEnergetico : ConsumoEnergetico.values()) {
            if (consumoEnergetico.name().equals(test)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param color dado un color
     * @return Comprueba que sea un valor posible y la devuelve, sino devuelve el color por defecto.
     */
    private static Color comprobarColor(String color) {
        if (containsValidColor(color)) {
            return Color.valueOf(color);
        }
        return colorDef;
    }

    /**
     * @param test A partir de un String,
     * @return devuelve si el mismo existe en el enum Color.
     */
    private static boolean containsValidColor(String test) {
        for (Color color : Color.values()) {
            if (color.name().equals(test)) {
                return true;
            }
        }
        return false;
    }


    /**
     * @return Devuelve el precio final
     */
    public double precioFinal() {
        return precioPorConsumo() + precioPorPeso();
    }

    /**
     * @return Devuelve el precio según el consumo energético
     */
    private double precioPorConsumo() {
        switch (this.consumoEnergetico) {
            case A -> {
                return 100;
            }
            case B -> {
                return 80;
            }
            case C -> {
                return 60;
            }
            case D -> {
                return 50;
            }
            case E -> {
                return 30;
            }
            default -> {
                return 10;
            }
        }
    }

    /**
     * @return Devuelve el precio según el peso
     */
    private double precioPorPeso() {
        if (this.peso < 20) {
            return 10;
        }
        if (this.peso < 50) {
            return 50;
        }
        if (this.peso < 80) {
            return 80;
        }
        return 100;
    }
}
