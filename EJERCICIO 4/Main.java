public class Main {
    public static void main(String[] args) {
        Material libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad");
        ((Libro) libro1).setAutor("Gabriel García Márquez");

        Material revista1 = new Revista();
        revista1.setTitulo("National Geographic");
        ((Revista) revista1).setNumeroEdicion(245);

        libro1.mostrarInformacion();
        revista1.mostrarInformacion();
    }
}