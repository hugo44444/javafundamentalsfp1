package oopexercises;

/**
 * Ejercicio 4: Persona que tiene un monedero y puede pasar
 * monedas a otra persona.
 *
 * @author Hugo
 */
public class Persona {

    private String nombre;
    private Monedero monedero;

    public Persona(String nombre, int monedas) {
        this.nombre = nombre;
        monedero = new Monedero(monedas);
    }

    public void recibirMonedas(int cantidad) {
        monedero.meter(cantidad);
    }

    public void pasarMonedas(Persona otra, int cantidad) {
        if (cantidad <= monedero.getMonedas()) {
            monedero.sacar(cantidad);
            otra.recibirMonedas(cantidad);
            System.out.println(nombre + " pasa " + cantidad + " monedas a " + otra.getNombre());
        } else {
            System.out.println(nombre + " no tiene suficientes monedas");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getMonedas() {
        return monedero.getMonedas();
    }
}
