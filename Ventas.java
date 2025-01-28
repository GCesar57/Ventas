package com.estructurasSelectivas.com.ejercicio9;

import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		/*
		 * Realice un algoritmo con arreglos unidimensionales para las ventas de todo un
		 * mes. La tienda desea conocer aquellas ventas de mayores a $ 1000 y aquéllas
		 * que son entre $800 y $1000 y las que son inferiores a $800.
		 */
		try(Scanner entrada = new Scanner(System.in)) {
		    int mayores = 0, entre = 0, menores = 0;
	            System.out.println("Ingresa el total de ventas del mes: ");
	            int cantidad = entrada.nextInt();
	            int[] ventas = new int[cantidad];
	            for(int i = 0; i < cantidad; i++) {
	            	System.out.println("Ingrese el monto de la venta: ");
	                ventas[i] = entrada.nextInt();
	                if(ventas[i] > 1000) {
	                	mayores++;
	                }else if(ventas[i] >= 800 && ventas[i] <= 1000) {
	                	entre++;
	                }else {
	                	menores++;
	                }//
            }//
            System.out.println("Ventas mayores a $1000: " + mayores);
            System.out.println("Ventas entre $800 y $1000: " + entre);
            System.out.println("Ventas menores a $800: " + menores);
		} catch (Exception e) {
			System.err.println("Error en la entrada de datos: " + e.getMessage());
		}
	}
	//332

}
