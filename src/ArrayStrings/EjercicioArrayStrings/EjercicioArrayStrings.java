package ArrayStrings.EjercicioArrayStrings;

public class EjercicioArrayStrings {
    public static void main(String[] args) {

        imprimeLongitudCadena("Hola que tal");
        caracterEnLaPosicion("Hola que tal", 3);
        cuentaOcurrenciasDeUnCaracter("Hola que tal", 'a');



        //posicionCaracterCadena("Hola que tal", 'a');


    }

    //Imprime la longitud de la cadena.
    //Al contrario que con enteros, para imprimir la longitud de una cadena se usa .length() --con los paréntesis.
    public static void imprimeLongitudCadena(String cadena){
        System.out.println("La cadena " + "'" +  cadena + "'" + " mide " + cadena.length() + " caracteres.");
    }


    //Dada una cadena y una posición, decir qué caracter se encuentra en esa posición
    public static void caracterEnLaPosicion(String cadena, int posicion){
        System.out.println("El caracter número " + (posicion + 1) + " de la cadena " + "'" + cadena + "'" + " es el caracter: " + cadena.charAt(posicion));
    }


    //Dada una cadena, contar cuantas veces aparece un caracter. "Hola que tal", a -> 2
    public static void cuentaOcurrenciasDeUnCaracter (String cadena, char caracter){
        int ocurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter){
                ocurrencias = ocurrencias + 1;
            }
        }
        if (ocurrencias == 0){
            System.out.println("El caracter " + "'" +  caracter + "'" + " no aparece en la cadena.");
        }
        if (ocurrencias == 1){
            System.out.println("El caracter " + "'" + caracter + "'" + " en la cadena " + "'" + cadena + "'" + " aparece " + ocurrencias + " vez.");
        }
        if (ocurrencias >= 2){
            System.out.println("El caracter " + "'" + caracter + "'" + " en la cadena " + "'" + cadena + "'" + " aparece " + ocurrencias + " veces.");
        }
    }


    //Imprime, por orden alfabético, las cadenas dadas por un array de cadenas, sin tener en cuenta mayúsculas y minúsculas
    public static void imprimeCadenasEnOrdenAlfabetico  (String cadena1, String cadena2, String cadena3, String cadena4){
        String [] arrayCadenas = {cadena1, cadena2, cadena3, cadena4};

    }


    //Dado un pequeño texto, separarlo por puntos (.). Las secciones entre cada punto se almacenarán en una posición de array distinta.
    //Ej.: "En un lugar.de la Mancha de.cuyo nombre no.quiero acordarme"
    //En un lugar -> posición [0]
    //de la Mancha de-> posición [1]
    //cuyo nombre no -> posición [2]
    //quiero acordarme -> posición [3]



    //
    public static void posicionCaracterCadena(String cadena, char caracterABuscar){
        System.out.println("En la cadena " + cadena + ", el primer caracter " + " ' " + caracterABuscar + " ' " + " está en la posición " + (cadena.indexOf(caracterABuscar) + 1));
    }
}