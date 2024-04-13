import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creacion de las pilas y variables, iniciamos el scanner
        Estrategia1 A = new Estrategia1();
        Estrategia1 B = new Estrategia1();
        Estrategia1 VALOR = new Estrategia1();
        Estrategia1 VERD = new Estrategia1();
        Estrategia1 FALSO = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;

        //Se solicitan los elementos de la pila DADA y LIMITE
        System.out.println("Ingrese los elementos enteros para la pila A y luego de la pila B" +
                " si desea dejar de ingresar elementos coloque \"-1\": ");
        do {
            resp = sc.nextInt();
            if (resp !=-1) {
                A.add(resp);
            }
        } while(resp != -1);

        System.out.println("Ahora ingrese Pila B:");
        do {
            resp=sc.nextInt();
            if (resp!=-1){
                B.add(resp);
            }
        } while(resp != -1);


        System.out.println("Ingrese la pila VALOR, al menos ingrese un elemento, para dejar de ingresar coloque \"-1\"");
        do{
            resp=sc.nextInt();
            if(resp!=-1){
                VALOR.add(resp);
            }
        }while(resp!=-1 || VALOR.estaVacia());

        sc.close();

        //Comparamos los elementos de A y B
        int[] arrA = A.elementos();
        int[] arrB = B.elementos();
        if(Arrays.equals(arrA,arrB)){
            VERD.add(VALOR.tope());
        }
        else{
            FALSO.add(VALOR.tope());
        }

        // Chequeamos que se hayan pasado correctamente
        int [] arrValor = VALOR.elementos();
        int [] arrVerd = VERD.elementos();
        int [] arrFalso = FALSO.elementos();

        System.out.println("Pila A: " + Arrays.toString(arrA));
        System.out.println("Pila B: " + Arrays.toString(arrB));
        System.out.println("Pila Valor: " + Arrays.toString(arrValor));
        System.out.println("Pila VERD: " + Arrays.toString(arrVerd));
        System.out.println("Pila FALSO: " + Arrays.toString(arrFalso));
    }
}