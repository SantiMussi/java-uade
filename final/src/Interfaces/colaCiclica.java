package Interfaces;

public interface colaCiclica {
    void inicializarCola();
    void acolar(int prioridad, String tarea);
    boolean desacolar();
    boolean colaVacia();
    String primero();
    String ultimo();
    String elementos();
}
