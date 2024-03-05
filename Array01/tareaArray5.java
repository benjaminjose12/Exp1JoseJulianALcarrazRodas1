package Array01;

import java.util.Scanner;

public class tareaArray5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Introduce 15 números:");

        for (int i = 0; i < 15; i++) {
            numeros[i] = scanner.nextInt();
        }

        int temp = numeros[14];
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = temp;

        System.out.println("Contenido del array después de rotar:");
        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }
    }

}
