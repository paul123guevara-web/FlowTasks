package Principal;

import Dominio.Categoria;
import Dominio.Recordatorio;
import Dominio.Tarea;
import Dominio.Usuario;

public class Main {

    public static void main(String[] args) {

        // CREAR USUARIO
        Usuario usuario1 = new Usuario(
                1,
                "Paul",
                "paul@gmail.com",
                "12345678",
                "09/05/2026"
        );

        // CREAR CATEGORIA
        Categoria categoria1 = new Categoria(
                1,
                "Universidad",
                "Tareas de Programacion"
        );

        // CREAR TAREA
        Tarea tarea1 = new Tarea(
                101,
                "Hacer deber de POO",
                "15/05/2026",
                "Alta",
                "Pendiente"
        );

        // ASIGNAR RELACIONES
        tarea1.setUsuarioAsignado(usuario1);
        tarea1.setCategoria(categoria1);

        // CREAR RECORDATORIO
        Recordatorio recordatorio1 = new Recordatorio(
                1,
                "Recordar deber",
                "Entregar proyecto",
                "14/05/2026 20:00",
                "Activo"
        );

        // ASIGNAR TAREA AL RECORDATORIO
        recordatorio1.setTarea(tarea1);

        // ARREGLO DE TAREAS
        Tarea[] tareas = {tarea1};

        // ASIGNAR TAREAS AL USUARIO
        usuario1.setTareas(tareas);

        // MOSTRAR DATOS
        System.out.println("=== USUARIO ===");
        System.out.println(usuario1);

        System.out.println("\n=== TAREA ===");
        System.out.println(tarea1);

        System.out.println("\n=== CATEGORIA ===");
        System.out.println(categoria1);

        System.out.println("\n=== RECORDATORIO ===");
        System.out.println(recordatorio1);

    }
}
