package Radix;

public class radixsort {
    public static void main(String[] args) {
        int[] arr = { 22, 178, 249, 6, 18, 314};
        int[][] arr2 = new int[10][10];
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
            for (int i = 0; i < arr.length; i++) {
                String numero = Integer.toString(arr[i]);
                if (numero.length() < digitos) {
                    int diferencia = digitos - numero.length();
                    for (int j = 0; j < diferencia; j++) {
                        numero = "0" + numero;
                    }
                }
                char valor = numero.charAt(iteraciones);
                switch (valor) {
                    case '0':
                        arr2[0][posicion] = arr[i];
                        break;
                    case '1':
                        arr2[1][posicion] = arr[i];
                        break;
                    case '2':
                        arr2[2][posicion] = arr[i];
                        break;
                    case '3':
                        arr2[3][posicion] = arr[i];
                        break;
                    case '4':
                        arr2[4][posicion] = arr[i];
                        break;
                    case '5':
                        arr2[5][posicion] = arr[i];
                        break;
                    case '6':
                        arr2[6][posicion] = arr[i];
                        break;
                    case '7':
                        arr2[7][posicion] = arr[i];
                        break;
                    case '8':
                        arr2[8][posicion] = arr[i];
                        break;
                    case '9':
                        arr2[9][posicion] = arr[i];
                        break;
                }
                ++posicion;
            }

            int variableordenado = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    if (arr2[i][j] != 0) {
                        arr[variableordenado] = arr2[i][j];
                        arr2[i][j] = 0;
                        variableordenado += 1;
                    }
                }
            }

            // Impresion de cada iteracion

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