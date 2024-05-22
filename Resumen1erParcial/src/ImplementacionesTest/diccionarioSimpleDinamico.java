package ImplementacionesTest;
import InterfacesTest.diccionarioSimple;
public class diccionarioSimpleDinamico implements diccionarioSimple{
    private NodoDicSimple Nodo;
    @Override
    public void inicializarDiccionario() {
        Nodo = null;
    }

    @Override
    public boolean agregar(int clave, int elemento) {
        NodoDicSimple actual = Nodo;
        while(actual!=null){
            if(actual.clave == clave){
                actual.valor = elemento;
                return true; //Si la clave ya existe cambia el valor anterior por el nuevo
            }
            actual = actual.sig;
        }
        NodoDicSimple nuevo = new NodoDicSimple(clave, elemento);
        nuevo.sig = Nodo;
        Nodo = nuevo;
        return true; //La clave no existia y se agrego
    }

    @Override
    public boolean eliminar(int clave) {
        if(!isEmpty()){
            if(Nodo.clave == clave){
                Nodo = Nodo.sig;
                return true;
            }

            NodoDicSimple actual = Nodo;
            while(actual.sig != null){
                    if(actual.sig.clave == clave){
                        actual.sig = actual.sig.sig;
                        return true;
                }
                    actual = actual.sig;
            }
        }
        return false; //Esta vacio o no se pudo eliminar
    }

    @Override
    public boolean isEmpty() {
        return Nodo==null;
    }

    @Override
    public int recuperar(int clave) {
        NodoDicSimple actual = Nodo;
        while(actual != null){
            if(actual.clave==clave){
                return actual.valor;
            }
            actual = actual.sig;
        }
        return -1; //No se encontro el valor
    }

    @Override
    public int[] claves() {
        int[] clavesTemp = new int[getSize()];
        NodoDicSimple actual = Nodo;
        int index = 0;
        while(actual!= null){
            clavesTemp[index++] = actual.clave;
            actual = actual.sig;
        }
        return clavesTemp;
    }

    private int getSize(){
        int size = 0;
        NodoDicSimple actual = Nodo;
        while(actual!= null){
            size++;
            actual = actual.sig;
        }
        return size;
    }
}
