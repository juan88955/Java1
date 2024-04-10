package co.com.ps.b6;

import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char opcion;

        do {
            System.out.println("Ingrese el primer número:");
            num1 = obtenerNumero(scanner);

            System.out.println("Ingrese el segundo número:");
            num2 = obtenerNumero(scanner);

            System.out.println("Seleccione una opción:");
            System.out.println("a) Sumar");
            System.out.println("b) Restar");
            System.out.println("c) Multiplicar");
            System.out.println("d) Dividir");
            System.out.println("e) Salir");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("La suma es: " + sumar(num1, num2));
                    break;
                case 'b':
                    System.out.println("La resta es: " + restar(num1, num2));
                    break;
                case 'c':
                    System.out.println("La multiplicación es: " + multiplicar(num1, num2));
                    break;
                case 'd':
                    try {
                        System.out.println("La división es: " + dividir(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 'e':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 'e');

        scanner.close();
    }

    public static double obtenerNumero(Scanner scanner) {
        double numero = 0;
        boolean validado = false;
        do {
            try {
                numero = Double.parseDouble(scanner.next());
                validado = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        } while (!validado);
        return numero;
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return num1 / num2;
    }
}
