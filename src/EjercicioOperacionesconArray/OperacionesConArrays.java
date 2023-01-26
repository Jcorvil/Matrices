package EjercicioOperacionesconArray;

import java.util.Arrays;
import java.util.Random;

public class OperacionesConArrays {
    public static void main(String[] args) {
        //1.-Crea un array con 10 números aleatorios
        int [] a = new int [10];
        arrayRandom(a);

        //2.-Imprime el array anterior empezando por la última posición

        //3.-Ordena el array utilizando la clase de utilidades Arrays
        Arrays.sort(a);
        //4.-Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes:
            //De manera manual
        System.out.println(busquedaManual(a, 25));
            //Usando la clase de utilidades Arrays
        System.out.println(Arrays.binarySearch(a, 25));

    }

    public static int [] arrayRandom(int[]a){
        Random aleatorio1 = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) aleatorio1.nextInt(100);
        }
        return a;
    }

    //Busqueda manual ejercicio 4
    static int busquedaManual (int[] a, int x){
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