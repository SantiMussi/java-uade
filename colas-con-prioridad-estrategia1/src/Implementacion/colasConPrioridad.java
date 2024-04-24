package Implementacion;
import Interfaz.ColasPrioridad;
public class colasConPrioridad implements ColasPrioridad{

    private Elemento[] elementos;
    private int indice;
    private int size;

    public colasConPrioridad(int size) {
        this.size = size;
        elementos = new Elemento[size];
        indice = 0;
    }

    @Override
    public void inicializarCola() {
        indice = 0;
    }

    @Override
    public boolean acolarPrioridad(int x, int prioridad) {
        if(indice<size){
            int i = indice;
            //Mover los elementos hasta encontrar la posición correcta
            while(i>0 && elementos[i-1].prioridad > prioridad()){
                elementos[i] = elementos[i-1];
                i--;
            }
            elementos[i] = new Elemento(x, prioridad());
            indice++;
            return true; //Acolado exitoso
        }
        else{
            return false;
        }
    }

    @Override
    public boolean desacolar() {
        if(!colaVacia()){
            indice--;
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int primero() {
        if(colaVacia()){
            return -1;
        } else{
            return elementos[indice-1].valor;
        }
    }

    @Override
    public int prioridad() {
        if(colaVacia()){
            return -1;
        } else{
            return elementos[indice-1].prioridad;
        }
    }

    @Override
    public boolean colaVacia() {
        return indice==0;
    }

    public int getIndice() {
        return indice;
    }
}
