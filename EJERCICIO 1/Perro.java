public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Guau guau");
    }
}