package EliminarElementosArray;

import java.util.Arrays;

public class EliminarArray {
    public static void main(String[] args) {
        int[] in = {5, 46, 3, 9};
        int pos = 1;
        System.out.println(Arrays.toString(eliminarElementoArray(in, pos)));

    }

    public static int[] eliminarElementoArray(int[]in, int pos) {
         int[] out = new int[in.length - 1];
         //"System.arraycopy" permite copiar un array a otro. Es una forma de eliminar valores del array que no queremos
         //"System.arraycopy(<array a copiar>, <posición inicial>, <array a sobreescribir>, <posición destino>, <longitud>)
         //Este primer arraycopy imprimirá [5, 0, 0]. Le decimos que del array "in" copie el valor de la posición 1 (0 para el array) y lo introduzca en el primer valor de "out"
         System.arraycopy(in, 0, out, 0, pos);
         //Este segundo arraycopy imprimirá [5, 3, 9]. Le decimos que del array "in" empiece a copiar los valores desde la posición 3 (2 para el array) y los copie en la posición 4 (3 para el array) de out
         //con tamaño 2.
         System.arraycopy(in, pos + 1, out, pos, (in.length - pos - 1));

        return out;
    }


}