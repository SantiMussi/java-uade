package ImplementacionesTest;
import InterfacesTest.colasTDA;
public class colaDinamica implements colasTDA{

    NodoCola primero;
    NodoCola ultimo;
    @Override
    public void inicializarCola() {
        primero = null;
        ultimo =null;
    }

    @Override
    public void acolar(int x) {
        NodoCola nuevo = new NodoCola();
        nuevo.valor = x;
        nuevo.sig = null;
        if (ultimo != null) {
            ultimo.sig = nuevo;
        }
        ultimo = nuevo;
        if (primero == null) {
            primero = nuevo;
        }
    }

    @Override
    public void desacolar() {
        if(!colaVacia()){
            primero = primero.sig;
            if (colaVacia()){
                ultimo = null;
            }
        }
    }

    @Override
    public boolean colaVacia() {
        return primero == null;
    }

    @Override
    public int primero() {
        if (!colaVacia()) {
            return primero.valor;
        }
        return -1;
    }
}
