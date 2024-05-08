package Implementacion;

public class diccionariosEstaticos implements Interface.diccionariosEstaticos {
    private int[] claves, elementos;
    private int cant;

    @Override
    public void inicializarDiccionario() {
        elementos = new int[100];
        claves = new int[100];
        cant = 0;
    }

    @Override
    public boolean agregar(int clave, int x) {
        if(!perteneceClave(clave)){ //Si la clave no pertenece ejecutamos
            elementos[cant] = x;
            claves[cant] = clave;
            cant++;
            return true; //La clave no pertenecía y el elemento se pudo agregar
        }
        return false; //La clave ya existe o no se pudo agregar
    }

    @Override
    public boolean eliminar(int clave) {
        if(perteneceClave(clave)){
            for(int i=0; i<cant; i++){
                if(claves[i] == clave){
                    claves[i] = claves[cant-1];
                    cant--;
                    return true; //El elemento fue eliminado exitosamente
                }
            }
        }
        return false; //No se pudo eliminar el elemento porque la clave no existe u otro error
    }

    @Override
    public int recuperar(int clave) {
        if(perteneceClave(clave)){
            for(int i=0; i<cant; i++){
                if(clave==claves[i]){
                    return elementos[i];
                }
            }
        }
        return -1; //No se encontró la clave, devolvemos un valor inesperado
    }

    @Override
    public int[] claves() {
        return claves;
    }

    public boolean perteneceClave(int x){
        for(int i = 0; i<cant; i++){
            if(claves[i] == x){
                return true;
            }
        }
        return false;
    }
}
