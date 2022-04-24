package excercises;

public class Persona {
    private String nombre;
    private Integer edad;
    private String DNI;

    enum Sexo {H, M}

    private Sexo sexo;
    private double peso;
    private double altura;


    /**
     * Constructor con todos los valores por defecto.
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = Sexo.H;
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * Contructor con algunos valores por defecto y otros dados por parámetros.
     *
     * @param nombre Nombre
     * @param edad   Edad
     * @param sexo   Sexo (H o M)
     */
    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    /**
     * Contructor con todos los atributos como parámetro
     *
     * @param nombre Nombre
     * @param edad   Edad
     * @param sexo   Sexo (H o M)
     * @param peso   Peso
     * @param altura Altura
     */
    public Persona(String nombre, Integer edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcula el IMC a partir del peso y la altura
     *
     * @param peso   Peso (en kg)
     * @param altura Altura (en m)
     * @return Devuelve -1 (debajo de su peso ideal), 0 (peso ideal) o 1 (sobrepeso).
     */
    public static int calcularIMC(double peso, double altura) {
        double valorIMC = peso / Math.pow(altura, 2);
        if (valorIMC < 20) {
            return -1;
        }
        if (valorIMC <= 25) {
            return 0;
        }
        return 1;
    }

    /**
     * @param edad A partir de la edad de la persona,
     * @return Devuelve verdadero si es mayor de edad y falso si es menor.
     */
    public static boolean esMayorDeEdad(Integer edad) {
        return edad >= 18;
    }

    /**
     * @param sexo A partir del sexo ingresado,
     * @return comprueba si es el parámetro es correcto, si es incorrecto devuelve H.
     */
    private static Sexo comprobarSexo(String sexo) {
        if (contains(sexo)) {
            if (Sexo.valueOf(sexo) == Sexo.M) {
                return Sexo.M;
            }
        }
        return Sexo.H;
    }

    public static boolean contains(String test) {
        for (Sexo sex : Sexo.values()) {
            if (sex.name().equals(test)) {
                return true;
            }
        }

        return false;
    }


    /**
     * @param persona A partir de un objeto Persona,
     * @return devuelve sus datos en forma de String.
     */
    public static String toString(Persona persona) {
        return " Nombre: " + persona.nombre +
                "\n Edad: " + persona.edad +
                "\n DNI: " + persona.DNI +
                "\n Sexo: " + persona.sexo +
                "\n Peso: " + persona.peso +
                "\n Altura: " + persona.altura;
    }

    /**
     * @return Devuelve un número de DNI con su letra respectiva.
     */
    private static String generaDNI() {
        int newDNI = (int) (Math.random() * (99999999 - 10000000) + 10000000);
        return newDNI + " " + calcularLetra(newDNI);
    }

    /**
     * @param newDNI A partir de un número de DNI,
     * @return devuelve la letra que le corresponde.
     */
    private static char calcularLetra(int newDNI) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = newDNI % 23;
        return caracteres.charAt(resto);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
