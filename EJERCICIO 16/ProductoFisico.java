public class ProductoFisico extends Producto {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
        this.peso = peso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Producto físico, Peso: " + peso + " kg");
    }
}