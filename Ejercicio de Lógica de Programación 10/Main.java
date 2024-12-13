package com.ejercicio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Ejercicio 10

public class Main {

    public static void main(String[] args) {
    	
        // escáner para leer la entrada
        Scanner entrada = new Scanner(System.in);

        // Inicializar el diccionario Español-Inglés
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

        // Lista para seleccionar palabras aleatorias
        ArrayList<String> listaPalabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(listaPalabras);
        List<String> palabrasAleatorias = listaPalabras.subList(0, 5);

        // Contadores para respuestas correctas e incorrectas
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Traduce las siguientes palabras al inglés:");

        // Iterar sobre las palabras seleccionadas
        for (String palabra : palabrasAleatorias) {
            System.out.println("¿Cómo se dice '" + palabra + "' en inglés?");
            String respuestaUsuario = entrada.nextLine().trim().toLowerCase();

            // Verificar si la traducción es correcta
            if (diccionario.get(palabra).equals(respuestaUsuario)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
            }
        }

        // Mostrar el resultado final
        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        // Cerrar el escáner
        entrada.close();
    }
}
