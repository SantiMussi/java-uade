package Interface;

public interface diccionariosEstaticos {
    void inicializarDiccionario(); //We initialize the dictionary
    boolean agregar(int clave, int x);
    boolean eliminar(int clave);
    int recuperar(int clave);
    int[] claves();
}
