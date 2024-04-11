import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las pilas y variables, iniciamos el scanner
        Estrategia1 ORIGEN = new Estrategia1();
        Estrategia1 origenAux = new Estrategia1();
        Estrategia1 origenAux2 = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;

        //Solicitamos los elementos de la pila ORIGEN
        System.out.println("Ingrese los elementos double para la pila de origen," +
                " si desea dejar de ingresar elementos coloque \"-1\": ");
        do {
            resp = sc.nextInt();
            ORIGEN.add(resp);
        } while(resp != -1);

        sc.close();

        //Eliminamos el -1 ingresado para finalizar el ingreso de datos
        ORIGEN.remove();

        //Iniciamos la transferencia de elementos a la pila auxiliar
        while(!ORIGEN.estaVacia()){
            origenAux.add(ORIGEN.tope());
            ORIGEN.remove();
        }

        //Transferimos de la pila auxiliar a la 2da pila auxiliar para que queden los elementos en orden
        while(!origenAux.estaVacia()){
            origenAux2.add(origenAux.tope());
            origenAux.remove();
        }

        //Transferimos de la 2da pila auxiliar a la de ORIGEN para que se inviertan los elementos
        while(!origenAux2.estaVacia()){
            ORIGEN.add(origenAux2.tope());
            origenAux2.remove();
        }

        // Chequeamos que se hayan pasado correctamente
        int[] arrOrigen = ORIGEN.elementos();

        System.out.println("ORIGEN: " + Arrays.toString(arrOrigen));
    }
}