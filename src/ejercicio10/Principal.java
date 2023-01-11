//Ejercicio 10: Crear un programa para simular un equipo de futbol(futbolista, entrenador y doctor)
//para la cual tendremos lo siguiente
//* Una superclase Persona, que tendrá los siguientes datos: nombre, apellido, edad
//* La sub clase Futbolista tendrá los siguientes datos: dorsal y posición
//* La sub clase Entrenador tendrá de dato la estrategia que utiliza.
//* La sub clase Doctor, la titulación y los años de experiencia

//Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento, partido de futbol,
//planificar entrenamiento, entrevista, curar lesión.
package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //para almacenar todos mis objetos de tipo Persona
    static ArrayList<Persona> persona = new ArrayList<Persona>();//Arreglo dinamico
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        IngresarTipoPersona();
    }

    public static void menu(){
        int opcion;

        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar Entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar Lesión");
            System.out.println("7. Salir");
            System.out.println("\nIngresar opción : ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case  4:
                    break;
                case 5:
                    break;
                case  6:
                    break;
                case    7:
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        }while(opcion == 7);
    }

    public static void IngresarTipoPersona() {
        int tipo = 0;
        char tipoDatosPersonas;
        do {
            do {
                System.out.print("\nIngresar el tipo de Persona");
                System.out.print("\nJugador = [1]" +
                        "\nEntrenador = [2]" +
                        "\nMédico = [3]");
                System.out.print("\nIngresar Tipo de Persona : ");
                tipo = entrada.nextInt();

                switch (tipo) {
                    case 1:
                        llenarFutbolista();
                        break;
                    case 2:
                        llenarEntrenador();
                        break;
                    case 3:
                        llenarMedico();
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }


            } while (tipo <= 0 || tipo > 3);

            //Solicitar de nuevo si desea seguir ingresando datos
            System.out.println("\nDesea seguir ingresando datos de Personas s/n");
            tipoDatosPersonas = entrada.next().charAt(0);
        } while (tipoDatosPersonas == 's' || tipoDatosPersonas == 'S');

    }

    //métodos
    public static void llenarFutbolista() {
        int edad, dorsal;
        String nombre, apellidos, posicion;

        System.out.println("\nIngresar datos del Jugador");
        entrada.nextLine();//limpiar memoria
        System.out.print("Ingresar nombre del Jugador : ");
        nombre = entrada.nextLine();
        System.out.print("Ingresar apellidos del Jugador : ");
        apellidos = entrada.nextLine();
        System.out.print("Ingresar la edad del Jugador : ");
        edad = entrada.nextInt();
        System.out.print("Ingresar dorsal del Jugador : ");
        dorsal = entrada.nextInt();
        entrada.nextLine();//limpiar memoria
        System.out.print("Ingresar posición : ");
        posicion = entrada.nextLine();


        System.out.println("");
        //aplicando polimorfismo de objeto de clase padre instanciando con objeto de clase hijo
        Persona jugador = new Futbolista(nombre, apellidos, edad, dorsal, posicion);

        //agregar el objeto de tipo persona con instanciaciónd de su clase hijo al ArrayList
        persona.add(jugador);
    }

    public static void llenarEntrenador() {
        int edad;
        String nombre, apellidos, estrategia;

        System.out.println("\nIngresar datos del Entrenador");
        entrada.nextLine();//limpiar memoria

        System.out.print("Ingresar nombre del Entrenador : ");
        nombre = entrada.nextLine();
        System.out.print("Ingresar apellidos del Entrenador : ");
        apellidos = entrada.nextLine();
        System.out.print("Ingresar la edad del Entrenador : ");
        edad = entrada.nextInt();
        entrada.nextLine();//limpiar memoria
        System.out.print("Ingresar estrategia del Entrenador : ");
        estrategia = entrada.nextLine();


        //aplicando polimorfismo de objeto de clase padre instanciando con objeto de clase hijo
        Persona entrenador = new Entrenador(nombre, apellidos, edad, estrategia);

        //agregar el objeto de tipo persona con instanciaciónd de su clase hijo al ArrayList
        persona.add(entrenador);
    }

    public static void llenarMedico() {
        int edad, aniosExperiencia;
        String nombre, apellidos, titulacion;

        System.out.println("\nIngresar datos del Médico");
        entrada.nextLine();//limpiar memoria

        System.out.print("\nIngresar nombre del Médico : ");
        nombre = entrada.nextLine();
        System.out.print("Ingresar apellidos del Médico : ");
        apellidos = entrada.nextLine();
        System.out.print("Ingresar la edad del Médico : ");
        edad = entrada.nextInt();
        entrada.nextLine();//limpiar memoria
        System.out.print("Ingresar titulacion del Médico : ");
        titulacion = entrada.nextLine();
        System.out.print("Ingresar años de Experiencia : ");
        aniosExperiencia = entrada.nextInt();


        //aplicando polimorfismo de objeto de clase padre instanciando con objeto de clase hijo
        Persona medico = new Medico(nombre, apellidos, edad, titulacion, aniosExperiencia);

        //agregar el objeto de tipo persona con instanciaciónd de su clase hijo al ArrayList
        persona.add(medico);
    }


}
