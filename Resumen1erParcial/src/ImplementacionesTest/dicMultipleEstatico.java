package ImplementacionesTest;
import InterfacesTest.dicMultEstatico;
import java.util.Arrays;
public class dicMultipleEstatico implements dicMultEstatico{
    private int[] claves;
    private int[][] valores;
    private int size;

    public dicMultipleEstatico(){
        this.claves = new int[100];
        this.valores = new int[100][];
        this.size = 0;
    }
    @Override
    public void agregar(int clave, int valor) {
        for (int i = 0; i < size; i++) {
            if (claves[i] == clave) {
                agregarValor(i, valor);
                return;
            }
        }
        //Si el tamanio del diccionario esta en su capacidad maxima lo agrandamos
        if (size == claves.length) {
            agrandarDiccionario();
        }

        claves[size] = clave;
        valores[size] = new int[]{valor};
        size++;
    }

    @Override
    public void sacar(int clave) {
        for(int i=0; i<size; i++){
            if(claves[i] == clave){
                for(int j = i; j<size; j++){
                    claves[j] = claves[j+1];
                    valores[j] = valores[j+1];
                }
                size--;
                return;
            }
        }
    }

    @Override
    public int[] getClaves() {
        return Arrays.copyOf(claves, size);
    }

    @Override
    public int[] getValor(int clave) {
        for(int i=0; i<size; i++){
            if (clave == claves[i]) {
                return valores[i];
            }
        }
        return new int[0];
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    private void agregarValor(int i, int valor){
        int[] arrayActual = valores[i];
        int[] arrayCopia = Arrays.copyOf(arrayActual, arrayActual.length+1);
        arrayCopia[arrayCopia.length-1] = valor;
        valores[i] = arrayCopia;
    }

    private void agrandarDiccionario(){
        int nuevaCapacidad = claves.length*2;
        claves = Arrays.copyOf(claves, nuevaCapacidad);
        valores = Arrays.copyOf(valores, nuevaCapacidad);
    }
}
