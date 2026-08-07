public class Pago {
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago por Q" + monto);
    }
}