public class Main {
    public static void main(String[] args) {
        Animal perro1 = new Perro();
        perro1.setNombre("Firulais");

        Animal gato1 = new Gato();
        gato1.setNombre("Michi");

        perro1.hacerSonido();
        gato1.hacerSonido();
    }
}