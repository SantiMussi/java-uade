package ImplementacionesTest;

public class dicMultipleDinamico implements InterfacesTest.dicMultDinamico{

    private NodoDicMult cabeza;

    public dicMultipleDinamico(){
        this.cabeza = null;
    }
    @Override
    public void agregar(int clave, int valor) {
        NodoDicMult actual = cabeza;
        while(actual!=null){
            if(actual.clave==clave){
                actual.agregarValor(valor);
                return;
            }
            actual = actual.sig;
        }
        NodoDicMult nuevo = new NodoDicMult(clave, valor);
        nuevo.sig = cabeza;
        cabeza = nuevo;
        }

    @Override
    public void sacar(int clave) {
        if (!isEmpty()) {
            if (cabeza.clave == clave) {
                cabeza = cabeza.sig;
                return;
            }

            NodoDicMult actual = cabeza;
            while(actual.sig != null){
                if(actual.sig.clave == clave){
                    actual.sig = actual.sig.sig;
                    return;
                }
                actual = actual.sig;
            }
        }
    }
    @Override
    public int[] getClaves() {
        int[] claves = new int[getSize()];
        int index=0;
        NodoDicMult actual = cabeza;
        while(actual!=null){
            claves[index++] = actual.clave;
            actual = actual.sig;
        }
        return claves
    }

    @Override
    public int[] getValor(int clave) {
        NodoDicMult actual = cabeza;
        while(actual!= null){
            if(actual.clave == clave){
                return actual.obtenerValores();
            }
            actual = actual.sig;
        }
        return new int[0];
    }

    @Override
    public boolean isEmpty() {
        return cabeza == null;
    }

    private int getSize(){
        int size = 0;
        NodoDicMult actual = cabeza;
        while(actual!= null){
            size++;
            actual=actual.sig;
        }
        return size;
    }
}
