package basics.examen1;

public class LoopTest {
    public static void main(String[] args) {
        int acumulator = 10;
        int contadorPares = 0;
        int paso = 0;
        for (int i = 1; i < 6; i++) {
            paso++;
            if(i % 2 == 0){
                acumulator =  acumulator + i;
                contadorPares++;
            }
            else{
                acumulator = acumulator - 1;
            }

        }
        System.out.println("fin del programa");
    }
}

