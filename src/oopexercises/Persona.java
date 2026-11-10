package oopexercises;

/**
 * Ejercicio 4 (parte 2): clase Persona que tiene un Monedero y puede
 * pasar monedas de su monedero al monedero de otra persona.
 *
 * Fíjate: un atributo puede ser OTRO OBJETO (aquí, un Monedero).
 *
 * @author Hugo
 */
public class Persona {

    private String nombre;
    private Monedero monedero;

    public Persona(String nombre, int monedasIniciales) {
        this.nombre = nombre;
        this.monedero = new Monedero(monedasIniciales);
    }

    /** Pasa "cantidad" monedas de esta persona a "otra". */
    public void pasarMonedas(Persona otra, int cantidad) {
        if (monedero.sacar(cantidad)) {
            otra.monedero.meter(cantidad);
            System.out.println(nombre + " pasa " + cantidad + " monedas a " + otra.nombre);
        } else {
            System.out.println(nombre + " no tiene suficientes monedas.");
        }
    }

    public String getNombre()  { return nombre; }
    public int getMonedas()    { return monedero.getMonedas(); }
}
