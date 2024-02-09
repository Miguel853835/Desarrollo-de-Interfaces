
package baraja;

/**
 * Clase que representa una carta de la baraja española de 48 cartas.
 * Cada carta tiene un número y un palo, y puede ser de los palos "ESPADAS",
 * "OROS", "COPAS" o "BASTOS".
 * El rango de números va de 1 a 12 para cada palo.
 * @author DAM219
 * @version 1.0
 * @since 11/12/2023
 */
public class Carta48DAM219 {
   /** Valor de la carta. */
    private final String valor;

    /** Palo de la carta. */
    private final String palo;

    /** Array de palos disponibles en la baraja española. */
    public static final String[] PALOS = {"ESPADAS", "OROS", "COPAS", "BASTOS"};

    /** Límite de valor para cartas de un palo específico. */
    public static final int LIMITE_CARTA_PALO = 10;

    /**
     * Constructor de la clase Carta40DAM219.
     *
     * @param valor Valor de la carta.
     * @param palo Palo de la carta.
     */
    public Carta48DAM219(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Devuelve la representación en cadena de la carta.
     *
     * @return Cadena que representa la carta.
     */
    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
