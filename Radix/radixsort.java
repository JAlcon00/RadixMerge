package Radix;

public class radixsort {
    public static void main(String[] args) {
        int[] arr = { 22, 178, 249, 6, 18, 314};
        Integer[][] arr2 = new Integer[10][arr.length];
        int mayor = MAX(arr);
        int iteraciones = iteraciones(mayor) - 1;
        int digitos = iteraciones + 1;

        System.out.println("Arreglo inicial: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println();

        int numeroimpresion = 1;
        while (iteraciones >= 0) {
            int posicion = 0;
            for (int k : arr) {
                String numero = Integer.toString(k);
                if (numero.length() < digitos) {
                    int diferencia = digitos - numero.length();
                    for (int j = 0; j < diferencia; j++) {
                        numero = "0" + numero;
                    }
                }
                char valor = numero.charAt(iteraciones);
                switch (valor) {
                    case '0' -> arr2[0][posicion] = k;
                    case '1' -> arr2[1][posicion] = k;
                    case '2' -> arr2[2][posicion] = k;
                    case '3' -> arr2[3][posicion] = k;
                    case '4' -> arr2[4][posicion] = k;
                    case '5' -> arr2[5][posicion] = k;
                    case '6' -> arr2[6][posicion] = k;
                    case '7' -> arr2[7][posicion] = k;
                    case '8' -> arr2[8][posicion] = k;
                    case '9' -> arr2[9][posicion] = k;
                }
                ++posicion;
            }

            int variableordenado = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    if (arr2[i][j] != null) {
                        arr[variableordenado] = arr2[i][j];
                        arr2[i][j] = null;
                        variableordenado += 1;
                    }
                }
            }

            // Impresion de cada iteracion e impresion final
            if (iteraciones == 0) {
                System.out.println("Arreglo ordenado: ");
            } else {
                System.out.println("Iteracion " + numeroimpresion);
            }
            for (int i : arr) {
                System.out.print(i + ", ");
            }
            System.out.println();
            ++numeroimpresion;
            --iteraciones;
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

    public static int iteraciones (int mayor){
        int iteraciones = 0;
        while (mayor > 0) {
            mayor = mayor / 10;
            iteraciones++;
        }
        return iteraciones;
    }
}