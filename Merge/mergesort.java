package Merge;
 import java.util.*;

public class mergesort {
    public static void main(String[] args) {
        //Arreglo de pruebas
        int[] arr = {453, 656, 123, 44, 90, 500, 45, 999, 34};
        int n = arr.length;
        //inicializamos un arreglo temporal para realizar las operaciones a parte
        int[] temp = new int[n];


        //queda pendiente un cliclo anidado de comparación entre el arreglo original y el arreglo segundario
        //Ciclo de iteración linear inicialmente de a 1 elemento, duplicándolo en cada turno 
        for(int tam = 1; tam < n; tam *= 2 ){
            for(int ini = 0; ini < n - 1;ini += 2 * tam){

            }
        }

    
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }
    
}