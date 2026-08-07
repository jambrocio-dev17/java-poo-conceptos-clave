public class Main {
    public static void main(String[] args) {
        Pago pagoTarjeta = new PagoTarjeta();
        pagoTarjeta.setMonto(250.00);
        ((PagoTarjeta) pagoTarjeta).setNumeroTarjeta("4532123456781234");

        Pago pagoEfectivo = new PagoEfectivo();
        pagoEfectivo.setMonto(100.00);
        ((PagoEfectivo) pagoEfectivo).setMontoRecibido(150.00);

        pagoTarjeta.procesarPago();
        pagoEfectivo.procesarPago();
    }
}