package Ejercicios06;

import java.util.Random;

public class EJERCICOs08 {
    
    public static void main(String[] args) {
        String[] figuras = {"corazón", "diamante", "herradura", "campana", "limón"};
        Random random = new Random();

        String figura1 = figuras[random.nextInt(5)];
        String figura2 = figuras[random.nextInt(5)];
        String figura3 = figuras[random.nextInt(5)];

        System.out.println(figura1 + " " + figura2 + " " + figura3);

        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }
    }
}

