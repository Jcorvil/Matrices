package Practica4.Ej4DNI;

//Implementa un programa que reciba un DNI y responda si se trata de un DNI válido. El cálculo de la letra
// correspondiente a los dígitos se realiza mediante el algoritmo descrito en
// https://www.interior.gob.es/opencms/ca/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/

public class Main {
    public static void main(String[] args) {
        System.out.println(calculoDNI(20067600, 'P'));
    }

    public static String calculoDNI(Integer numerosDNI, char letraDNI){
        int resto;
        char[] caracteres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                'V', 'H', 'L', 'C', 'K', 'E'};
        resto = numerosDNI % 23;
        if (letraDNI == caracteres[resto]){
            System.out.println("El DNI es válido.");
        }else {
            System.out.println("El DNI no es válido.");
        }
        return "";
    }
}