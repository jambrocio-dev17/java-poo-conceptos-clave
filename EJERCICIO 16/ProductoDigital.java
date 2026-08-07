public class ProductoDigital extends Producto {
    private double tamañoArchivo;

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        if (tamañoArchivo < 0) {
            throw new IllegalArgumentException("El tamaño del archivo no puede ser negativo.");
        }
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Producto digital, Tamaño: " + tamañoArchivo + " MB");
    }
}