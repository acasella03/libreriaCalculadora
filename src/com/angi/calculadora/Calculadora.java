package com.angi.calculadora;

import com.sun.jdi.IntegerValue;
import com.sun.jdi.Value;

/**
 * Librería Calculadora Básica
 *
 * @author Angi Casella
 * @version 1.3
 */

public class Calculadora {

    /**
     * opción para calcular una suma
     */
    public static final int SUMA = 1;
    /**
     * opción para calcular una resta
     */
    public static final int RESTA = 2;
    /**
     * opción para calcular una multiplicación
     */
    public static final int MULTIPLICACION = 3;
    /**
     * opción para calcular una división
     */
    public static final int DIVISION = 4;

    /**
     * opción para calcular una raíz
     */
    private static final int RAIZ = 5;
    /**
     * guarda el resultado de la operación
     */
    private static Float resultado = null;

    /**
     * Calculadora que realiza operación de suma, resta, multiplicación o división entre dos números
     *
     * @param num1   primer número para el cálculo de la opereción seleccionada
     * @param num2   segundo número para el cálculo de la opereción seleccionada
     * @param option tipo de operación a seleccionar por el usuario
     * @return el resultado de la operación seleccionada por el usuario
     */
    public static Float calculadora(Float num1, Float num2, int option) {
        switch (option) {
            case SUMA:
                try {
                    resultado = num1 + num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case RESTA:
                try {
                    resultado = num1 - num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
            case MULTIPLICACION:
                try {
                    resultado = num1 * num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
            case DIVISION:
                try {
                    resultado = num1 / num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
            case RAIZ:
                try {
                    resultado = (float)(Math.pow(num1, (double) 1.0 / num2));
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Fuera del rango de opciones");
        }

        return resultado;
    }
}
