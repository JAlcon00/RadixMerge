package Merge;
import java.util.Random;
/*
 * Author A: Almanza Contreras José de Jesús
 * Author B: Alonso Romero Pablo Emilio
 * Author C: Duran Torres Leonardo Gael
   Hacer un programa que tome un arreglo caracteres aleatorios con n datos e implemente
   el algoritmo de ordenamiento Merge Sort en el cual los datos se separan por dato, se mandan
   a un arreglo temporal, se reordenan por dato, se reordenan desde la unidades, decenas, centenas y millares
*/

public class mergesort {
    public static void main(String[] args) {
        // Tamaño del arreglo
        int n = 9;
        // Arreglo de pruebas con valores aleatorios
        int[] arr = generarArreglo(n);
        // Arreglo temporal para realizar las operaciones
        int[] temp = new int[n];

        // Se empieza a dividir los numeros en grupos más pequeños
        for (int tam = 1; tam < n; tam *= 2) {
            // Recorrer el arreglo en segmentos del tamaño actual
            // Aqui aplicamos la iteración para ordenarlos de 0 a n según su valor
            for (int ini = 0; ini < n - 1; ini += 2 * tam) {
                // Calcular el final del segmento actual
                // Encontrar el punto medio y el final del segmento derecho
                // se toman los grupos de numeros hasta que esten ordenados
                int fin = Math.min(ini + 2 * tam - 1, n - 1);
                int mid = Math.min(ini + tam - 1, n - 1);

                // Aqui podemos fusionar los segmentos temporales
                // Esto es para saber donde termina cada grupo de numeros que estamos ordenando
                int i = ini, j = mid + 1, k = ini;

                // Aqui podemos fusionar los segmentos temporales
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
                // Aqui se van a ordenar los numeros basado en su tamaño

                while (j <= fin) {
                    temp[k++] = arr[j++];
                }

                while (i <= mid) {
                    temp[k++] = arr[i++];

                }

                // Se verifica que ningun dato se haya omitido

                for (i = ini; i <= fin; i++) {
                    arr[i] = temp[i];
                }

                /*
                 * Esta serie de impresiones es para importar ImprimirArreglo para que se
                 * imprima
                 * iteración por iteración.
                 */
                System.out.println("\nDespues de fusionar desde " + ini + " hasta " + fin + ": ");
                imprimirArreglo(arr);
            }
            System.out.println("\nDespues de completar segmentos de tamaño " + tam + ": ");
            imprimirArreglo(arr);
        }
        System.out.println("\nArreglo ordenado: ");
        imprimirArreglo(arr);
    }

    // Método para generar un arreglo de tamaño n con valores aleatorios
    public static int[] generarArreglo(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000); // Genera valores aleatorios entre 0 y 999
        }
        return arr;
    }

    // Se crea ImprimirArreglo a travez de un ciclo iterativo para que se
    // puedan apreciar los cambios del ordenamiento

    public static void imprimirArreglo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
