package Exp1JoseJulianALcarrazRodas;

import java.util.Scanner;

public class pregunta04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        
        // Solicitar al usuario que ingrese el año, el mes y el día de su fecha de nacimiento
        System.out.println("Introduce el año de tu fecha de nacimiento:");
        int year = scanner.nextInt();
        System.out.println("Introduce el mes de tu fecha de nacimiento (1-12):");
        int month = scanner.nextInt();
        System.out.println("Introduce el día de tu fecha de nacimiento:");
        int day = scanner.nextInt();
        
        // Comprobar si la fecha introducida es válida
        if (year > 0 && month >= 1 && month <= 12 && day >= 1 && day <= 28) {
            // Calcular el número mágico sumando todos los dígitos de la fecha de nacimiento
            int magicNumber = calcularNumeroMagico(year, month, day);
            
            // Reducir el número mágico a un solo dígito
            while (magicNumber > 9) {
                magicNumber = sumarDigitos(magicNumber);
            }
            
            // Mostrar el número mágico por pantalla
            System.out.println("Tu número mágico es: " + magicNumber);
        } else {
            // Si la fecha introducida no es válida, mostrar un mensaje de error
            System.out.println("La fecha introducida no es válida.");
        }
        
        scanner.close();
    }
    
    // Método para calcular el número mágico sumando todos los dígitos de la fecha de nacimiento
    public static int calcularNumeroMagico(int year, int month, int day) {
        int sum = 0;
        
        // Sumar los dígitos de año, mes y día
        sum += sumarDigitos(year);
        sum += sumarDigitos(month);
        sum += sumarDigitos(day);
        
        return sum;
    }
    
    // Método para sumar todos los dígitos de un número
    public static int sumarDigitos(int num) {
        int sum = 0;
        
        // Iterar hasta que num sea 0, sumando cada dígito a sum
        while (num != 0) {
            sum += num % 10; // Obtener el último dígito de num y sumarlo a sum
            num /= 10; // Eliminar el último dígito de num
        }
        
        return sum;
    }
}