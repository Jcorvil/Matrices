package ArrayStrings.EjercicioArrayStrings;

import java.util.Arrays;

public class EjercicioArrayStrings {
    private static String[] arrayCadena;

    public static void main(String[] args) {

        imprimeLongitudCadena("Hola que tal");
        caracterEnLaPosicion("Hola que tal", 3);
        System.out.println("El caracter aparece " + cuentaOcurrenciasDeUnCaracter("Hola que tal", 'a') + " veces");
        imprimeCadenasEnOrdenAlfabetico(new String[]{"Hola", "Jorge", "Adios"});
        System.out.println(Arrays.toString(cadenaCodificada("En un lugar. de la Mancha,. de cuyo nombre no. me quiero acordar")));
        int[] numbers = {2, 1, 11, 10};
        System.out.println(Arrays.toString(convertiraStringOrdenar(numbers)));


        //posicionCaracterCadena("Hola que tal", 'a');
    }

    //Imprime la longitud de la cadena.
    //Al contrario que con enteros, para imprimir la longitud de una cadena se usa .length() --con los paréntesis.
    public static void imprimeLongitudCadena(String cadena) {
        System.out.println("La cadena " + "'" + cadena + "'" + " mide " + cadena.length() + " caracteres.");
    }


    //Dada una cadena y una posición, decir qué caracter se encuentra en esa posición
    public static void caracterEnLaPosicion(String cadena, int posicion) {
        System.out.println("El caracter número " + (posicion) + " de la cadena " + "'" + cadena + "'" + " es el caracter: " + cadena.charAt(posicion - 1));
    }


    //Dada una cadena, contar cuantas veces aparece un caracter. "Hola que tal", a -> 2
    public static int cuentaOcurrenciasDeUnCaracter(String cadena, char caracter) {
        int ocurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                ocurrencias = ocurrencias + 1;
            }
        }
        return ocurrencias;

        /*
        if (ocurrencias == 1){
            System.out.println("El caracter " + "'" + caracter + "'" + " en la cadena " + "'" + cadena + "'" + " aparece " + ocurrencias + " vez.");
        }
        if (ocurrencias >= 2 || ocurrencias == 0){
            System.out.println("El caracter " + "'" + caracter + "'" + " en la cadena " + "'" + cadena + "'" + " aparece " + ocurrencias + " veces.");
        }
        */
    }


    //Imprime, por orden alfabético, las cadenas dadas por un array de cadenas, sin tener en cuenta mayúsculas y minúsculas
    public static void imprimeCadenasEnOrdenAlfabetico(String[] cadenaArray) {
        Arrays.sort(cadenaArray);
        for (int i = 0; i < cadenaArray.length; i++) {
            System.out.println(cadenaArray[i] + " ");
        }
    }


    //Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que:
    // - todas las vocales se sustituyan por un número: o --> 0, i --> 1, a --> 4, e --> 3, salvo la u que se cambia por v.
    // - cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array.
    // - la frase que se mete en cada posición del array tiene que estar sin espacios al principio ni al final.
    public static String [] cadenaCodificada(String cadena) {

        System.out.println("Antes de la codificación:");
        System.out.println(cadena);
        System.out.println("Tras la codificación:");

        String cadenaVocales = cadena.replaceAll("[aA]", "4")
                .replaceAll("[eE]", "3")
                .replaceAll("[iI]", "1")
                .replaceAll("[oO]", "0")
                .replaceAll("[uU]", "V");

        String[] arrayCadena = cadenaVocales.split("\\.");

        for (int i = 0; i < arrayCadena.length; i++) {
            arrayCadena[i] = arrayCadena[i].trim();
        }

        return arrayCadena;
    }


    //Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor
    public static String[] convertiraStringOrdenar(int[] numbers) {
        String[] numbersString = new String[numbers.length];

        //Este 'for' va a realizar una conversión de 'int' a 'string'.
        //Cada iteración va a recorrer el array introducido. Cuando el valor de 'i' es igual al valor de la posición del array
        //va a realizar el 'String.valueOf' y lo va a convertir en una cadena.
        for (int i = 0; i < numbers.length; i++) {
            numbersString[i] = String.valueOf(numbers[i]);
        }

        //Va a ordenar las cadenas del array anterior por orden alfabético.
        //Va a imprimir [1, 10, 11, 2], porque primero ordena todas las cadenas que empiecen por 1, sin importar la longitud,
        //luego todas las cadenas que empiecen por 2, etc.
        Arrays.sort(numbersString);

        return numbersString;
    }


    //
    public static void posicionCaracterCadena(String cadena, char caracterABuscar) {
        System.out.println("En la cadena " + cadena + ", el primer caracter " + " ' " + caracterABuscar + " ' " + " está en la posición " + (cadena.indexOf(caracterABuscar) + 1));
    }
}