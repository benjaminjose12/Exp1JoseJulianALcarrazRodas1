package Array01;

import java.util.Random;
import java.util.Scanner;

public class tareaArray04 {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

    System.out.println("Introduce 10 números:");
    for (int i = 0; i < 10; i++) {
        numeros[i] = Scanner.nextInt();
        if (numeros[i] > maximo) {
            maximo = numeros[i];
        }
        if (numeros[i] < minimo) {
            minimo = numeros[i];
        }
    }

    System.out.println("Números introducidos:");
    for (int i = 0; i < 10; i++) {
        System.out.print(numeros[i]);
        if (numeros[i] == maximo) {
            System.out.print(" máximo");
        }
        if (numeros[i] == minimo) {
            System.out.print(" mínimo");
        }
        System.out.println();
    }
}
}