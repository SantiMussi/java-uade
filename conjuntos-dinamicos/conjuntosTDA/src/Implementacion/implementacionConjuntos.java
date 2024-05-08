package Implementacion;
import Interfaz.conjuntosTDA;

public class implementacionConjuntos implements conjuntosTDA {
    private int[] elementos;
    private int cant;

    public implementacionConjuntos(){
        elementos = new int[100];
        cant = 0;
    }
    @Override
    public void inicializarConjunto() {
        cant = 0;
    }

    @Override
    public boolean agregar(int x) {
        if(!pertenece(x)){ //Si ya tenemos un elemento con ese valor no lo agregamos
            if (cant < elementos.length) {
                elementos[cant] = x;
                cant++;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean sacar(int x) {
        for(int i=0; i<cant; i++){
            if(elementos[i] == x){
                elementos[i] = elementos[cant-1];
                cant--; //Reducir en 1 los elementos del conjunto
                return true;
            }
        }
        return false; //Elemento no encontrado o no eliminado
    }

    @Override
    public boolean pertenece(int x) {
        for(int i=0; i<cant; i++){
            if(elementos[i] == x){
                return true; //Encontró el elemento
            }
        }
        return false; //No encontró el elemento
    }

}
