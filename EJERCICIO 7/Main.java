import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorNumero validador = new ValidadorNumero();

        System.out.print("Ingrese un número: ");
        String entrada = scanner.nextLine();

        try {
            int numero = validador.convertir(entrada);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }
}