import Implementacion.diccionariosMultiplesEstaticos;

public class Main {
    public static void main(String[] args) {
        diccionariosMultiplesEstaticos diccionario = new diccionariosMultiplesEstaticos();
        diccionario.inicializarDiccionario();
        diccionario.agregar(1, 10);
        diccionario.agregar(1, 20);
        diccionario.agregar(2, 30);

        System.out.println("\nClaves: ");
        for (int clave : diccionario.claves()) {
            System.out.print(clave + " ");
        }

        System.out.println("\nValores para la clave 1: ");
        for (int valor : diccionario.recuperar(1)) {
            System.out.print(valor + " ");
        }

        diccionario.eliminarValor(1, 10);
        System.out.println("\nValores para la clave 1 después de eliminar 10: ");
        for (int valor : diccionario.recuperar(1)) {
            System.out.print(valor + " ");
        }

        diccionario.eliminar(2);
        System.out.println("\nClaves después de eliminar la clave 2: ");
        for (int clave : diccionario.claves()) {
            System.out.print(clave + " ");
        }
    }
}