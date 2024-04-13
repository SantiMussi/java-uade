import Implementaciones.Estrategia1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Creacion de las pilas y variables, iniciamos el scanner
        Estrategia1 DADA = new Estrategia1();
        Estrategia1 LIMITE = new Estrategia1();
        Estrategia1 MAY = new Estrategia1();
        Estrategia1 MEN = new Estrategia1();
        Scanner sc = new Scanner(System.in);
        int resp;

        //Se solicitan los elementos de la pila DADA y LIMITE
        System.out.println("Ingrese los elementos enteros para la pila DADA y luego de la pila LIMITE, al menos ingrese uno" +
                " si desea dejar de ingresar elementos coloque \"-1\": ");
        do {
            resp = sc.nextInt();
            if (resp !=-1) {
                DADA.add(resp);
            }
        } while(resp != -1 || DADA.estaVacia());

        System.out.println("Ahora ingrese Pila LIMITE:");
        do {
            resp=sc.nextInt();
            if (resp!=-1){
                LIMITE.add(resp);
            }
        } while(resp != -1 || LIMITE.estaVacia());
        sc.close();

        //Comparacion entre los elementos de la pila DADA con el tope de LIMITE
        while(!DADA.estaVacia()){
            if(DADA.tope() >= LIMITE.tope()){
                MAY.add(DADA.tope());
                DADA.remove();
            }
            else{
                MEN.add(DADA.tope());
                DADA.remove();
            }
        }

        // Chequeamos que se hayan pasado correctamente
        int[] arrDada = DADA.elementos();
        int[] arrLim = LIMITE.elementos();
        int [] arrMin = MEN.elementos();
        int [] arrMax = MAY.elementos();
        System.out.println("Pila DADA: " + Arrays.toString(arrDada));
        System.out.println("Pila LIMITE: " + Arrays.toString(arrLim));
        System.out.println("Pila MEN: " + Arrays.toString(arrMin));
        System.out.println("Pila MAY: " + Arrays.toString(arrMax));
    }
}