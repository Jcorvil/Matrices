package AccionesArray;

import java.util.Arrays;

public class ArrayClone {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        //"Array.clone" nos permite clonar un array a otro del mismo tipo. Se dice que array clonar->x.clone()
        int [] b = a.clone();
        System.out.print(Arrays.toString(a));
        System.out.println(a);
        System.out.print(Arrays.toString(b));
        System.out.println(b);



        Persona p1 = new Persona("Persona 1");
        Persona p2 = new Persona("Persona 2");
        Persona p3 = new Persona("Persona 3");

        //Crear un array de 3 personas distintas e imprimirlo usando la clase Arrays.
        Persona [] personasA = {p1, p2, p3};
        Persona [] personasB = personasA.clone();

        System.out.println(Arrays.toString(personasA));
        System.out.println(Arrays.toString(personasB));

        /*
        for (Persona c: personasA){
            System.out.println(c.nombre);
        }

        for (int i = 0; i < personasA.length; i++) {
            System.out.println(personasA[i].nombre);
            System.out.println(personasA[i].edad);
        }
         */

        //Sobrecargar el método toString en la clase Persona para que al imprimir una persona imprima el nombre y su edad.
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}