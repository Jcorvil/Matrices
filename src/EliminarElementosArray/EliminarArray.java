package EliminarElementosArray;

import java.util.Arrays;

public class EliminarArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(eliminarElementoArray()));

    }

    public static int[] eliminarElementoArray() {
         int[] in = {5, 46, 3, 9};
         int[] out = new int[in.length - 1];
         //"System.arraycopy" permite copiar un array a otro. Es una forma de eliminar valores del array que no queremos
         //"System.arraycopy(<array a copiar>, <posición inicial>, <array a sobreescribir>, <posición destino>, <longitud>)
         //Este primer arraycopy imprimirá [5, 0, 0]. Le decimos que del array "in" copie el valor de la posición 1 (0 para el array) y lo introduzca en el primer valor de "out"
         System.arraycopy(in, 0, out, 0, 1);
         //Este segundo arraycopy imprimirá [5, 3, 9]. Le decimos que del array "in" empiece a copiar los valores desde la posición 3 (2 para el array) y los copie en la posición 2 (1 para el array) de out
         //con tamaño 2.
         System.arraycopy(in, 2, out, 1, 2);

        return out;
    }


}