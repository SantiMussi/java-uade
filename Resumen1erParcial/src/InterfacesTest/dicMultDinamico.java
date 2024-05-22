package InterfacesTest;

public interface dicMultDinamico {
        void agregar(int clave, int valor);
        void sacar(int clave);
        int[] getClaves();
        int[] getValor(int clave);
        boolean isEmpty();
    }

