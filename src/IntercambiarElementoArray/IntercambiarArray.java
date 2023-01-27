package IntercambiarElementoArray;

import java.util.Arrays;

public class IntercambiarArray {
    public static void main(String[] args) {
        int[] in = {7,-2,5,0,6};
        System.out.println("Array antes del cambio: ");
        System.out.println(Arrays.toString(in));

        System.out.println("Array tras del cambio: ");
        System.out.println(Arrays.toString(cambioArray(in)));

    }

    public static int[] cambioArray(int[] in){
        int[] out = in.clone();
        out[0] = out[out.length - 1];

        for (int i = 0; i < out.length - 1; i++) {
            out[i + 1] = in[i];
        }
        return out;
    }
}