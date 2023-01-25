package AccionesArray;

import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {

        //"Arrays.fill" cambia todos los valores de un array por el valor dado.
        //Se cambian todos los valores del array 'a' por 8, sin importar que numeros sean.
        int [] a = {1,2,3,4,15,45,130};
        Arrays.fill(a, 8);
        System.out.println(Arrays.toString(a));

        int [][] b = new int[2][2];
        Arrays.fill(b[0], 10);
        Arrays.fill(b[1], 15);
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
    }
}