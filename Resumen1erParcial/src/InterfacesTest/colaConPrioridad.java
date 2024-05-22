package InterfacesTest;

public interface colaConPrioridad {
    void inicializarCola();
    boolean acolarPrioridad(int prioridad, int x);
    boolean desacolar();
    int primero();
    int prioridad();
    boolean colaVacia();

}
