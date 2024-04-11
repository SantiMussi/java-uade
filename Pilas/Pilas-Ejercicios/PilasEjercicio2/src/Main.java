import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las pilas y variables, iniciamos el scanner
        Estrategia1 ORIGEN = new Estrategia1();
        Estrategia1 DESTINO = new Estrategia1();
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

        //Iniciamos la transferencia de elementos
        while(ORIGEN.getInx() !=0){
            DESTINO.add(ORIGEN.tope());
            ORIGEN.remove();
        }

        // Chequeamos que se hayan pasado correctamente
        int[] arrOrigen = ORIGEN.elementos();
        int[] arrDestino = DESTINO.elementos();

        System.out.println("ORIGEN: " + Arrays.toString(arrOrigen));
        System.out.println("DESTINO: " + Arrays.toString(arrDestino));


     }
}
