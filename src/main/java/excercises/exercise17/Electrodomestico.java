package excercises.exercise17;

public class Electrodomestico {
    private double precioBase;
    final double precioBaseDef = 100;

    private enum Color {BLANCO, NEGRO, ROJO, AZUL, GRIS}

    private Color color;
    static final Color colorDef = Color.BLANCO;

    protected enum ConsumoEnergetico {A, B, C, D, E, F}

    private ConsumoEnergetico consumoEnergetico;
    final ConsumoEnergetico consumoEnergeticoDef = ConsumoEnergetico.F;
    private double peso;
    final double pesoDef = 5;

    public Electrodomestico() {
        this.precioBase = precioBaseDef;
        this.color = colorDef;
        this.consumoEnergetico = consumoEnergeticoDef;
        this.peso = pesoDef;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = colorDef;
        this.consumoEnergetico = consumoEnergeticoDef;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    /**
     * Getters
     */
    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    /**
     * Comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
     * Se invocará al crear el objeto y no será visible.
     *
     * @param letra
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
     * comprueba que el color es correcto, sino lo es usa el color por defecto.
     * Se invocará al crear el objeto y no será visible.
     *
     * @param color
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
     * según el consumo energético, aumentara su precio, y según su tamaño, también.
     * Esta es la lista de precios:
     */
    public double precioFinal() {
        return precioPorConsumo() + precioPorPeso();
    }

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
