package com.ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutosPorHora = 60;
        int minutosEnUnDia = 24 * minutosPorHora;
        int minutosHastaViernes15 = (4 * minutosEnUnDia) + (15 * minutosPorHora);

        while (true) {
        	
            try {
            	
                // Entrada 
                System.out.println("Ingresa un día entre Lunes y Viernes: ");
                String dia = scanner.nextLine().trim().toLowerCase();

                System.out.println("Por favor, ingresa la hora en formato de 24 horas: ");
                int hora = scanner.nextInt();
                
                System.out.println("Por favor, ingresa los minutos:");
                int minutos = scanner.nextInt();
                // Consumir el salto de línea
                scanner.nextLine();

                // Validar entrada y calcular minutos faltantes
                int minutosActuales = validarEntrada(dia, hora, minutos);
                
                if (minutosActuales == -1) {
                    System.out.println("Entrada inválida. Inténtalo de nuevo.\n");
                    //Para regresar al incio del bucle
                    continue;
                }

                int minutosFaltantes = minutosHastaViernes15 - minutosActuales;
                
                if (minutosFaltantes < 0) {
                    System.out.println("Ya es fin de semana o ha pasado el horario límite.");
                    
                    continue;
                }

                System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
                
                break;
                
            } catch (Exception e) {
                System.out.println("Error. Inténtalo de nuevo.\n");
                // Limpiar entrada en caso de error
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static int validarEntrada(String dia, int hora, int minutos) {
        int diaEnMinutos = switch (dia) {
            case "lunes" -> 0;
            case "martes" -> 1 * 24 * 60;
            case "miércoles", "miercoles" -> 2 * 24 * 60;
            case "jueves" -> 3 * 24 * 60;
            case "viernes" -> 4 * 24 * 60;
            default -> -1;
        };

        return (diaEnMinutos != -1 && hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60)
                ? diaEnMinutos + (hora * 60) + minutos
                : -1;
    }
}
