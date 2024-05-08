import Implementacion.diccionariosEstaticos;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        //Creamos el diccionario
        diccionariosEstaticos dictionary = new diccionariosEstaticos();

        dictionary.inicializarDiccionario();

        for(int i=0; i<10; i++){
            dictionary.agregar(rand.nextInt(10), rand.nextInt(20));
        }

        int clavePrueba = rand.nextInt(10);
        boolean pertenece = dictionary.perteneceClave(clavePrueba);

        System.out.println("Clave prueba: " + clavePrueba);
        System.out.println("La clave pertenece al diccionario? " + pertenece);

        //Si pertenece imprimimos el valor (solo para probar, no es parte de la interfaz)
        if(pertenece){
            int valor = dictionary.recuperar(clavePrueba);
            System.out.println(valor);
        }

    }
}