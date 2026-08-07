public class Comparador {
    public int obtenerMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }
}
