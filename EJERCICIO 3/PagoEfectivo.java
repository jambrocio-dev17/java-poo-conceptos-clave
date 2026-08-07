public class PagoEfectivo extends Pago {
    private double montoRecibido;

    public double getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    @Override
    public void procesarPago() {
        double cambio = montoRecibido - getMonto();
        System.out.println("Procesando pago en efectivo por Q" + getMonto() + ", cambio: Q" + cambio);
    }
}