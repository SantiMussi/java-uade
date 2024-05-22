package ImplementacionesTest;
import InterfacesTest.pilaEstaticaTest;
public class pilaDinamicaTest implements pilaEstaticaTest{

    NodoPila primero;
    @Override
    public void inicializarPila() {
        primero = null;
    }

    @Override
    public void apilar(int x) {
        NodoPila nuevo = new NodoPila();
        nuevo.valor = x;
        nuevo.sig = primero;
        primero = nuevo;
    }

    @Override
    public void desapilar() {
        if(!estaVacia()){
            primero = primero.sig;
        }
    }

    @Override
    public boolean estaVacia() {return primero==null;}

    @Override
    public int tope() {
        return primero.valor;
    }
}
