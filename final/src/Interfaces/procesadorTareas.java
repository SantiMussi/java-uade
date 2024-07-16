package Interfaces;

public interface procesadorTareas {
    void agregarTarea(String tarea, int prioridad);
    void comenzarTarea();
    void completarTarea();
    void listarTareasEnProgreso();
    void listarTareasPendientes();

}
