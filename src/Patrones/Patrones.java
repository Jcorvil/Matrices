package Patrones;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patrones {
    public static void main(String[] args) {

        //"Pattern.compile" va a buscar todos los patrones que concuerden con el filtro que se le da.
        //"^Pa.*" Le dice que busque cualquier patrón que empiece por "Pa". El punto significa "cualquier caracter" y
        //el '*' significa que se repita ese último caracter (por eso hace falta el '.'). Si fuera "Pa*" solo buscaría las
        //palabras como "Paaaaaa", porque la 'a' se encuentra antes del '*'.
        Pattern p = Pattern.compile("^Pa.*");
        Matcher m = p.matcher("Pata");
        System.out.println(m.matches());

        //Separa solo donde haya espacios en blanco, de ahí el " ".
        System.out.println(Arrays.toString("Hola me llamo Jorge que tal".split(" ")));
        //Separa todos los caracteres.
        System.out.println(Arrays.toString("Hola me llamo Jorge que tal".split("")));


    }
}