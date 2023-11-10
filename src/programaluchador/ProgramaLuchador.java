/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaluchador;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ProgramaLuchador {

    private static String opcionCuidad;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar la ciudad para la pelea
        System.out.println("Elige la ciudad para la pelea (1-4):");
        System.out.println("1. Las Vegas");
        System.out.println("2. Nueva York");
        System.out.println("3. Los Angeles");
        System.out.println("4. Chicago");
        int opcionCiudad = scanner.nextInt();
        System.out.println(opcionCuidad + "OPCION ELEGIDO");
        

        String ciudadElegida;
        switch (opcionCiudad) {
            case 1:
                ciudadElegida = "Las Vegas";
                break;
            case 2:
                ciudadElegida = "Nueva York";
                break;
            case 3:
                ciudadElegida = "Los Angeles";
                break;
            case 4:
                ciudadElegida = "Chicago";
                break;
            default:
                System.out.println("Opción inválida. Seleccionando Las Vegas por defecto.");
                ciudadElegida = "Las Vegas";
                
        }

        // Preguntar el clima para la pelea
        System.out.println("Elige el clima para la pelea:");
        System.out.println("1. Soleado");
        System.out.println("2. Lluvia");
        System.out.println("3. Nieve");
        int opcionClima = scanner.nextInt();

        String climaElegido;
        switch (opcionClima) {
            case 1:
                climaElegido = "Soleado";
                break;
            case 2:
                climaElegido = "Lluvia";
                break;
            case 3:
                climaElegido = "Nieve";
                break;
            default:
                System.out.println("Opcion invalida. Seleccionando Soleado por defecto.");
                climaElegido = "Soleado";
        }

        // Preguntar el numero de rondas para la pelea
        System.out.println("Ingrese el numero de rondas para la pelea:");
        int rondas = scanner.nextInt();

        // Preguntar si se desean habilidades
        System.out.println("Deseas luchar con habilidades:");
        System.out.println("1. SI");
        System.out.println("2. NO");
        int opcionHabilidad = scanner.nextInt();

        String habilidadElegido;
        switch (opcionHabilidad) {
            case 1:
                habilidadElegido = "SI";
                break;
            case 2:
                habilidadElegido = "NO";
                break;
            default:
                System.out.println("Opcion invalida. Seleccionando NO por defecto.");
                habilidadElegido = "NO";
        }
        

        // Creamos el objeto Luchador con la información proporcionada
        Luchador luchador = new Luchador(ciudadElegida, climaElegido, rondas, habilidadElegido);

        // Mostramos la información del luchador
        System.out.println("............Informacion de la lucha:..............");
        luchador.mostrarInformacion();

        // Cerramos el scanner
        scanner.close();
    }
}