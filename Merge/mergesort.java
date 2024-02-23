package Merge;
import java.util.*;
 /*
  * Author A: Almanza Contreras José de Jesús
  * Author B: Alonso Romero Pablo Emilio
  * Author C: Duran Torres Leonardo Gael
*/

public class mergesort {
    public static void main(String[] args) {
        //Arreglo de pruebas
        int[] arr = {453, 656, 123, 44, 90, 500, 45, 999, 34};
        int n = arr.length;
        //inicializamos un arreglo temporal para realizar las operaciones a parte
        int[] temp = new int[n];


        //Se empieza a dividir los numeros en grupos más pequeños
        for(int tam = 1; tam < n; tam *= 2 ){
            // Recorrer el arreglo en segmentos del tamaño actual
            //Aqui aplicamos la iteración para ordenarlos de 0 a n según su valor
            for(int ini = 0; ini < n - 1;ini += 2 * tam){
                // Calcular el final del segmento actual
                // Encontrar el punto medio y el final del segmento derecho
                int fin = Math.min(ini + 2 * tam - 1, n - 1);
                int mid = Math.min(ini + tam - 1, n - 1);
                

                //Aqui podemos fusionar los segmentos temporales
                //Esto es para saber donde termina cada grupo de numeros que estamos ordenando
                int i = ini, j = mid + 1, k = ini;


                //Aqui podemos fusionar los segmentos temporales
                while (i <= mid && j <= fin) {
                    /*
                     * Aqui va a comparar los numeros y determinará
                     * cual numero es más grande y luego los va a regresar
                     * a la caja vacia ordenados
                     */
                    if (arr[i] <= arr[j]) {
                        temp[k++] = arr[i++];
                    } else {
                        temp[k++] = arr[j++];
                    }
                    
                }

                /////////////////////////////////////////////////
                //Aqui se van a ordenar los numeros basado en su tamaño

                while(j <= fin){
                    temp[k++] = arr[j++];
                }
                
                while (i <= mid){
                    temp[k++] = arr[i++];
                
                }

                //Se verifica que ningun dato se haya omitido

                for(i = ini ; i <= fin; i++){
                    arr[i] = temp[i];
                }
            







            }
        }

    
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }
}    
