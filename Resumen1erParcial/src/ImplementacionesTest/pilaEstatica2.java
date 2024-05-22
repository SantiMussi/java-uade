package ImplementacionesTest;
import InterfacesTest.pilaEstaticaTest;
public class pilaEstatica2 implements pilaEstaticaTest{
    int[] arr;
    int inx;

    @Override
    public void inicializarPila() {
        arr = new int[100];
        inx = 0;
    }

    @Override
    public void apilar(int x) {
        arr[inx]= x;
        inx++;
    }

    @Override
    public void desapilar() {
        if(!estaVacia()){
            inx--;
        }
    }

    @Override
    public boolean estaVacia() {return inx==0;}

    @Override
    public int tope() {
        if(!estaVacia()){
            return arr[inx-1];
        }
        return -1;
    }
}
