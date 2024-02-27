package Exp1JoseJulianALcarrazRodas;

public class pregunta03 {
    public static void main(String[] args) {

        System.out.println("Cálculo del tiempo de caída de un objeto.");// dicando al usuario el propósito del programa.
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: "); // ESta  linia de codigo nos dice que el mensaje pidiendo al usuario que introduzca la altura desde la que cae el objeto.
        Double h = Double.parseDouble(System.console().readLine());
    
        final double g = 9.81; // las constantes se declaran con final
        double s = Math.sqrt(2*h/g);
    
        System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
      }
    }