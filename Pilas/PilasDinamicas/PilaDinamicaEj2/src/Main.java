import Implementacion.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Iniciamos pilas, variables, etc.
        pilaDinamica ORIGEN = new pilaDinamica();
        pilaDinamica DESTINO = new pilaDinamica();
        Scanner sc = new Scanner(System.in);
        ORIGEN.iniciarPila();
        DESTINO.iniciarPila();

        //Solicitamos primero el tamaño de la pila y luego los elementos
        System.out.println("Ingrese el tamaño de la pila: ");
        int size = sc.nextInt();

        System.out.println("Ingrese los elementos");
        for(int i = 0; i<size; i++){
            ORIGEN.apilar(sc.nextInt());
        }

        //Enviamos los elementos de origen a destino
        while(!ORIGEN.pilaVacia()){
            DESTINO.apilar(ORIGEN.tope());
            ORIGEN.desapilar();
        }

        //Imprimimos los elementos
        System.out.println("Elementos ORIGEN: ");
        while(!ORIGEN.pilaVacia()){
            System.out.println(ORIGEN.tope());
            ORIGEN.desapilar();
        }
        System.out.println("Elementos DESTINO: ");
        while(!DESTINO.pilaVacia()) {
            System.out.println(DESTINO.tope());
            DESTINO.desapilar();
        }

        sc.close(); //Cerrar el scanner
    }
}