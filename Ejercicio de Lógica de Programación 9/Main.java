package com.ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

// Ejercicio 9

public class Main {

    public static void main(String[] args) {
    	
        // Cescáner para leer entrada
        Scanner scanner = new Scanner(System.in);

        // Crear un HashMap para almacenar el diccionario
        HashMap<String, String> diccionario = new HashMap<>();

        // Agregar palabras al diccionario
        diccionario.put("gato", "cat");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("pared", "wall");
        diccionario.put("piso", "floor");
        diccionario.put("techo", "ceiling");
        diccionario.put("luz", "light");
        diccionario.put("reloj", "clock");
        diccionario.put("television", "television");
        diccionario.put("cama", "bed");
        diccionario.put("cocina", "kitchen");
        diccionario.put("baño", "bathroom");
        diccionario.put("jardin", "garden");
        diccionario.put("carro", "car");
        diccionario.put("bicicleta", "bicycle");
        diccionario.put("camino", "path");
        diccionario.put("parque", "park");
        diccionario.put("escuela", "school");
        diccionario.put("biblioteca", "library");

        // Pedir al usuario palabra
        
        System.out.println("Escribe una palabra en español para buscar su traducción en inglés:");
        String palabraIngresada = scanner.nextLine();

        // Palabra a minúsculas y quitar espacios
        
        palabraIngresada = palabraIngresada.trim().toLowerCase();

        // Buscar la palabra en el diccionario
        
        if (diccionario.containsKey(palabraIngresada)) {
            System.out.println("La traducción es: " + diccionario.get(palabraIngresada));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
