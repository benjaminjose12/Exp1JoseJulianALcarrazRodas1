package Ejercicios06;

public class EJERCICIO02 {
  public static void main(String[] args) {
    System.out.println("20 números enteros aleatorios entre 0 y 10:");
    for (int i = 0; i < 20; i++) {
        int numero = (int) (Math.random() * 11); // Genera un número aleatorio entre 0 y 10 (ambos incluidos)
        System.out.print(numero + " ");
    }
}
}
