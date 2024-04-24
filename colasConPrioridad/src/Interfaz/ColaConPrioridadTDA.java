package Interfaz;
public interface ColaConPrioridadTDA {
    void InicializarCola(); //metodo inicializar cola sin precondiciones
    boolean AcolarPrioridad(int x, int prioridad); //necesitamos el valor y la prioridad
    boolean Desacolar(); //tenes que tener la cola inicializada y no vacia
    int Primero(); //tenes que tener la cola inicializada y no vacia
    int Prioridad(); //tenes que tener la cola inicializada y no vacia
    boolean ColaVacia();//pre es que este la cola inicializada
}
