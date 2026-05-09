package Dominio;

public class Usuario {

    // ATRIBUTOS
    private int idUsuario;
    private String nombre;
    private String email;
    private String contraseña;
    private String fechaRegistro;

    // RELACION UNO A MUCHOS
    private Tarea[] tareas;

    // CONSTRUCTOR VACIO
    public Usuario() {
    }

    // CONSTRUCTOR CON PARAMETROS
    public Usuario(int idUsuario,
                   String nombre,
                   String email,
                   String contraseña,
                   String fechaRegistro) {

        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }

    // GETTERS Y SETTERS

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Tarea[] getTareas() {
        return tareas;
    }

    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                '}';
    }
}
