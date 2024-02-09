package baraja;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que representa una baraja de cartas españolas de 40 cartas.
 * Permite realizar operaciones como barajar, repartir cartas, etc.
 *
 * @author DAM219
 * @version 1.0
 * @since 11/12/2023
 */
public class Baraja40DAM219 {
    private final ArrayList<Carta40DAM219> cartas;
    private int posSiguiCarta;

    /**
     * Palos de las cartas españolas.
     */
    public static final String[] PALOS = {"ESPADAS", "OROS", "COPAS", "BASTOS"};

    /**
     * Límite de cartas por palo.
     */
    public static final int LIMITE_CARTA_PALO = 10;

    /**
     * Número mínimo de cartas en la baraja.
     */
    public static final int NUM_CARTAS_MIN = 40;

    /**
     * Número máximo de cartas en la baraja.
     */
    public static final int NUM_CARTAS_MAX = 40;

    /**
     * Constructor de la clase. Crea, baraja y posiciona en la primera carta.
     */
    public Baraja40DAM219() {
        cartas = new ArrayList<>();
        crearBaraja();
        posSiguiCarta = 0;
    }

    private void crearBaraja() {
        for (String palo : PALOS) {
            for (int i = 1; i <= LIMITE_CARTA_PALO; i++) {
                String valor;
                if (i <= 7) {
                    valor = String.valueOf(i);
                } else {
                    switch (i) {
                        case 8:
                            valor = "SOTA";
                            break;
                        case 9:
                            valor = "CABALLO";
                            break;
                        case 10:
                            valor = "REY";
                            break;
                        default:
                            valor = "";
                    }
                }
                cartas.add(new Carta40DAM219(valor, palo));
            }
        }
    }

    /**
     * Baraja las cartas de la baraja y reinicia la posición a la primera carta.
     */
    public final void barajar() {
        Collections.shuffle(cartas);
        posSiguiCarta = 0;
    }

    /**
     * Obtiene la siguiente carta de la baraja.
     *
     * @return La siguiente carta.
     */
    public Carta40DAM219 siguienteCarta() {
        if (posSiguiCarta < cartas.size()) {
            return cartas.get(posSiguiCarta++);
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
    }

    /**
     * Obtiene la cantidad de cartas disponibles en la baraja.
     *
     * @return El número de cartas disponibles.
     */
    public int cartasDisponibles() {
        return NUM_CARTAS_MAX - posSiguiCarta;
    }

    /**
     * Obtiene un conjunto de cartas de la baraja.
     *
     * @param numCartas Número de cartas a obtener.
     * @return ArrayList de Carta40DAM219 con las cartas obtenidas.
     */
    public ArrayList<Carta40DAM219> darCartas(int numCartas) {
        if (cartasDisponibles() >= numCartas) {
            ArrayList<Carta40DAM219> cartasSacadas = new ArrayList<>();
            for (int i = 0; i < numCartas; i++) {
                cartasSacadas.add(siguienteCarta());
            }
            return cartasSacadas;
        } else {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }
    }

    /**
     * Muestra las cartas en el montón.
     *
     * @param cartasSacadas ArrayList de Carta40DAM219 con las cartas en el montón.
     */
    public void cartasMonton(ArrayList<Carta40DAM219> cartasSacadas) {
        if (cartasSacadas != null && !cartasSacadas.isEmpty()) {
            System.out.println("Cartas en el montón:");
            for (Carta40DAM219 carta : cartasSacadas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("Aún no se han sacado cartas.");
        }
    }

    /**
     * Muestra las cartas restantes en la baraja.
     */
    public void mostrarBaraja() {
        if (posSiguiCarta < NUM_CARTAS_MAX) {
            System.out.println("Cartas restantes en la baraja:");
            for (int i = posSiguiCarta; i < NUM_CARTAS_MAX; i++) {
                System.out.println(cartas.get(i));
            }
        } else {
            System.out.println("No quedan cartas en la baraja.");
        }
    }
}
