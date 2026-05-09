package Dominio;

public class Comentario {

    private int idComentario;
    private String mensaje;

    // Relaciones
    private Usuario usuario;
    private Tarea tarea;

    public Comentario() {
    }

    public Comentario(int idComentario, String mensaje) {
        this.idComentario = idComentario;
        this.mensaje = mensaje;
    }

    // getters y setters

    @Override
    public String toString() {
        return "Comentario{" +
                "idComentario=" + idComentario +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
