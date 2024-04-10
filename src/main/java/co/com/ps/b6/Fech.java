package co.com.ps.b6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Fech {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día de su fecha de nacimiento:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes de su fecha de nacimiento (como número):");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año de su fecha de nacimiento:");
        int año = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);

        int edad = calcularEdad(fechaNacimiento, LocalDate.now());

        System.out.println("Tienes " + edad + " años de edad.");

        scanner.close();
    }

    public static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
}
