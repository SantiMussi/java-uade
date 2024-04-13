import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creacion de las pilas y variables, iniciamos el scanner
        Estrategia1 MOD = new Estrategia1();
        Estrategia1 DADA = new Estrategia1();
        //Pilas auxiliares
        Estrategia1 DADAIgu = new Estrategia1();
        Estrategia1 DADADif = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;

        //Se solicitan los elementos de la pila MOD y DADA
        System.out.println("Ingrese los elementos enteros para la pila DADA" +
                " si desea dejar de ingresar elementos coloque \"-1\": ");
        do {
            resp = sc.nextInt();
            if (resp !=-1) {
                DADA.add(resp);
            }
        } while(resp != -1);

        System.out.println("Ingrese la pila MOD, Ingrese al menos 1 elemento \"-1\"");
        do{
            resp=sc.nextInt();
            if(resp!=-1){
                MOD.add(resp);
            }
        }while(resp!=-1 || MOD.estaVacia());

        sc.close();

        //Vemos si la pila DADA tiene elementos que sean iguales al tope de MOD, si son iguales se agregan a DADAIgu, sino a DADADif
        while(!DADA.estaVacia()){
            if(DADA.tope() == MOD.tope()){
                DADAIgu.add(DADA.tope());
                DADA.remove();
            }
            else{
                DADADif.add(DADA.tope());
                DADA.remove();
            }
        }

        //Devolvemos los elementos de la pila DADADif a DADA
        while(!DADADif.estaVacia()){
            DADA.add(DADADif.tope());
            DADADif.remove();
        }

        // Chequeamos que se hayan pasado correctamente
        int [] arrA = DADA.elementos();
        int [] arrB = MOD.elementos();
        int [] igu = DADAIgu.elementos();
        int [] dif = DADADif.elementos();

        System.out.println("Pila DADA: " + Arrays.toString(arrA));
        System.out.println("Pila MOD: " + Arrays.toString(arrB));
        System.out.println(Arrays.toString(igu));
        System.out.println(Arrays.toString(dif));
    }
}