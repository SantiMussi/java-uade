import Implementaciones.ProcesadorTareas.procesadorTareas;
public class Main {
    public static void main(String[] args) {
        procesadorTareas procesador = new procesadorTareas();

        procesador.agregarTarea("Estudiar para el final de programacion", 9);
        procesador.agregarTarea("Ordenar el cuarto", 5);
        procesador.agregarTarea("Limpiar la cocina", 10);
        procesador.agregarTarea("Limpiar el banio", 1);

        procesador.listarTareasPendientes();

        procesador.comenzarTarea();
        procesador.listarTareasEnProgreso();

        procesador.comenzarTarea();
        procesador.listarTareasEnProgreso();
        procesador.listarTareasPendientes();
        procesador.completarTarea();

        procesador.completarTarea();

        procesador.comenzarTarea();
        procesador.comenzarTarea();
        procesador.listarTareasPendientes();
        procesador.listarTareasEnProgreso();

        procesador.completarTarea();
        procesador.completarTarea();

        procesador.listarTareasEnProgreso();
        procesador.listarTareasPendientes();
    }
}