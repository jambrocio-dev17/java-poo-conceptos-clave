import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasificadorEdad clasificador = new ClasificadorEdad();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        String categoria = clasificador.clasificar(edad);
        System.out.println("Categoría: " + categoria);
    }
}