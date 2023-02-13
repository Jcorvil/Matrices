package Practica4.Ej5TextoPalabra;

//Escribe el código de un programa que dado el contenido de un texto y una determinada palabra, realice búsquedas
    // de la palabra dentro de él. La secuencia de ejecución será: crear un texto, crear una palabra, invocar al método
    // con estos parámetros, buscar número de ocurrencias de la palabra en texto, obtener la salida del método y
    // mostrar por pantalla el número de apariciones de la palabra.
public class TextoPalabra {
    public static void main(String[] args) {
        //crear un texto
        String texto = "No comas ajos ni cebollas, porque no saquen por el olor tu villanería. Anda despacio; habla con resposo; pero no de manera que parezca que te escuchas a ti mismo; que toda afectación es mala. Come poco y cena más poco; que la salud de todo el cuerpo se fragua en la oficina del estómago. Sé templado en el beber, considerando que el vino demasiado ni guarda secreto, ni cumple palabra. Ten cuenta, Sancho, de no mascar a dos carrillos, ni de erutar delante de nadie";
        //crear una palabra
        String palabra  = "poco";

        //invocar al método con estos parámetros
        System.out.println("En el texto introducido, la palabra " + "'" + palabra + "'" + " aparece " +
                ocurrenciasPalabraenTexto(texto, palabra) + " veces.");
    }

    public static int ocurrenciasPalabraenTexto(String texto, String palabra){
        int ocurrencias = 0;
        String[] textoSeparado = texto.split(" |,|;");
        for (int i = 0; i < textoSeparado.length; i++) {
            if (textoSeparado[i].equalsIgnoreCase(palabra)){
                ocurrencias++;
            }
        }

        return ocurrencias;
    }
}