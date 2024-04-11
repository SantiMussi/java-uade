import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creamos las pilas y variables, iniciamos el scanner
        Estrategia1 DADA = new Estrategia1();
        Estrategia1 VALOR = new Estrategia1();
        Estrategia1 PAR = new Estrategia1();
        Estrategia1 IMPAR = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;
        int cnt = 0;
        int resp2 = 0;

        //Solicitar elementos de las pilas DADA y VALOR
        System.out.println("Cargue la pila DADA, para dejar de ingresar elementos coloque \"-1\" ");
        do {
            resp = sc.nextInt();
            if (resp != -1) {
                DADA.add(resp);
            }
        } while(resp != -1);

        System.out.println("Cargue la pila VALOR, al menos ingrese un elemento: ");
        do {
            resp2 = sc.nextInt();
            if (resp2 != -1) {
                VALOR.add(resp2);
                cnt++;
            }
        } while (cnt < 1 || resp2 != -1);

        if(DADA.getInx()%2 == 0){
            PAR.add(VALOR.tope());
        } else{
            IMPAR.add(VALOR.tope());
        }

        //Chequeo de pilas
        int[] arr1 = DADA.elementos();
        int[] arr2 = VALOR.elementos();
        int[] arr3 = PAR.elementos();
        int[] arr4 = IMPAR.elementos();
        System.out.println("DADA: " + Arrays.toString(arr1));
        System.out.println("VALOR: " + Arrays.toString(arr2));
        System.out.println("PAR: " + Arrays.toString(arr3));
        System.out.println("IMPAR: " + Arrays.toString(arr4));

        //Cierre del scanner
        sc.close();
    }
}
