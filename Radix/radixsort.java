package Radix;

public class radixsort {
    public static void main(String[] args) {
        // Arreglo original
        int[] arr = { 22, 178, 249, 6, 18, 314};
        /* Arreglo bidimensional en donde se acomodan los numeros dependiendo de su digito
        *  se inicializa en nulls  */
        Integer[][] arr2 = new Integer[10][arr.length];
        // Se obtiene el numero mayor del arreglo
        int mayor = MAX(arr);
        // Se obtiene el numero de iteraciones que se haran en el while
        int iteraciones = iteraciones(mayor) - 1;
        // Se obtiene el numero de digitos que tiene el numero mayor
        int digitos = iteraciones + 1;

        // Impresion del arreglo inicial
        System.out.println("Arreglo inicial: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        // Salto de linea
        System.out.println();

        // Se inicializa el numero de impresion para cada iteracion
        int numeroimpresion = 1;
        // Se inicializa el while en donde se haran las iteraciones dependiendo de la variable iteraciones
        while (iteraciones >= 0) {
            // Variable para saber en que posicion de columna se va a poner el numero
            int posicion = 0;
            // For para que se acomodan los numeros dependiendo de su digito
            for (int k : arr) {
                // Se convierte el numero a string para poder obtener el digito
                String numero = Integer.toString(k);
                // Si el numero es menor a la cantidad de digitos que tiene el numero mayor se le agregan 0 al inicio dependiendo
                // de los digitos que le falten
                if (numero.length() < digitos) {
                    // Se obtiene la diferencia de digitos que le faltan al numero
                    int diferencia = digitos - numero.length();
                    // For donde se le ponen los 0 al inicio del numero
                    for (int j = 0; j < diferencia; j++) {
                        numero = "0" + numero;
                    }
                }
                // Se obtiene el digito dependiendo de la iteracion en la que se vaya, iniciando en decenas, centenas, milesimas, etc
                char valor = numero.charAt(iteraciones);
                // Dependiendo del digito se acomoda el numero en la columna correspondiente
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
                // Se aumenta la posicion para que cambie de columna
                ++posicion;
            }

            // Variable para saber en que posicion del arreglo inicial se va a poner el numero
            int variableordenado = 0;
            // For anidado para volver a acomodar los numeros en el arreglo inicial
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    // Si el numero es diferente de null se acomoda en el arreglo inicial
                    if (arr2[i][j] != null) {
                        // Se acomoda el numero del arreglo bidimensional en el arreglo inicial
                        arr[variableordenado] = arr2[i][j];
                        // Se pone el valor en null para que en el arreglo bidimensional
                        arr2[i][j] = null;
                        // Se aumenta la variable para que se acomode el siguiente numero
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
            // Cambia el numero de impresion
            ++numeroimpresion;
            // Cambia la iteracion. Cambia el digito que se va a tener que comparar
            --iteraciones;
        }
    }

    // Metodo para obtener el numero mayor del arreglo
    public static int MAX (int[] arreglo){
        // Se inicializa el numero mayor con el primer numero del arreglo
        int max = arreglo[0];
        // For para comparar el numero mayor con los demas numeros del arreglo
        for (int j : arreglo) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    // Metodo para obtener el numero de iteraciones que se haran en el while
    public static int iteraciones (int mayor){
        // Variable para saber cuantas iteraciones se haran
        int iteraciones = 0;
        // Se divide el numero mayor entre 10 hasta que sea menor a 0
        while (mayor > 0) {
            mayor = mayor / 10;
            iteraciones++;
        }
        return iteraciones;
    }
}