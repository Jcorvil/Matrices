package ArrayStrings.EjemploStrings;

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

    }


}