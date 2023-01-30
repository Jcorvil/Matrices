package EjemploStrings;

public class EjemploStrings {
    public static void main(String[] args) {
        char[] chars = {'c', 'a'};
        String c = new String(chars);


        String s = "Hola";
        String s1 = new String("Hola");
        String s2 = new String (new char[]{'H', 'o', 'l', 'a'});
        String s3 = s + " Jorge";

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        imprimeLongitudCadena("Hola que tal");
        caracterEnLaPosicion("Hola que tal", 3);



        //posicionCaracterCadena("Hola que tal", 'a');


    }

    //Imprime la longitud de la cadena.
    //Al contrario que con enteros, para imprimir la longitud de una cadena se usa .length() --con los paréntesis.
    public static void imprimeLongitudCadena(String s){
        System.out.println("La cadena mide " + s.length() + " caracteres.");
    }


    //Dada una cadena y una posición, decir qué caracter se encuentra en esa posición
    public static void caracterEnLaPosicion(String cadena, int posicion){
        System.out.println("El caracter número " + (posicion + 1) + " de la cadena " + "'" + cadena + "'" + " es el caracter: " + cadena.charAt(posicion));
    }


    //Dada una cadena, contar cuantas veces aparece un caracter. "Hola que tal", a -> 2



    //Imprime, por orden alfabético, las cadenas dadas por un array de cadenas, sin tener en cuenta mayúsculas y minúsculas



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