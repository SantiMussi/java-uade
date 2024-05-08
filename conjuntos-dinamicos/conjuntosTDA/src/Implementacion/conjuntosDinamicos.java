package Implementacion;
import Interfaz.conjuntosTDA;
public class conjuntosDinamicos implements conjuntosTDA {
    private Nodo inicio;

    public conjuntosDinamicos() {
        inicio = null;
    }

    @Override
    public void inicializarConjunto() {
        inicio = null;
    }

    @Override
    public boolean agregar(int x) {
        if (!pertenece(x)) {
            Nodo nuevo = new Nodo(x);
            nuevo.sig = inicio;
            inicio = nuevo;
            return true; //Elemento agregado
        }
        return false; //No se pudo agregar el elemento al conjunto
    }

    @Override
    public boolean sacar(int x) {
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual != null && actual.info != x) {
            anterior = actual;
            actual = actual.sig;
        }
        if (actual != null) { //Si se encontró el nodoa ser eliminado
            if (anterior == null) {
                inicio = actual.sig; //El nodo a eliminar es el primero
            } else {
                anterior.sig = actual.sig; //Eliminamos el nodo del medio o del final
            }
            return true; //El nodo se eliminó satisfactoriamente
        }
        return false; //No se pudo eliminar el nodo
    }

    @Override
    public boolean pertenece(int x) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.info == x) {
                return true;
            }
            actual = actual.sig;
        }
        return false;
    }
}