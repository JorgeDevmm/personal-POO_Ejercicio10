package ejercicio10;

public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String nombre, String apellidos, int edad, String estrategia) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    //getters
    public String getEstrategia() {
        return estrategia;
    }

    //métodos sobreescritos e implementando de la clase abstracta
    @Override
    public void partidoFutbol() {
        System.out.println("dirigiendo el partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("dirigiendo entrenamiento");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar Entrenamiento");
    }
}
