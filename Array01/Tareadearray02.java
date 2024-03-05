package Array01;

public class Tareadearray02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
