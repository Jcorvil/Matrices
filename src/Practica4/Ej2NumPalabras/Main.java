package Practica4.Ej2NumPalabras;

public class Main {

    /*2.-Escribe un programa que sea capaz de contar el número de palabras diferentes que hay en un texto que
     se le pasa por argumento, sin tener en cuenta si están escritas en mayúsculas o minúsculas.*/

    public static void main(String[] args) {
        String texto = "Hola que tal me llamo Jorge";
        System.out.println("La cadena " + "'" + texto + "'" + " tiene " + contadorPalabras(texto) + " palabras");
    }

    public static int contadorPalabras(String texto){
        int contador = 0;
        String [] separador = texto.split(" ");

        for (int i = 0; i < separador.length; i++) {
            contador++;
        }

        return contador;
    }
}