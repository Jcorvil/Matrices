package Practica4.Ej3Random;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
            //Construye un programa que genere 100 números aleatorios mediante el uso de la función Math.random y que
        //posteriormente ofrezca al usuario la posibilidad de:
        int [] a = new int [100];
        numerosRandom(a, 500, 1);
        System.out.println("El array completo es: " + Arrays.toString(a));
        //Conocer el mayor de los números.
        System.out.println("El numero mayor del array es: " + numeroMayor(a));
        //Conocer el menor de los números.
        System.out.println("El numero menor del array es: " + numeroMenor(a));
        //Obtener la suma de todos los números.
        System.out.println("La suma de todos los numeros es: " + sumaArray(a));
        //Obtener la media de los números.
        System.out.println("La media de todos los numeros es: " + mediaArray(a));
        //Sustituir el valor de un elemento por otro número dado.
        System.out.println("El array con el nuevo elemento es: " + Arrays.toString(sustituirElemento(a, 3, 2222)));
    }

    public static int[] numerosRandom(int[] a, int max, int min){
        for (int i = 0; i < a.length; i++) {
            int random = (int) ((Math.random() * (max - min)) + min);
            a[i] = random;
        }
        return a;
    }

    public static int numeroMayor (int[] a){
        int numMayor = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > numMayor){
                numMayor = a[i];
            }
        }
        return numMayor;
    }

    public static int numeroMenor (int[] a){
        int numMenor = 0;
        for (int i = 0; i > a.length; i--) {
            if (a[i] < numMenor){
                numMenor = a[i];
            }
        }
        return numMenor;
    }

    public static int sumaArray (int[] a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }

        return suma;
    }

    public static int mediaArray (int[] a){
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        return suma / a.length;
    }

    public static int[] sustituirElemento (int[] a, int pos, int elemento){
        int[] d = a.clone();
        for (int i = 0; i < d.length; i++) {
            if(d[i] == d[pos - 1]){
                d[i] = elemento;
            }
        }

        return d;
    }

}