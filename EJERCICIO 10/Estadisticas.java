public class Estadisticas {

    public double calcularSuma(int[] numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;
        }
        return suma;
    }

    public double calcularPromedio(int[] numeros) {
        return calcularSuma(numeros) / numeros.length;
    }

    public int obtenerMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    public int obtenerMenor(int[] numeros) {
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
}