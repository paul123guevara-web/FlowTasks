package Dominio;

public class Notificacion {

    private int idNotificacion;
    private String mensajeAlerta;

    // Relación
    private Usuario usuario;

    public Notificacion() {
    }

    public Notificacion(int idNotificacion, String mensajeAlerta) {
        this.idNotificacion = idNotificacion;
        this.mensajeAlerta = mensajeAlerta;
    }

    // getters y setters

    @Override
    public String toString() {
        return "Notificacion{" +
                "idNotificacion=" + idNotificacion +
                ", mensajeAlerta='" + mensajeAlerta + '\'' +
                '}';
    }
}
