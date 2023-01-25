package AccionesArray;

public class Persona {
    String nombre;
    int edad;

    Persona(String nombre){
        this.nombre = nombre;
    }
    Persona(){}

    @Override
    public String toString() {
        return nombre;
    }

}