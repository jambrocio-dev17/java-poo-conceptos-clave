import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparador comparador = new Comparador();

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int mayor = comparador.obtenerMayor(a, b, c);
        System.out.println("El número mayor es: " + mayor);
    }
}