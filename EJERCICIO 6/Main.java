import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Ingrese el numerador: ");
        int numerador = sc.nextInt();

        System.out.print("Ingrese el denominador: ");
        int denominador = sc.nextInt();

        try {
            int resultado = calculadora.dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}