package Practica4.Ej6Empresa;
    //Supón que tu empresa se va a hacer cargo del desarrollo de un programa para el registro de datos de los
    // trabajadores de una compañía. Esta tiene varias sedes que están identificadas por el nombre de la ciudad en
    // la que residen (hasta el momento Madrid, Barcelona, Valencia y Oviedo). En cada sede hay varios departamentos,
    // algunos de los cuales están repetidos entre varias sedes, a los que pertenecen los diferentes empleados.
    // Hasta el momento los departamentos existentes en todas las sedes son Ventas, RR. HH. y Producción.
    // De cada empleado es importante almacenar el código de empleado, DNI, nombre, primer apellido, segundo apellido,
    // año de nacimiento (numérico) y si tiene concedida, o no, reducción de jornada (booleano). Diseña la estructura
    // que almacenará los datos de la compañía y escribe el código fuente del programa que permita comenzar a registrar
    // la información de los empleados.

import java.util.Arrays;

public class Empresa {
    public static void main(String[] args) {



        Sede sede1 = new Sede("Madrid", "Ventas", "RR.HH.", "Producción");
        Sede sede2 = new Sede("Barcelona", "Ventas", "RR.HH.", "Producción");
        Sede sede3 = new Sede("Valencia", "Ventas", "RR.HH.", "Producción");
        Sede sede4 = new Sede("Oviedo", "Ventas", "RR.HH.", "Producción");

        Empleado empleado1 = new Empleado("ABC123456", "20067600P", "Jorge",
                "Coronil", "Villalba", 1997, false, "Ventas");

        Empleado empleado2 = new Empleado("GHA457894", "19984723A", "Maria",
                "Olmedo", "Vallés", 1981, false, "RR.HH.");

        Empleado empleado3 = new Empleado("YWX778412", "20012344X", "Manuel",
                "Flores", "Benitez", 1974, true, "Producción");


        Sede[] sedes = {sede1, sede2, sede3, sede4};
        Empleado[] empleados1 = {empleado1, empleado2, empleado3};


        System.out.println("Sedes: ");
        System.out.println(Arrays.toString(sedes));
        System.out.println("Empleados: ");
        System.out.println(Arrays.toString(empleados1));
    }
}