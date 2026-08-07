import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Producto físico -----");
        Producto producto1 = new ProductoFisico();

        System.out.print("Ingrese el nombre: ");
        producto1.setNombre(sc.nextLine());

        System.out.print("Ingrese el precio: ");
        producto1.setPrecio(sc.nextDouble());

        System.out.print("Ingrese el peso (kg): ");
        ((ProductoFisico) producto1).setPeso(sc.nextDouble());
        sc.nextLine();

        System.out.println("\n----- Producto digital -----");
        Producto producto2 = new ProductoDigital();

        System.out.print("Ingrese el nombre: ");
        producto2.setNombre(sc.nextLine());

        System.out.print("Ingrese el precio: ");
        producto2.setPrecio(sc.nextDouble());

        System.out.print("Ingrese el tamaño del archivo (MB): ");
        ((ProductoDigital) producto2).setTamañoArchivo(sc.nextDouble());

        System.out.println("\n----- Resultados -----");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}