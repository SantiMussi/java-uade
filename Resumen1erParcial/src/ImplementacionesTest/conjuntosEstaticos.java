package ImplementacionesTest;
import InterfacesTest.conjuntosEstatico;
public class conjuntosEstaticos implements conjuntosEstatico{
    private int[] elementos;
    private int cant;
    @Override
    public void inicializarConjunto() {
        elementos = new int[100];
        cant = 0;
    }

    @Override
    public boolean agregar(int x) {
        if(!pertenece(x)){
            elementos[cant] = x;
            cant++;
            return true;
        }
        return false; //El elemento ya se encuentra en el conjunto
    }

    @Override
    public boolean sacar(int x) {
        for(int i = 0; i<cant; i++){
            if(elementos[i] == x){
                elementos[i] = elementos[cant-1];
                cant--;
                return true;
            }
        }
        return false; //No se encontro el elemento
    }

    @Override
    public boolean pertenece(int x) {
        for(int i=0; i<cant; i++){
            if (elementos[i]==x) {
                return true; //Se encontro el elemento
            }
        }
        return false; //No se encontro el elemento
    }
}
