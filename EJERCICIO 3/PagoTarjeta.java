public class PagoTarjeta extends Pago {
    private String numeroTarjeta;

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta terminada en " + numeroTarjeta.substring(numeroTarjeta.length() - 4) + " por Q" + getMonto());
    }
}