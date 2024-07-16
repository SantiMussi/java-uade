package Implementaciones.pilaDinamica;

import java.util.Arrays;

public class pilaDinamica implements Interfaces.pilaDinamica{
    private Nodo tope;
    private int indice=0;
    @Override
    public void inicializarPila() {
        tope = null;
    }

    @Override
    public void apilar(String tarea) {
        Nodo nuevo = new Nodo();
        nuevo.tarea = tarea;
        nuevo.sig = tope;
        tope = nuevo;
        indice++;
    }

    @Override
    public boolean desapilar() {
        if(!pilaVacia()){
            tope = tope.sig;
            indice--;
            return true;
        }
        return false;
    }

    @Override
    public boolean pilaVacia() {
        return tope == null;
    }

    @Override
    public String tope() {
        return tope.tarea;
    }

    public String elementos(){
        Nodo actual = tope;
        String[] arr = new String[indice];
        for(int i=0; i<indice;i++){
            arr[i] = actual.tarea;
            actual=actual.sig;
        }
        return Arrays.deepToString(arr);
    }
}
