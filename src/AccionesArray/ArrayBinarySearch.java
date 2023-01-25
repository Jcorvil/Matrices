package AccionesArray;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] a = {10, 3, 12, 13, 5, 8, 7};
        //"Arrays.sort" ordena el array de menor a mayor
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Busqueda manual. El numero introducido está en la posición " + manual(a, 8));
        //"Arrays.binarySearch" dice en que posición del array se encuentra el numero dado (empezando desde 0).
        System.out.println("Busqueda binaria. El numero introducido está en la posición " + Arrays.binarySearch(a,8));
    }

    static int manual (int[] a, int x){
        //La x almacena el numero que queremos buscar.
        //La i se incrementa en el array hasta que es igual que la x.
        for(int i = 0; i < a.length; i++){
            if(x == a[i]){
                //Devuelve el numero de instancias de la i, que va a coincidir con la x, dándonos la posición.
                return i;
            }
        }
        return -1;
    }
}