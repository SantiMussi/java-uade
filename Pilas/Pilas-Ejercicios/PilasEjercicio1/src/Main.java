import Implementaciones.Estrategia1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las pilas
        Estrategia1 DADA = new Estrategia1();
        Estrategia1 CJTO1 = new Estrategia1();
        Estrategia1 CJTO2 = new Estrategia1();
        Scanner sc = new Scanner(System.in);

        //Solicitamos los 4 elementos de la pila DADA
        System.out.println("Ingrese 4 números enteros para la pila DADA: ");
        for(int i = 0; i<4; i++) {
                DADA.add(sc.nextInt());
        }
        sc.close();

        //Eliminamos el último elemento que le asignamos a DADA y lo ponemos en CJTO2
        CJTO2.add(DADA.tope());
        DADA.remove();

        // Los primeros 3 elementos de DADA los asignamos a la pila CJTO1
        for(int i=0; i<3; i++){
            CJTO1.add(DADA.tope());
            DADA.remove();
        }

        //Verificamos que todo se haya hecho correctamente
        int[] arrDADA = DADA.elementos();
        int[] arrCJTO1 = CJTO1.elementos();
        int[] arrCJTO2 = CJTO2.elementos();
        System.out.println("Pila DADA: " + Arrays.toString(arrDADA));
        System.out.println("Pila CJTO1: "+ Arrays.toString(arrCJTO1));
        System.out.println("Pila CJTO2: " + Arrays.toString(arrCJTO2));
    }
}