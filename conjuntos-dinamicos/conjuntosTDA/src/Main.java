import Implementacion.conjuntosDinamicos;
import Interfaz.*;
import java.util.Random;

public class Main {
    public static void imprimirConjunto(conjuntosDinamicos conjunto){
        for(int i=0; i<100; i++){
            if(conjunto.pertenece(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static int contarElementosComunes(conjuntosDinamicos conjunto1, conjuntosDinamicos conjunto2){
        int count =0;
        for(int i=0; i<100; i++){
            if(conjunto1.pertenece(i) && conjunto2.pertenece(i)){count++;}
        }
        return count;
    }
    public static void main(String[] args) {
        conjuntosDinamicos cjto1 = new conjuntosDinamicos();
        conjuntosDinamicos cjto2 = new conjuntosDinamicos();
        Random rand = new Random();

        //Inicializamos conjuntos y agregamos 10 elementos random
        cjto1.inicializarConjunto();
        cjto2.inicializarConjunto();

        for(int i=0; i<10;i++){
            cjto1.agregar(rand.nextInt(50));
        }
        for(int i=0; i<10;i++){
            cjto2.agregar(rand.nextInt(50));
        }

        System.out.println("Elementos del cjto1: ");
        imprimirConjunto(cjto1);
        System.out.println("---------------------------------");
        System.out.println("Elementos del cjto2: ");
        imprimirConjunto(cjto2);

        int count = contarElementosComunes(cjto1, cjto2);

        System.out.println("Cantidad de elementos comunes: " + count);
    }
}