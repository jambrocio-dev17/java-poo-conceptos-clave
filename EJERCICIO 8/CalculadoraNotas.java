public class CalculadoraNotas {
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma = suma + nota;
        }
        return suma / notas.length;
    }
}