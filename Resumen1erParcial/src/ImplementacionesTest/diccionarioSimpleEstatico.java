package ImplementacionesTest;

public class diccionarioSimpleEstatico implements InterfacesTest.diccionarioSimple {
    private int[] claves;
    private int[] valores;
    private int indice;
    @Override
    public void inicializarDiccionario() {
        claves = new int[100];
        valores = new int[100];
        indice=0;
    }

    @Override
    public boolean agregar(int clave, int elemento) {
        if(!perteneceClave(clave)){
            claves[indice] = clave;
            valores[indice] = elemento;
            indice++;
            return true;
        }
        return false; //No se pudo agregar
    }

    @Override
    public boolean eliminar(int clave) {
        if(perteneceClave(clave)){
            for(int i = 0; i<indice; i++){
                if (claves[i] == clave) {
                    claves[i] = claves[indice-1];
                    indice--;
                    return true;
                }
            }
        }
        return false; //No se pudo eliminar
    }

    @Override
    public boolean isEmpty() {
        return indice == 0;
    }

    @Override
    public int recuperar(int clave) {
            for(int i=0; i<indice; i++){
                if(claves[i] == clave){
                    return valores[i];
                }
            }
            return -1; //No se encontro la clave

    }

    @Override
    public int[] claves() {
        return claves;
    }

    private boolean perteneceClave(int clave){
        for(int i =0; i<indice; i++){
            if (claves[i] ==clave){
                return true;
            }
        }
        return false;
    }
}
