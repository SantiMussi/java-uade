package Implementaciones.ProcesadorTareas;
import Implementaciones.colaCiclica.colaPrioridad;
import Implementaciones.pilaDinamica.pilaDinamica;
public class procesadorTareas implements Interfaces.procesadorTareas{
    colaPrioridad listadoTareas = new colaPrioridad();
    pilaDinamica tareasProgreso = new pilaDinamica();
    int indice = 0;
    @Override
    public void agregarTarea(String tarea, int prioridad) {
        listadoTareas.acolar(prioridad, tarea);
        System.out.println("Se ha puesto en el listado de tareas: " + "\""+ tarea + "\"" + " con prioridad: " + prioridad);
    }

    @Override
    public void comenzarTarea() {
        String tarea = listadoTareas.primero();
        System.out.println("Tarea comenzada: " + tarea);
        listadoTareas.desacolar();
        tareasProgreso.apilar(tarea);
        indice++;
    }

    @Override
    public void completarTarea() {
        String tarea = tareasProgreso.tope();
        System.out.println("Tarea completada: "+ tarea);
        tareasProgreso.desapilar();
        indice--;
    }

    @Override
    public void listarTareasEnProgreso() {
        System.out.println("Tareas en progreso:");
        System.out.println(tareasProgreso.elementos());
    }

    @Override
    public void listarTareasPendientes() {
        System.out.println("Tareas pendientes:");
        System.out.println(listadoTareas.elementos());
    }
}
