package EjercicioArrayMultiplicacion;

public class ArrayMultiplicacion {
    public static void main(String[] args) {
        int[][] tabla = new int[10][3];
        for (int i = 0; i < tabla.length; i++){
            tabla [i][0] = i ++;
            System.out.println(tabla[i]);
        }
    }

}