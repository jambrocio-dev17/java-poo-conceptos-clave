public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Moto, Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}