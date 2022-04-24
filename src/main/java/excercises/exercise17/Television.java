package excercises.exercise17;

public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;
    final double resolucionDef = 20;
    final boolean sintonizadorTDTDef = false;

    //    Los constructores que se implementarán serán:
    //    Un constructor por defecto.
    public Television() {
        this.resolucion = resolucionDef;
        this.sintonizadorTDT = sintonizadorTDTDef;
    }

    //    Un constructor con el precio y peso. El resto por defecto.
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = resolucionDef;
        this.sintonizadorTDT = sintonizadorTDTDef;
    }

    //    Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
    //    Recuerda que debes llamar al constructor de la clase padre.
    public Television(double precioBase, String color, char consumoEnergetico, double peso,
                      double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //    Los métodos que se implementara serán:
    //    Método get de resolución y sintonizador TDT.
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //   precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un
    //   30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones
    //   que hemos visto en la clase Electrodomestico también deben afectar al precio.
    public double precioFinal() {
        return super.precioFinal() * precioPorResolucion() + precioPorSintonizador();
    }

    private double precioPorResolucion() {
        if (this.resolucion > 40) {
            return 1.3;
        }
        return 1;
    }

    private double precioPorSintonizador() {
        if (this.sintonizadorTDT) {
            return 50;
        }
        return 0;
    }
}
