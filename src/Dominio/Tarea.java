package Dominio;

public class Tarea {

    private int idTarea;
    private String nombreTarea;
    private String fechaEntrega;
    private String prioridad;
    private String estado;

    // Relaciones
    private Usuario usuarioAsignado;
    private Categoria categoria;
    private Recordatorio[] recordatorios;
    private Comentario[] comentarios;

    // Constructor vacío
    public Tarea() {
    }

    // Constructor con parámetros
    public Tarea(int idTarea, String nombreTarea,
                 String fechaEntrega,
                 String prioridad,
                 String estado) {

        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
        this.fechaEntrega = fechaEntrega;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    // GETTERS Y SETTERS

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "idTarea=" + idTarea +
                ", nombreTarea='" + nombreTarea + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
