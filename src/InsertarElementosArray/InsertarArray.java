package InsertarElementosArray;

import java.util.Arrays;

public class InsertarArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(annadirAlArray()));

    }

    public static int[] annadirAlArray(){
        int[] in = {7, 1, 5, 2};
        int[] out = Arrays.copyOf(in, in.length + 1);
        int pos = 2;
        int e = 8;

        System.out.println("Antes de añadir el elemento: ");
        System.out.println(Arrays.toString(out));

        for (int i = out.length - 1; i > pos; i--) {
            out[i] = out[i - 1];
        }
        out[pos] = e;

        System.out.println("Tras añadir el elemento: ");

        return out;
    }



    static int[] inserta(int[] in, int e, int pos) {

        pos = 2;
        e = 8;

        System.out.println(Arrays.toString(in));

        int[] out = new int[in.length + 1];
        for (int i = in.length - 1; i > pos; i--) {
            in[i] = in[i - 1];
        }
        in[pos] = e;
        System.out.println(Arrays.toString(in));

        return out;
    }


}