package Implementacion;
import Interfaz.PilaTDA;
public class pilaDinamica implements PilaTDA {

    Nodo primero;
    @Override
    public void iniciarPila() {
        primero = null;
    }

    @Override
    public void apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = primero;
        primero = nuevo; //Nueva referencia de la estructura
    }

    @Override
    public void desapilar() {
        if(!pilaVacia()){
            primero = primero.sig;
        }
    }

    @Override
    public boolean pilaVacia() {
        return primero==null;
    }

    @Override
    public int tope() {
        if(!pilaVacia()){
            return primero.info;
        }
        return -1;
    }


}
