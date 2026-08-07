import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraNotas calculadora = new CalculadoraNotas();

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double promedio = calculadora.calcularPromedio(notas);
        System.out.println("Promedio: " + promedio);
    }
}