import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();

        System.out.print("Ingrese su edad: ");
        String entrada = sc.nextLine();

        try {
            int edad = Integer.parseInt(entrada);
            persona1.setEdad(edad);
            System.out.println("Edad válida: " + persona1.getEdad());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
