package Radix;

public class radixsort {
    public static void main(String[] args) {
        int[] arr = {22, 178, 249, 6, 18, 314};

        radixsort(arr);

        System.out.println("Arreglo Ordenado");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }

    }
    }
}    
