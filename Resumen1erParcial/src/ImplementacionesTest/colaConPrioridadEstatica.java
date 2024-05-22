package ImplementacionesTest;

public class colaConPrioridadEstatica implements InterfacesTest.colaConPrioridad {

    private int[] elementos;
    private int[] prioridades;
    private int indice;
    private int size;

    public colaConPrioridadEstatica(int size) {
        this.size = size;
        elementos = new int[size];
        indice = 0;
    }

    @Override
    public void inicializarCola() {
        indice = 0;
    }

    @Override
    public boolean acolarPrioridad(int prioridad, int x) {
        if(indice < size){
            int i = indice;
            while(i>0 && prioridades[i-1] > prioridad){
                elementos[i] = elementos[i-1];
                prioridades[i] = prioridades[i-1];
                i--;
            }
            elementos[i] = x;
            prioridades[i] = prioridad;
            indice++;
            return true;
        }
        return false; //No se pudo acolar el elemento
    }

    @Override
    public boolean desacolar() {
        if(!colaVacia()){
            indice--;
            return true;
        }
        return false; //No se pudo desacolar
    }

    @Override
    public int primero() {
        if (!colaVacia()) {
            return elementos[indice - 1];
        }
        return -1;
    }

    @Override
    public int prioridad() {
        if(!colaVacia()){
            return prioridades[indice-1];
        }
        return -1;
    }

    @Override
    public boolean colaVacia() {
        return indice==0;
    }
}
