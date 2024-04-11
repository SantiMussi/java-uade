import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las pilas y variables, iniciamos el scanner
        Estrategia1 DADA = new Estrategia1();
        Estrategia1 aux = new Estrategia1();
        Estrategia1 aux2 = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;

        //Solicitamos los elementos de la pila ORIGEN
        System.out.println("Ingrese los elementos double para la pila de origen," +
                " si desea dejar de ingresar elementos coloque \"-1\": ");
        do {
            resp = sc.nextInt();
            DADA.add(resp);
        } while(resp != -1);

        sc.close();

        //Eliminamos el -1 ingresado para finalizar el ingreso de datos
        DADA.remove();

        //Enviamos todos los elementos menos la base a la pila auxiliar
        while(DADA.getInx() > 1){
            aux.add(DADA.tope());
            DADA.remove();
        }

        //Enviamos la base a una pila auxiliar2
        aux2.add(DADA.tope());
        DADA.remove();


        //Transferimos nuevamente los elementos de la pila aux a la pila de origen
        while(!aux.estaVacia()) {
            DADA.add(aux.tope());
            aux.remove();
        }

        //Transferimos el elemento que antes era la base al tope
        DADA.add(aux2.tope());
        aux2.remove();
        
        // Chequeamos que se hayan pasado correctamente
        int[] arrOrigen = DADA.elementos();

        System.out.println("Pila DADA: " + Arrays.toString(arrOrigen));
    }
}