package basics.examen1;

public class AutomizationLoop {
    public static void main(String[] args) {
        int total = 0;
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            total = total + (contador * 5);
            contador++;
        }
        System.out.println(contador);
        System.out.println(total);
    }
}

