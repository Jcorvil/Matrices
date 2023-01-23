package AccionesArray;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        //"Arrays.equals" compara el contenido de dos arrays. "==" compara la referencia en memoria.
        int[] a = {10, 3, 12, 13, 5, 8, 7};
        int[] b = {10, 3, 12, 13, 5, 8, 7};
        //"==" da 'false', ya que las posiciones de memoria siempre son distintas.
        System.out.println(a == b);
        //"Arrays.equals" da 'true', ya que el contenido de los arrays es el mismo.
        System.out.println(Arrays.equals(a, b));
        //Hace que "b" sea igual a "a" en todos los aspectos, incluso en la posición de memoria.
        //Lo que haya en "a" se ignora, porque utiliza los datos de "b".
        b = a;
        //Cambia los valores de la posición 0 en ambos arrays, haciendo que .equals sea false.
        b[0] = 0;
        a[0] = 1;
        //^^ para que ambos surtan efecto, se deberían poner sobre los "sout".
    }
}