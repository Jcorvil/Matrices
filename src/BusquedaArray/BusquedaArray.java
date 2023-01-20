package BusquedaArray;

import java.util.Arrays;

public class BusquedaArray {
    public static void main(String[] args) {
        //El .binarySearch dice en que posición del array se encuentra el numero dado.
        //Dado el numero 3, nos dice que está en la posición 2 del array.
        int[] c = {1, 2, 3, 4};
        System.out.println("Busqueda binaria: " + Arrays.binarySearch(c,3));
    }
}