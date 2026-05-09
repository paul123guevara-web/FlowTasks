package Dominio;

public class Categoria {

    private int numero;
    private String nombre;
    private String descripcion;

    // Relación
    private Tarea[] tareas;

    public Categoria() {
    }

    public Categoria(int numero, String nombre, String descripcion) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // getters y setters

    @Override
    public String toString() {
        return "Categoria{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
