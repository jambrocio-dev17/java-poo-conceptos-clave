public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto();
        empleado1.setNombre("Josue");
        ((EmpleadoTiempoCompleto) empleado1).setSalarioMensual(4500.00);

        Empleado empleado2 = new EmpleadoPorHoras();
        empleado2.setNombre("Ana");
        ((EmpleadoPorHoras) empleado2).setHorasTrabajadas(160);
        ((EmpleadoPorHoras) empleado2).setPagoPorHora(25.00);

        System.out.println(empleado1.getNombre() + " - Pago: Q" + empleado1.calcularPago());
        System.out.println(empleado2.getNombre() + " - Pago: Q" + empleado2.calcularPago());
    }
}