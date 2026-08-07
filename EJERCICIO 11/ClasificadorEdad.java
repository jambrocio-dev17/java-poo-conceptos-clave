public class ClasificadorEdad {
    public String clasificar(int edad) {
        String categoria;

        if (edad < 13) {
            categoria = "Niño";
        } else if (edad < 18) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto";
        }

        return categoria;
    }
}
