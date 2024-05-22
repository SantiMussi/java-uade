package ImplementacionesTest;

import Implementaciones.NodoDicMultiple;

import java.util.Arrays;

public class NodoDicMult{

    int clave;
    int[] valores;
    int valoresSize;
    NodoDicMult sig;

    public NodoDicMult(int clave, int valorInicial) {
        this.clave = clave;
        this.valores = new int[1];
        this.valores[0] = valoresSize;
        this.sig = null;
    }

    void agregarValor(int valor){
        if(valoresSize == valores.length) {
            valores = Arrays.copyOf(valores, valores.length * 2);
        }
        valores[valoresSize++] = valor;
    }

    int[] obtenerValores(){
        return Arrays.copyOf(valores, valoresSize);
    }
}
