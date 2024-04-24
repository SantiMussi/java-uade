package Implementacion;
import Interfaz.ColaConPrioridadTDA;
public class ColaPrioridadEstrategia1 implements ColaConPrioridadTDA {
    private int[] elementos;
    private int[] prioridades;
    //estos 2 array es donde vamos a guardar los elementos y sus prioridades
    private int indice;
    private int tamanio; //nos va a servir para dimensionar la cola

    //Constructor
    public ColaPrioridadEstrategia1(int tamanio){
        this.tamanio=tamanio;
        elementos = new int[tamanio];
        prioridades = new int[tamanio];
        indice=0;
    }

    @Override //Sirve para inicializar la cola
    public void InicializarCola() {
        indice = 0;
    }

    @Override
    public boolean AcolarPrioridad(int x, int prioridad) {
        if (indice < tamanio){
            int i = indice;
            //Mover elementos hasta enconrar la posicion correcta
            while (i > 0 && prioridades[i-1] > prioridad){
                elementos[i] = elementos[i-1];
                prioridades[i] = prioridades[i-1];
                i--;
            }
            elementos[i] = x; //guardamos el valor a acolar
            prioridades[i] = prioridad; //guardamos la prioridad
            indice++;
            return true; //Esto ocurre si pude acolar correctamente
        }
        return false; // Cola esta llena, o el acolado no fue exitoso
    }

    @Override
    public boolean Desacolar() {
        if (!ColaVacia()){
            indice--;
            return true; //Desacolado fue exitoso
        }
        return false; //siempre y cuendo no podamos desacolar (por ejemplo cola vacia)
    }

    @Override
    public boolean ColaVacia() {
        return indice == 0; //retorna true si el indice es 0, sino retorna false
    }

    @Override
    public int Primero() {
        if (ColaVacia()){
            return -1;
        } else
           return elementos[indice-1];
    }

    @Override
    public int Prioridad() {
        if (ColaVacia()){
            return -1;
        } else
            return prioridades[indice-1];
    }
    public int[] elementos() {
        return java.util.Arrays.copyOf(elementos, indice);
    }
}
