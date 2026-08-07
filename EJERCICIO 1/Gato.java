public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: Miau miau");
    }
}