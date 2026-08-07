import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estadisticas estadisticas = new Estadisticas();

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Suma: " + estadisticas.calcularSuma(numeros));
        System.out.println("Promedio: " + estadisticas.calcularPromedio(numeros));
        System.out.println("Mayor: " + estadisticas.obtenerMayor(numeros));
        System.out.println("Menor: " + estadisticas.obtenerMenor(numeros));
    }
}