package Arrayclase02;

import java.util.Random;
import java.util.Scanner;

// escribe un programa   en java  que llene  un array  de 100 elementos   con números enteros. 
//aleatorias   entre 0y 500   continuación  el programa  mostrara  el array  y preguntara al usuario  si .
//quiere  destacar  el máximo o mínimo  seguidamente  se volverá  amostrar el array  escribiendo el numero  destacado  entre  dobles asterisco 
public class ARRAYeejenplo2 {
   public static void main(String[] args) {
    Random random = new Random();
     Scanner scanner = new Scanner(System.in);
     int[] numeros = new int[100];
     for (int i = 0; i < 100; i++) {

        numeros[i] = random.nextInt(501); // Se usa 501 para incluir el 500
    }

    // Mostrar el array original
    System.out.println("Array original:");
    mostrarArray(numeros);

    // Preguntar al usuario si quiere destacar el máximo o mínimo
    System.out.print("¿Quieres destacar el máximo (M) o el mínimo (m)? ");
    char opcion = scanner.next().charAt(0);

    // Encontrar el máximo o mínimo y destacarlo
    int destacado;
    if (opcion == 'M' || opcion == 'm') {
        destacado = opcion == 'M' ? encontrarMaximo(numeros) : encontrarMinimo(numeros);
        System.out.println("Array con el máximo destacado:");
    } else {
        System.out.println("Opción no válida.");
        return;
    }

    // Mostrar el array con el número destacado entre dobles asteriscos
    mostrarArrayConDestacado(numeros, destacado);
}

// Método para mostrar un array de números
public static void mostrarArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
        if ((i + 1) % 10 == 0) {
            System.out.println(); // Nueva línea después de mostrar 10 números
        }
    }
    System.out.println(); // Nueva línea al final
}

// Método para encontrar el máximo en un array
public static int encontrarMaximo(int[] array) {
    int maximo = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maximo) {
            maximo = array[i];
        }
    }
    return maximo;
}

// Método para encontrar el mínimo en un array
public static int encontrarMinimo(int[] array) {
    int minimo = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < minimo) {
            minimo = array[i];
        }
    }
    return minimo;
}

// Método para mostrar el array con el número destacado entre dobles asteriscos
public static void mostrarArrayConDestacado(int[] array, int destacado) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == destacado) {
            System.out.print("**" + array[i] + "** ");
        } else {
            System.out.print(array[i] + " ");
        }
        if ((i + 1) % 10 == 0) {
            System.out.println(); // Nueva línea después de mostrar 10 números
        }
    }
    System.out.println(); // Nueva línea al final
    
   } 
}