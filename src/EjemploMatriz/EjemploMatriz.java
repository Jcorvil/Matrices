package EjemploMatriz;

import java.util.Arrays;

public class EjemploMatriz {
    public static void main(String[] args) {
        String[][] matrizDeLetras = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};

        for (int i = 0; i < matrizDeLetras.length; i++) {
            System.out.println(Arrays.toString(matrizDeLetras[i]));
        }

        for (int i = 0; i < matrizDeLetras.length; i++) {
            for (int j = 0; j < matrizDeLetras[i].length; j++) {
                System.out.print(matrizDeLetras[i][j]);
                System.out.print(" ");
            }
        }

        int i = 0;
        while(i < matrizDeLetras.length){
            System.out.println(Arrays.toString(matrizDeLetras[i]));
            i++;
        }

        int j = 0;
        int n = 0;
        while (n < matrizDeLetras.length) {
            while (j < matrizDeLetras[n].length) {
                System.out.println(matrizDeLetras[n][j]);
                j++;
            }
            n++;
        }

    }

}