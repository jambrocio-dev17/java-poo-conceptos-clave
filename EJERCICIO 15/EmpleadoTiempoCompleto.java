public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo.");
        }
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}