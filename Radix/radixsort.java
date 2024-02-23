package Radix;

public class radixsort {
    public static void main(String[] args) {
        int[] arr = { 22, 178, 249, 6, 18, 314};
        int[] arr2 = new int[9];
        int mayor = MAX(arr);

        System.out.println("Arreglo inicial: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println();

        while (mayor > 0) {


            mayor = mayor / 10;
        }
    }

    public static int MAX (int[] arreglo){
        int max = arreglo[1];
        for (int j : arreglo) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}