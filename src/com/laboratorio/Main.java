package com.laboratorio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario cuántos números va a ingresar
        System.out.print("¿Cuántos números quieres ingresar? ");
        int cantidad = scanner.nextInt();
        
        double suma = 0; // Variable para almacenar la suma de los números
        
        // Ingresar los números y sumarlos
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero; // Sumar el número a la variable suma
        }
        
        // Calcular el promedio
        double promedio = suma / cantidad;
        
        // Mostrar el resultado
        System.out.println("El promedio es: " + promedio);
        
        scanner.close(); // Cerrar el scanner
    }
}

