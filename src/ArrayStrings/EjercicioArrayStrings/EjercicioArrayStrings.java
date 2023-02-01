package ArrayStrings.EjercicioArrayStrings;

import java.util.Arrays;

public class EjercicioArrayStrings {
    public static void main(String[] args) {

        imprimeLongitudCadena("Hola que tal");
        caracterEnLaPosicion("Hola que tal", 3);
        cuentaOcurrenciasDeUnCaracter("Hola que tal", 'a');
        imprimeCadenasEnOrdenAlfabetico(new String[]{"Hola", "Jorge", "Adios"});
        cadenaCodificada("En un lugar de la Mancha, de cuyo nombre no me quiero acordar...");



        //posicionCaracterCadena("Hola que tal", 'a');


    }

    //Imprime la longitud de la cadena.
    //Al contrario que con enteros, para imprimir la longitud de una cadena se usa .length() --con los paréntesis.
    public static void imprimeLongitudCadena(String cadena){
        System.out.println("La cadena " + "'" +  cadena + "'" + " mide " + cadena.length() + " caracteres.");
    }


    //Dada una cadena y una posición, decir qué caracter se encuentra en esa posición
    public static void caracterEnLaPosicion(String cadena, int posicion){
        System.out.println("El caracter número " + (posicion) + " de la cadena " + "'" + cadena + "'" + " es el caracter: " + cadena.charAt(posicion - 1));
    }


    //Dada una cadena, contar cuantas veces aparece un caracter. "Hola que tal", a -> 2
    public static void cuentaOcurrenciasDeUnCaracter (String cadena, char caracter){
        int ocurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                ocurrencias = ocurrencias + 1;
            }
        }
        if (ocurrencias == 1){
            System.out.println("El caracter " + "'" + caracter + "'" + " en la cadena " + "'" + cadena + "'" + " aparece " + ocurrencias + " vez.");
        }
        if (ocurrencias >= 2 || ocurrencias == 0){
            System.out.println("El caracter " + "'" + caracter + "'" + " en la cadena " + "'" + cadena + "'" + " aparece " + ocurrencias + " veces.");
        }
    }


    //Imprime, por orden alfabético, las cadenas dadas por un array de cadenas, sin tener en cuenta mayúsculas y minúsculas
    public static void imprimeCadenasEnOrdenAlfabetico (String [] cadenaArray){
        Arrays.sort(cadenaArray);
        for (int i = 0; i < cadenaArray.length; i++) {
            System.out.println(cadenaArray[i] + " ");
        }
    }


    //Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que:
    // - todas las vocales se sustituyan por un número: o --> 0, i --> 1, a --> 4, e --> 3, salvo la u que se cambia por v.
    // - cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array.
    // - la frase que se mete en cada posición del array tiene que estar sin espacios al principio ni al final.
    public static void cadenaCodificada (String cadena){

        char [] cadenaCaracteres = cadena.toCharArray();

        System.out.println("Antes de la codificación:");
        System.out.println(cadena);
        System.out.println("Tras la codificación:");


        for (int i = 0; i < cadenaCaracteres.length; i++) {
            if (cadenaCaracteres[i] == 'a'){
                cadenaCaracteres[i] = '4';

            }if (cadenaCaracteres[i] == 'e'){
                cadenaCaracteres[i] = '3';

            }if (cadenaCaracteres[i] == 'i'){
                cadenaCaracteres[i] = '1';

            }if (cadenaCaracteres[i] == 'o'){
                cadenaCaracteres[i] = '0';

            }if (cadenaCaracteres[i] == 'u'){
                cadenaCaracteres[i] = 'v';
            }
        }

        System.out.println(Arrays.toString(cadenaCaracteres));
    }




    //
    public static void posicionCaracterCadena(String cadena, char caracterABuscar){
        System.out.println("En la cadena " + cadena + ", el primer caracter " + " ' " + caracterABuscar + " ' " + " está en la posición " + (cadena.indexOf(caracterABuscar) + 1));
    }
}