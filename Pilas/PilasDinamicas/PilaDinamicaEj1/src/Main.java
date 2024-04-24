import Implementacion.*;
import Interfaz.PilaTDA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pilaDinamica DADA = new pilaDinamica();
        pilaDinamica CJTO1 = new pilaDinamica();
        pilaDinamica CJTO2 = new pilaDinamica();
        Scanner sc = new Scanner(System.in);
        DADA.iniciarPila();
        CJTO1.iniciarPila();
        CJTO2.iniciarPila();

        for(int i = 1; i<=4; i++){
            System.out.println("Ingrese el elemento "+i+": ");
            DADA.apilar(sc.nextInt());
        }

        for(int i = 0; i<3; i++){
            CJTO1.apilar(DADA.tope());
            DADA.desapilar();
        }
        CJTO2.apilar(DADA.tope());
        DADA.desapilar();

        //Imprimimos los elementos
        while(!CJTO1.pilaVacia()){
            System.out.println("Elementos CJTO1: ");
            System.out.println(CJTO1.tope());
            CJTO1.desapilar();
        }

        System.out.println("Elemento CJTO2: ");
        System.out.println(CJTO2.tope());
        CJTO2.desapilar();

        sc.close(); //Cerrar el scanner
    }
}