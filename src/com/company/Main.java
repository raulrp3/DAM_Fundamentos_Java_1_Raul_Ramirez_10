package com.company;

import java.util.Scanner;

public class Main {
    public static int validarEntero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero!");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
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
        numero = validarEntero(sc);
        while (!validarNumero(numero)) {
            System.out.print("¡Introduce un número entre 0 y 9999! ");
            numero = validarEntero(sc);
        }
        sc.close();
        numeroCifras = cuentaCifras(numero);
        System.out.printf("EL número %d tiene %d cifras\n", numero, numeroCifras);
    }
}
