package ImplementacionesTest;
import InterfacesTest.colasTDA;
public class colaEstaticaTest implements colasTDA{

    int[] arr;
    int inx;

    @Override
    public void inicializarCola() {
        arr = new int[100];
        inx = 0;
    }

    @Override
    public void acolar(int x) {
        for(int i = inx-1; i>=0; i--){
            arr[i] = arr[i+1];
        }
        arr[0] = x;
        inx++;
    }

    @Override
    public void desacolar() {
        if(!colaVacia()) {
            inx--;
        }
    }

    @Override
    public boolean colaVacia() {return inx == 0;}

    @Override
    public int primero() {
        if(!colaVacia()){
            return arr[inx-1];
        }
        return -1;
    }
}
