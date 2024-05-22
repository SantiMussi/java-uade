package InterfacesTest;

public interface diccionarioSimple {
    void inicializarDiccionario();
    boolean agregar(int clave, int elemento);
    boolean eliminar(int clave);
    boolean isEmpty();
    int recuperar(int clave);
    int[] claves();
}
