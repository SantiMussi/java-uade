package Interface;

public interface diccionariosMultiplesEstaticos {
        void inicializarDiccionario();
        boolean agregar(int clave, int x);
        boolean eliminar(int clave);
        boolean eliminarValor(int clave, int x);
        int[] recuperar(int clave);
        int[] claves();
}
