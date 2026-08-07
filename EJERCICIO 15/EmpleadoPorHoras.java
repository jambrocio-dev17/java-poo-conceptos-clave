public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        if (pagoPorHora < 0) {
            throw new IllegalArgumentException("El pago por hora no puede ser negativo.");
        }
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }
}