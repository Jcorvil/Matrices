package InsertarArray;

import java.util.Arrays;

public class InsertarArray {
    public static void main(String[] args) {
        int[] in = {7, 1, 5, 2};
        int e = 8;

        public static int[] inserta (int[] in, int e, int pos){

            //Manualmente
            int[] out = new int [in.length + 1];
            for (int i = 0; i <= in.length; i++) {
                out[i] = in[i];
            }
            out[pos] = e;
            out[pos+1] = in[];



            System.out.println(Arrays.toString(in));
            System.out.println(Arrays.toString(out));

            //Por método predefinido
            out = Arrays.copyOf(in, in.length + 1);
            out[3] = e;

            System.out.println(Arrays.toString(in));
            System.out.println(Arrays.toString(out));

        }

    }
}