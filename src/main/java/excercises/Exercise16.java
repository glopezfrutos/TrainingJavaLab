package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise16 {
    public static void exercise() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("*** Registro de personas ***" +
                    "\nA continuación se le pedirán datos de la persona a ingresar");
            System.out.println("Por favor, introduzca el nombre:");
            String newName = scanner.nextLine();
            System.out.println("Por favor, introduzca la edad:");
            Integer newAge = scanner.nextInt();
            System.out.println("Por favor, introduzca el sexo (H para Hombre y M para Mujer):");
            String newSex = scanner.next();
            System.out.println("Por favor, introduzca el peso (en kg):");
            double newWeight = scanner.nextDouble();
            System.out.println("Por favor, introduzca la altura (en m):");
            double newHeight = scanner.nextDouble();

            // Primer objeto creado con las variables pedidas por teclado
            Persona persona1AllVariables = new Persona(newName, newAge, newSex, newWeight, newHeight);
            System.out.println("\n * Persona registrada (método 1): *\n" +
                    infoPersona(persona1AllVariables, newWeight, newHeight, newAge));

            // Segundo creado con las mismas variables menos el peso y la altura
            Persona persona2SomeVariables = new Persona(newName, newAge, newSex);
            System.out.println("\n * Persona registrada (método 2): *\n" +
                    infoPersona(persona2SomeVariables, newWeight, newHeight, newAge));

            // Tercer objeto creado por defecto, utilizando métodos set para darle a los atributos un valor.
            Persona persona3AllDefault = new Persona();
            int edadPepita = 15;
            double pesoPepita = 96;
            double alturaPepita = 2;
            persona3AllDefault.setNombre("Pepita");
            persona3AllDefault.setEdad(edadPepita);
            persona3AllDefault.setSexo(Persona.Sexo.M);
            persona3AllDefault.setPeso(pesoPepita);
            persona3AllDefault.setAltura(2);
            System.out.println("\n * Persona registrada (método 3): *\n" +
                    infoPersona(persona3AllDefault, pesoPepita, alturaPepita, edadPepita));
        } catch (InputMismatchException e) {
            System.out.println("ERROR, el dato ingresado no es válido.\nVolviendo al Menú Principal...\n");
            scanner.next();
        }
    }

    public static String infoPersona(Persona persona, double peso, double altura, int edad) {
        return Persona.toString(persona) +
                "\n IMC: " + infoIMC(peso, altura) +
                "\n Es mayor de edad?: " + infoEsMayor(edad);
    }

//    Devuelve -1 (peso ideal), 0 (debajo de su peso ideal) o 1 (sobrepeso).
    public static String infoIMC(double peso, double altura) {
        if (Persona.calcularIMC(peso, altura) == -1) {
            return "debajo de su peso ideal";
        }
        if (Persona.calcularIMC(peso, altura) == 0) {
            return "peso ideal";
        }
        return "sobrepeso";
    }

    public static String infoEsMayor(int edad) {
        if (Persona.esMayorDeEdad(edad)) {
            return "Sí";
        }
        return "No";
    }
}
