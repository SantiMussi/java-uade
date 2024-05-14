package Implementacion;
public class diccionariosMultiplesEstaticos implements Interface.diccionariosMultiplesEstaticos {
    private int[][] diccionario;
    private int numClaves;

    @Override
    public void inicializarDiccionario() {
        diccionario = new int[100][];
        numClaves = 0;
    }

    @Override
    public boolean agregar(int clave, int x) {
        for (int i = 0; i < numClaves; i++) {
            if (diccionario[i][0] == clave) {
                // Clave encontrada, añadir el valor
                int[] valores = diccionario[i];
                int[] nuevosValores = new int[valores.length + 1];
                System.arraycopy(valores, 0, nuevosValores, 0, valores.length);
                nuevosValores[valores.length] = x;
                diccionario[i] = nuevosValores;
                return true;
            }
        }
        // Clave no encontrada, añadir nueva entrada
        diccionario[numClaves] = new int[]{clave, x};
        numClaves++;
        return true;
    }

    @Override
    public boolean eliminar(int clave) {
        for (int i = 0; i < numClaves; i++) {
            if (diccionario[i][0] == clave) {
                // Eliminar la entrada
                for (int j = i; j < numClaves - 1; j++) {
                    diccionario[j] = diccionario[j + 1];
                }
                diccionario[numClaves - 1] = null;
                numClaves--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarValor(int clave, int x) {
        for (int i = 0; i < numClaves; i++) {
            if (diccionario[i][0] == clave) {
                int[] valores = diccionario[i];
                int index = -1;
                for (int j = 1; j < valores.length; j++) {
                    if (valores[j] == x) {
                        index = j;
                        break;
                    }
                }
                if (index != -1) {
                    int[] nuevosValores = new int[valores.length - 1];
                    System.arraycopy(valores, 0, nuevosValores, 0, index);
                    System.arraycopy(valores, index + 1, nuevosValores, index, valores.length - index - 1);
                    if (nuevosValores.length == 1) {
                        // Eliminar la clave si no quedan más valores
                        eliminar(clave);
                    } else {
                        diccionario[i] = nuevosValores;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int[] recuperar(int clave) {
        for (int i = 0; i < numClaves; i++) {
            if (diccionario[i][0] == clave) {
                int[] valores = diccionario[i];
                int[] resultado = new int[valores.length - 1];
                System.arraycopy(valores, 1, resultado, 0, valores.length - 1);
                return resultado;
            }
        }
        return new int[0];
    }

    @Override
    public int[] claves() {
        int[] resultado = new int[numClaves];
        for (int i = 0; i < numClaves; i++) {
            resultado[i] = diccionario[i][0];
        }
        return resultado;
    }
}
