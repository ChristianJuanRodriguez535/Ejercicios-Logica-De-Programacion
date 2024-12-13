package com.ejercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] numeros = new int[10]; 
		int [] result = new int [10];
		int primosIndx = 0;
		int noPrimosIndx = 0;
		
		//Numeros del usuario
		
		System.out.println("Introduce por favor 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
		
        //Acomodar los números en el arreglo
        
        for (int i = 0; i < 10; i++) {
            
        	if (esPrimo(numeros[i])) {
        		
                result[primosIndx++] = numeros[i];
                
            } else {
            	
                result[9 - noPrimosIndx++] = numeros[i];
            }
        }
        
        //Mostrar array inicial 
        
        System.out.println("Array inicial:");
        
        for (int i = 0; i < 10; i++) {
        	
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
        
        // Mostrar array num primos al inicio
        
        System.out.println("\nArray ordenado:");
        
        for (int i = 0; i < 10; i++) {
        	
            System.out.println("pos[" + i + "] = " + result[i]);
        }
		
        scanner.close();
	}
	
	
	//Método para ver los numeros primos 
	
	private static boolean esPrimo(int num) {
		
		if(num <= 1) {
			
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
