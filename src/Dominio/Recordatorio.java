package Dominio;

public class Recordatorio {

    private int numero;
    private String nombre;
    private String descripcion;
    private String fechaHora;
    private String estado;

    // RELACION
    private Tarea tarea;

    public Recordatorio() {
    }

    public Recordatorio(int numero, String nombre,
                        String descripcion,
                        String fechaHora,
                        String estado) {

        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
}
