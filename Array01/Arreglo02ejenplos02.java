package Array01;

public class Arreglo02ejenplos02 {
    public static void main(String[] args) {
        //  declaramo alas  varbles  para el rray
        int[] numeros = new int[15];
        // llenamos los  arreglos 
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }
        // Mostramos los valores del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
            


    }
}
