package Practica4.Ej6Empresa;

public class Empleado {
    String codigoEmpleado;
    String DNI;
    String nombre;
    String primerApellido;
    String segundoApellido;
    Integer annoNacimiento;
    Boolean reduccionJornada;

    Empleado(){}

    Empleado(String codigoEmpleado, String DNI, String nombre, String primerApellido, String segundoApellido,
             Integer annoNacimiento, Boolean reduccionJornada){
        this.codigoEmpleado = codigoEmpleado;
        this.DNI = DNI;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.annoNacimiento = annoNacimiento;
        this.reduccionJornada = reduccionJornada;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "Codigo del empleado=' " + codigoEmpleado + '\'' +
                ", DNI=' " + DNI + '\'' +
                ", nombre=' " + nombre + '\'' +
                ", Primer Apellido=' " + primerApellido + '\'' +
                ", Segundo Apellido=' " + segundoApellido + '\'' +
                ", Año de Nacimiento= " + annoNacimiento +
                ", Reducción de jornada= " + reduccionJornada +
                '}';
    }
}