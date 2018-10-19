package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static boolean validarNumero(int numero) {
        boolean validado = true;
        if (numero > 9999 || numero < 0) {
            validado = false;
        }
        return validado;
    }

    public static int cuentaCifras(int numero) {
        return String.valueOf(numero).length();
    }

    public static void main(String[] args) {
        int numero, numeroCifras;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a contar las cifras que tiene un número!");
        System.out.print("Introduce un número: ");
        numero = (int) validador(0);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un número entre 0 y 9999! ");
            numero = (int) validador(0);
        }
        sc.close();
        numeroCifras = cuentaCifras(numero);
        System.out.printf("EL número %d tiene %d cifras\n", numero, numeroCifras);
    }
}
