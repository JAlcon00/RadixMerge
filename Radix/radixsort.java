package Radix;

public class radixsort {
    public static void main(String[] args) {
        int[] arr = { 22, 178, 249, 6, 18, 314};
        int[] arr2 = new int[9];
        int mayor = Arrays.stream(arr).max().getAsInt();

        System.out.println("Arreglo inicial: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}