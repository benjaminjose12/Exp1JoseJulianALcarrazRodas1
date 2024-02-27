package Ejercicios01;

import java.util.Random;

public class Ejercicios01 { public class BarajaFrancesa {

    public static void main(String[] args) {
        Random rand = new Random();
        int palo = rand.nextInt(4) + 1; // Genera un número aleatorio entre 1 y 4 para representar los palos
        int carta = rand.nextInt(13) + 1; // Genera un número aleatorio entre 1 y 13 para representar las cartas

        String nombrePalo = "";
        String nombreCarta = "";
        // Asigna el nombre del palo
        switch (palo) {
            case 1:
                nombrePalo = "Picas";
                break;
            case 2:
                nombrePalo = "Corazones";
                break;
            case 3:
                nombrePalo = "Diamantes";
                break;
            case 4:
                nombrePalo = "Tréboles";
                break;
        }

        // Asigna el nombre de la carta
        switch (carta) {
            case 1:
                nombreCarta = "A";
                break;
            case 11:
                nombreCarta = "J";
                break;
            case 12:
                nombreCarta = "Q";
                break;
            case 13:
                nombreCarta = "K";
                break;
            default:
                nombreCarta = String.valueOf(carta);
                break;
        }

        // Muestra el nombre de la carta al azar
        System.out.println("Carta al azar: " + nombreCarta + " de " + nombrePalo);
    }
}
}

