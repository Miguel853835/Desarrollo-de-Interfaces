package baraja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta es la clase principal del programa que simula el uso de barajas de cartas.
 * Permite al usuario elegir entre una baraja de 40 cartas o una de 48 cartas
 * y realizar diversas operaciones con ellas.
 *
 * @author DAM219
 * @version 1.0
 * @since 11/12/2023
 */
public class PrimerProyectoEjercicio1DAM219 {
    /**
    * Método principal que inicia la ejecución del programa.
    *
    * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
    */
    public static void main(String[] args) {
        
        int opcion;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                /**
                 * Sección de presentación de opciones
                 */
                System.out.print("Elija una opción (1/2): ");
                System.out.print("\n1. Baraja de 40 cartas");
                System.out.println("\n2. Baraja de 48 cartas");
                opcion = scanner.nextInt();
            } while (opcion != 2 && opcion!=1);
        }
        
        /**
         * Sección de operaciones para la Baraja de 40 cartas
        */
        if(opcion == 1){
            Baraja40DAM219 baraja40 = new Baraja40DAM219();
            System.out.println("Cartas disponibles: " + baraja40.cartasDisponibles());

            Carta40DAM219 carta1 = baraja40.siguienteCarta();
            System.out.println("Carta sacada: " + carta1);

            ArrayList<Carta40DAM219> cartasSacadas = baraja40.darCartas(5);
            System.out.println("Saco 5 cartas: " + cartasSacadas);

            System.out.println("Cartas disponibles: " + baraja40.cartasDisponibles());

            baraja40.barajar();

            cartasSacadas = baraja40.darCartas(5);
            System.out.println("Saco 5 cartas después de barajar: " + cartasSacadas);

            baraja40.cartasMonton(cartasSacadas);
        }
        
        /**
         * Sección de operaciones para la Baraja de 48 cartas
         */
        if(opcion == 2){
            Baraja48DAM219 baraja48 = new Baraja48DAM219();
            System.out.println("Cartas disponibles: " + baraja48.cartasDisponibles());

            Carta48DAM219 carta1 = baraja48.siguienteCarta();
            System.out.println("Carta sacada: " + carta1);

            ArrayList<Carta48DAM219> cartasSacadas = baraja48.darCartas(5);
            System.out.println("Saco 5 cartas: " + cartasSacadas);
            System.out.println("Cartas disponibles: " + baraja48.cartasDisponibles());

            baraja48.barajar();

            cartasSacadas = baraja48.darCartas(5);
            System.out.println("Saco 5 cartas después de barajar: " + cartasSacadas);

            baraja48.cartasMonton(cartasSacadas);
        }
    }
}
