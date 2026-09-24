package Basics;

import java.util.Scanner;

public class Forloops5 {


	    public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        int temperatura;

	        System.out.print("Introduce la temperatura: ");
	        temperatura = teclado.nextInt();

	        if (temperatura > 40) {
	            System.out.println("Ventilador encendido");
	        } else {
	            System.out.println("Ventilador apagado");
	        }

	        teclado.close();
	    }
	}

