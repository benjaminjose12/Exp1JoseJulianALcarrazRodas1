package Exp1JoseJulianALcarrazRodas;

import java.util.Scanner;

public class pregunta01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada lo  que    nosotros  ponemos  en pantalla

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt(); //profe aqui   leemos   el primer número  quevamos  a  introdusir   por teclado 

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt(); // y luego  el segundo  número   que vamos  a intruducir 

        System.out.print("Introduce el tamaño del grupo: ");
        int groupSize = scanner.nextInt(); // asignamos  el tamaño del grupo

        int currentNumber = num1; // Inicializamos el número actual con el primer número introducido

        while (currentNumber <= num2) { 
            for (int i = 0; i < groupSize && currentNumber <= num2; i++) { 
                System.out.print(currentNumber + " "); // Imprimimos el número actual
                currentNumber++; // incrementamos el número actual
            }
            System.out.println(); 
            if (currentNumber <= num2) { // Verificamos si aún hay más números para imprimir
                System.out.print("¿Quieres continuar? (s/n): ");
                char choice = scanner.next().charAt(0); //  ledamos   la  decision al  usuario (s para sí, n para no)
                if (choice != 's') 
                    break;
            }
        }

        scanner.close(); 
    }
}  //    y serramos el codigo   el  para  que    nos pueda   ejecutar  espero que   este  bien   porfa  