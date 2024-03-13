//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("Calculadora");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.print("¿Qué opción quieres realizar?: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.sumar(num1, num2);
                    System.out.printf("El resultado de la suma es: %.3f%n", resultado);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.restar(num1, num2);
                    System.out.printf("El resultado de la resta es: %.3f%n", resultado);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.printf("El resultado de la multiplicación es: %.3f%n", resultado);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.dividir(num1, num2);
                    System.out.printf("El resultado de la división es: %.3f%n", resultado);
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }
}

