package com.ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Objeto Scanner para leer la entrada del usuario 
        
		Scanner scanner = new Scanner(System.in);
        
        
        //Solicitar al usuario que ingrese una palabra o frase
        
        System.out.println("Por favor, ingresa una palabra o frase:");
        String txt = scanner.nextLine();
        
        //Invertir el texto
        
        String texInvertido = invertirTexto(txt);
        
     // Mostrar el texto invertido en consola
        System.out.println("Texto invertido:");
        System.out.println(texInvertido);

        // Cerrar el objeto Scanner
        scanner.close();
	
	}
	
	// metodo para invetir texto 
	
	public static String invertirTexto( String txt) {
		
		//Usamos StringBuilder para invertir el 
		//texto con el método reverse().
		 StringBuilder texInvertido = new StringBuilder(txt);
		 return   texInvertido.reverse().toString();
	}

}
