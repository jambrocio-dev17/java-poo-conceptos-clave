import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("----- Menú -----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Resultado: " + calculadora.sumar(a, b));
        } else if (opcion == 2) {
            System.out.println("Resultado: " + calculadora.restar(a, b));
        } else {
            System.out.println("Opción no válida.");
        }
    }
}