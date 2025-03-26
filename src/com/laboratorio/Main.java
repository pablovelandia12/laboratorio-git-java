package com.laboratorio;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        int numeroAleatorio = (int) (Math.random() * 100) + 1;
	        int intentos = 0;
	        int numeroIngresado = 0;

	        System.out.println("Intenta adivinar un número entre 1 y 100.");

	        while (numeroIngresado != numeroAleatorio) {
	            System.out.print("Ingrese su número: ");
	            numeroIngresado = teclado.nextInt();
	            intentos++;

	            if (numeroIngresado > numeroAleatorio) {
	                System.out.println("El número es menor. Intenta de nuevo.");
	            } else if (numeroIngresado < numeroAleatorio) {
	                System.out.println("El número es mayor. Intenta de nuevo.");
	            } else {
	                System.out.println("¡Felicidades! El número era " + numeroAleatorio + " y lo adivinaste en " + intentos + " intentos.");
	            }
	        }

	        teclado.close();
	    }
	}

