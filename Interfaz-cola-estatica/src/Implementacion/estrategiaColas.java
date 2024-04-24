package Implementacion;
import Interfaz.ColaTDA;
public class estrategiaColas implements ColaTDA {

    int[] cola;
    int indice;
    @Override
    public void iniciarCola() {
        cola = new int[103]; //El 103 es aleatorio, num grande para que no se llene
        indice = 0;
    }

    @Override
    public void acolar(int x) {
        for(int i = indice-1; i>=0; i--){
            cola[i+1] = cola[i];
        }
        cola[0] = x;
        indice++;
    }

    @Override
    public void desacolar() {
        indice--;
    }

    @Override
    public boolean colaVacia() {
        return (indice==0);
    }

    @Override
    public int primero() {
        return cola[indice-1];
    }
    
    public int getInx() {
        return indice;
    }

    // Métodos para mantener el encapsulamiento y acceder a metodos de la cola
    public int[] elementos() {
        return java.util.Arrays.copyOf(cola, indice);
    }
}
