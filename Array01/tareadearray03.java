package Array01;

import java.util.Random;

public class tareadearray03 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
    Random random = new Random();     //  generamos un numero aleatorio en tre    0 a 100  estamos fino profe 
    for (int i = 0; i < 20; i++) {
        numero[i]= numero[i]* numero[i];
        cubo[i] =numero[i]* numero[i]*numero[i];
        System.out.println("Número\\tCuadrado\\tCubo");
        for (int i = 0; i < 20; i++); {
            System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
        

    }
}
}
}