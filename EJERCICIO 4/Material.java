public class Material {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
    }
}