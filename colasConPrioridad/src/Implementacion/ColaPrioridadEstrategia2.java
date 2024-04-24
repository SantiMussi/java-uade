package Implementacion;
import Interfaz.ColaConPrioridadTDA;
public class ColaPrioridadEstrategia2 implements ColaConPrioridadTDA{
    private Elemento[] elementos;
    private int indice;
    private int tamanio;

    public ColaPrioridadEstrategia2(int tamanio) {
        this.tamanio = tamanio;
        elementos = new Elemento[tamanio];
        indice=0;
    }

    @Override
    public void InicializarCola() {
        indice=0;
    }

    @Override
    public boolean AcolarPrioridad(int x, int prioridad) {
        if (indice<tamanio){
            int i = indice;
            //Mover los elementos hasta encontrar la posicion correcta
            while (i>0 && elementos[i-1].prioridad > prioridad){
                elementos[i] = elementos[i-1];
                i--;
            }
            elementos[i]=new Elemento(x, prioridad);
            indice++;
            }
        return true; // Acolado fue exitoso
    }

    @Override
    public boolean Desacolar() {
        if (!ColaVacia()){
            indice--;
            return true;
        }
        return false; //esto es cuando la cola ya está vacia
    }

    @Override
    public int Primero() {
        if (ColaVacia()){
            return -1;
        } else
            return elementos[indice-1].valor;
    }

    @Override
    public int Prioridad() {
        if (ColaVacia()){
            return -1;
        } else
            return elementos[indice-1].prioridad;
    }

    @Override
    public boolean ColaVacia() {
        return indice == 0;
    }

}
