package Implementaciones;
import Interface.IStack;

public class Estrategia1 implements IStack {
    private int[] arr; // arreglo que contiene los datos de la pila
    private int inx; // cantidad de elementos en la pila

    public Estrategia1() {
        arr = new int[100]; //crear un array grande, que nunca se "llene"
        inx = 0;
    }

    @Override
    public void add(int x) {
        arr[inx] = x;
        inx++;
    }

    @Override
    public void remove() {
        if (!estaVacia()) {
            inx--;
        }
    }

    @Override
    public boolean estaVacia() {

        return inx == 0; //como es un boolean, esta operacion puede ser falsa
                            // o verdadera, por eso no necesito el if
    }

    @Override
    public int tope() {
        if (!estaVacia()) {
            return arr[inx - 1];
        }
      return -1; //solo para asegurarnos de devolver el topo cuando no este vacia
    }

    public int getInx() {
        return inx;
    }

    // Métodos para mantener el encapsulamiento y acceder a metodos de la pila
    //El método java.util.Arrays.copyOf es una función de
    //  Java que permite crear una copia de un arreglo con un nuevo tamaño
    public int[] elementos() {
        return java.util.Arrays.copyOf(arr, inx);
    }
}
