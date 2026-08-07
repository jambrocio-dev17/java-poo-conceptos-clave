public class Main {
    public static void main(String[] args) {
        Vehiculo carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        ((Carro) carro1).setNumeroPuertas(4);

        Vehiculo moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("CBR");
        ((Moto) moto1).setTieneSidecar(false);

        carro1.mostrarDatos();
        moto1.mostrarDatos();
    }
}