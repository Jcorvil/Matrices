package EjercicioOperacionesconArray;

import java.util.Arrays;
import java.util.Random;

public class OperacionesConArrays {
    public static void main(String[] args) {

        //1.-Crea un array con 10 números aleatorios
        int [] a = new int [10];
        int [] b = new int [10];
        System.out.println("--Apartado 1");
        arrayRandom(a);
        System.out.println(Arrays.toString(a));


        //2.-Imprime el array anterior empezando por la última posición
        System.out.println("--Apartado 2");
        arraUltimo(a);


        //3.-Ordena el array utilizando la clase de utilidades Arrays
        System.out.println("--Apartado 3");
        Arrays.sort(a);
        System.out.println("Array ordenado " + Arrays.toString(a));


        //4.-Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes:
            //De manera manual
        System.out.println("--Apartado 4");
        System.out.println("Manual: ");
        System.out.println(busquedaManual(a, 20));
            //Usando la clase de utilidades Arrays
        System.out.println("Utilidades: ");
        System.out.println(Arrays.binarySearch(a, 20));


        //5.-Compara dos arrays recibidos por parámetros devolviendo si son iguales o no.
        System.out.println("--Apartado 5");
        System.out.println(Arrays.equals(a, b));


        //6.-Realiza 4 copias del array en un nuevo array de 4 posiciones.
        System.out.println("--Apartado 6");
            //Utilizando Arrays.clone
        int [] c = a.clone();
        System.out.println("Utilizando Arrays.clone " + Arrays.toString(c));
            //Utilizando Arrays.copyOf
        int [] d = Arrays.copyOf(a, a.length);
        System.out.println("Utilizando Arrays.copyOf " + Arrays.toString(d));
            //Utilizando Arrays.copyOfRange
        int [] e = Arrays.copyOfRange(a, 0, a.length);
        System.out.println("Utilizando Arrays.copyOfRange " + Arrays.toString(e));
            //Utilizando System.arraycopy
        int [] f = new int[a.length];
        System.arraycopy(a, 0, f, 0, f.length);
        System.out.println("Utilizando System.arraycopy " + Arrays.toString(f));

        //TODO array de 4 posiciones

    }




    //Array aleatorio ejercicio 1
    public static int [] arrayRandom(int[]a){
        Random aleatorio1 = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = aleatorio1.nextInt(100);
        }
        return a;
    }

    //Imprime ultima posicion del array
    public static void arraUltimo (int[]a){
        System.out.print("[");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i < a.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
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
        return - 1;
    }
}