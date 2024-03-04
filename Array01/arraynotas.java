package Array01;

public class arraynotas {
    public static void main(String[] args) {
        // arreglo de  notas 
        double[] notas = new double[5];
        System.out.println("INgrrese las notas  de  la 1 parcial");
         for (int i =0;i< notas.length;i++){
        System.out.println(" nota  del estudiante nº " + (i+1)+":");
         notas[i]= double. parsedouble( System.console().readLine());
         
         }
}
} 