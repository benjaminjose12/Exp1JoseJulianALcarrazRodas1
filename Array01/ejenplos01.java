package Array01;

public class ejenplos01 {
    public static void main(String[] args) {
        //  como  defenimos   un array
         int[] arreglo;
         double[] notas;
         //    espacios    que  va atener el arreglo
         arreglo=new int[4];
           notas =new double[5];
           //    rellenar los espacios 
           arreglo[0]= 12;
           arreglo[1]= 15;
           arreglo[2]= 17;
           arreglo[3]= 11;
           //   mostramos    los valores  que tiene  el arreglo 
           System.out.println(arreglo[0]);
           System.out.println(arreglo[1]);
           System.out.println(arreglo[2]);
           System.out.println(arreglo[3]);
           int suma = arreglo[0]+arreglo[1];
           System.out.println("Suma 1er con 2do: "+suma);
        }
    
    }   

