public class Carro extends Vehiculo {
    private int numeroPuertas;

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Carro, Puertas: " + numeroPuertas);
    }
}