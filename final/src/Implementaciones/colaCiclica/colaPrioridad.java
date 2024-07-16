package Implementaciones.colaCiclica;

import java.util.Arrays;

public class colaPrioridad implements Interfaces.colaCiclica{

    private Nodo primero;
    private Nodo ultimo;
    private int indice;
    @Override
    public void inicializarCola() {
        primero = null;
        ultimo = null;
        indice = 0;
    }

    @Override
    public void acolar(int prioridad, String tarea) {
        Nodo nuevo = new Nodo();
        nuevo.tarea = tarea;
        nuevo.prioridad = prioridad;
        if(colaVacia()){
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            primero = nuevo;
            ultimo = nuevo;
            indice++;
        }else {
            Nodo actual = primero;
            for (int i = 0; i < indice; i++) {
                if(nuevo.prioridad>actual.prioridad){
                    nuevo.sig = actual;
                    nuevo.ant = actual.ant;
                    actual.ant.sig = nuevo;
                    actual.ant = nuevo;
                    if(i==0){
                        primero = nuevo;
                    }
                    indice++;
                    return;
                }
                actual = actual.sig;
            }
            nuevo.ant = ultimo;
            nuevo.sig = primero;
            primero.ant = nuevo;
            ultimo.sig = nuevo;
            ultimo = nuevo;
            indice++;
        }
    }
    @Override
    public boolean desacolar() {
        if(colaVacia()){
            return false;
        }
        if(indice==1){
            primero = null;
            ultimo = null;
        }else{
            primero = primero.sig;
            primero.ant = ultimo;
            ultimo.sig = primero;
        }
        indice--;
        return true;
    }

    @Override
    public boolean colaVacia() {
        return primero == null;
    }

    @Override
    public String primero() {
        return primero.tarea;
    }

    @Override
    public String ultimo() {
        return ultimo.tarea;
    }

    @Override
    public String elementos() {
        Nodo actual = primero;
        String[] arr = new String[indice];
        for(int i=0; i<indice; i++){
            arr[i] = actual.tarea;
            actual = actual.sig;
        }
        return Arrays.deepToString(arr);
    }
}
