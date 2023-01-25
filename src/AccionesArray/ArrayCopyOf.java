package AccionesArray;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};

        //"Array.copyOf" permite copiar los primeros X valores del array.
        int [] b = Arrays.copyOf(a, 6);

        //"Array.copyOfRange" copia los valores de un array dentro del rango especificado.
        int [] c = Arrays.copyOfRange(b, 2, 5);

        //Imprime copyOf
        System.out.println(Arrays.toString(b));

        //Imprime copyOfRange
        System.out.println(Arrays.toString(c));
    }
}