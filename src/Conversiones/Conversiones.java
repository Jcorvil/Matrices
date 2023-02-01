package Conversiones;

public class Conversiones {
    public static void main(String[] args) {
        //.parseInt convierte una cadena en un entero. "1" es una cadena, pero al estar dentro de un .parseInt
        //se va a tratar como un entero. De esta forma, imprime 2, si fuera una cadena imprimiría 11.
        int n = Integer.parseInt("1");
        System.out.println(n+1);
        //.parseBoolean es igual, pero para booleanos. "true" y "1" con dos cadenas que se convierten en un true
        //que el booleano puede entender. Pasa lo mismo con "false" y "0".
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);

        long l = Long.parseLong("500000");
        System.out.println(l - 25000);

        double d = Double.parseDouble("1.65");
        System.out.println(d + 1.00);

        Integer integer = Integer.valueOf("1");
        Double doble = Double.valueOf("1.123456789");
        System.out.println(integer + doble);

        //Para hacer lo contrario, convertir un numero a una cadena:
        String s = 1 + "";
        s = String.valueOf(1);
        integer.toString();
        System.out.println(s);



        int num1 = 1;
        //TODO: numero entero envoltorio de nombre "num2" y valor 2.
        Integer num2 = 2;

        //TODO: imprimir valor de cadena de num1.
        System.out.println(num1 + "");
        System.out.println(String.valueOf(num1));

        //TODO: Imprimir valor tipo cadena de num2. Todos hacen lo mismo.
        System.out.println(num2 + "");
        System.out.println(String.valueOf(num2));
        System.out.println(Integer.toString(num2));
        System.out.println(num2);
        System.out.println(num2.toString());


    }
}