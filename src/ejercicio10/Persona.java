package ejercicio10;

public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;

    //constructor
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void viajar() {
        System.out.println("viajar");
    }


    //método abstracto definidos
    public abstract void partidoFutbol();

    //método abstracto
    public abstract void entrenamiento();
}
