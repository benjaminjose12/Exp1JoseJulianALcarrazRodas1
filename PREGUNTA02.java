public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        ArrayList<Integer> numeros = new ArrayList<>(); // Creamos un ArrayList para almacenar la secuencia de números
        int introducciones = 0; // Variable para contar el número de introducciones
        int maxRepeticiones = 0; // Variable para almacenar el máximo de repeticiones consecutivas
        int repeticionesActuales = 1; // Variable para contar las repeticiones consecutivas del número actual
        int numeroMasRepetido = 0; // Variable para almacenar el número que más se repite
        
        System.out.println("Introduce números (introduce 0 para terminar):"); // Solicitamos al usuario que introduzca números
        
        // Bucle para leer números hasta que se introduzca el 0
        while (true) {
            int numero = scanner.nextInt(); // Leemos el número ingresado por el usuario
            
            if (numero == 0) { // Si el número es 0, salimos del bucle
                break;
            }
            
            numeros.add(numero); // Añadimos el número al ArrayList
            introducciones++; // Incrementamos el contador de introducciones
            
            // Verificamos si el número actual es igual al anterior para contar repeticiones consecutivas
            if (numeros.size() > 1 && numeros.get(numeros.size() - 1).equals(numeros.get(numeros.size() - 2))) {
                repeticionesActuales++;
            } else {
                // Si el número actual es diferente al anterior, comparamos las repeticiones con el máximo actual
                if (repeticionesActuales > maxRepeticiones) {
                    maxRepeticiones = repeticionesActuales; // Actualizamos el máximo de repeticiones
                    numeroMasRepetido = numeros.get(numeros.size() - 2); // Actualizamos el número que más se repite
                }
                repeticionesActuales = 1; // Reiniciamos el contador de repeticiones consecutivas
            }
        }
        
        // Mostramos el resultado con el número que más se repite y la cantidad de veces que se ha repetido
        System.out.println("El número más repetido es el " + numeroMasRepetido + " y se ha escrito " + maxRepeticiones + " veces.");
        
        // Mostramos el número total de introducciones
        System.out.println("Se han introducido " + introducciones + " números en total.");
        
        scanner.close(); // Cerramos el Scanner para liberar recursos
    }
}