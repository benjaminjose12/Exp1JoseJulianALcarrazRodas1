package Arrayclase02;

import java.util.Random;

public class Ejenplo01 {
 public static void main(String[] args) {
    Random random = new Random();
    System.out.println("Generando 8 números enteros aleatorios:");
    for(int i = 0; i < 8; i++) {
        int numero = random.nextInt();
        String tipo = (numero % 2 == 0) ? "par" : "impar"; // Determina si el número es par o impar
            System.out.println(numero + " es " + tipo);
        }
    }
}
 