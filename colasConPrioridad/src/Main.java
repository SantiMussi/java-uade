/*
Cargar 10 elementos random en las colas origen y prioridad
Crear una cola con prioridad a partir de esos elementos
 */

import Implementacion.ColaPrioridadEstrategia2;
import Implementacion.estrategiaColas;
import Interfaz.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ColaConPrioridadTDA cola = new ColaPrioridadEstrategia2(10);
        ColaTDA origen = new estrategiaColas();
        ColaTDA colaPrioridad = new estrategiaColas();
        origen.iniciarCola();
        colaPrioridad.iniciarCola();

        int[] valores = {5,1,3,7,9,2,6,8,4,0};
        int[] prioridades = {15,1,13,5,8,3,11,7,10,2};

        //Cargamos los elementos en las colas origen y prioridad
        for(int i = 0; i<10; i++){
            System.out.println("Acolando valor: " + valores[i] + " con prioridad: " + prioridades[i]);
            origen.acolar(valores[i]);
            colaPrioridad.acolar(prioridades[i]);
        }

        while(!origen.colaVacia()){
            int elemento = origen.primero();
            int priori = colaPrioridad.primero();
            cola.AcolarPrioridad(elemento, priori);
            origen.desacolar();
            colaPrioridad.desacolar();
        }

        while(!cola.ColaVacia()){
            int elemento = cola.Primero();
            int prioridad = cola.Prioridad();
            System.out.println("Elemento: " + elemento + " con prioridad: " + prioridad);
            cola.Desacolar();
        }
    }
}