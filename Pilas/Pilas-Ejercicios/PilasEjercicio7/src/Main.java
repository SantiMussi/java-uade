import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las pilas y variables, iniciamos el scanner
        Estrategia1 POZO = new Estrategia1();
        Estrategia1 JUG1 = new Estrategia1();
        Estrategia1 JUG2 = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;

        //Solicitamos los elementos de la pila POZO
        System.out.println("Ingrese los elementos double para la pila de origen," +
                " si desea dejar de ingresar elementos coloque \"-1\": ");
        do {
            resp = sc.nextInt();
                POZO.add(resp);

        } while(resp != -1);

        POZO.remove();
        sc.close();

        //Vamos intercalando los numeros de jug1 y jug2
        while(!POZO.estaVacia()){
            JUG1.add(POZO.tope());
            POZO.remove();
            if(!POZO.estaVacia()) {
                JUG2.add(POZO.tope());
                POZO.remove();
            }
        }

        // Error: Ver por qué se sigue asignando -1 cuando no debería
        // Chequeamos que se hayan pasado correctamente
        int[] arrJug1 = JUG1.elementos();
        int[] arrJug2 = JUG2.elementos();

        System.out.println("JUG1: " + Arrays.toString(arrJug1));
        System.out.println("JUG2: " + Arrays.toString(arrJug2));
    }
}
