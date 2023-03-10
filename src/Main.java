import com.angi.io.EntradaSalida;
import com.angi.calculadora.Calculadora;

/**
 * Se usa para probar los métodos de la librería
 */
public class Main {
    /**
     * Prueva de métodos
     * @param args argumentos
     */
    public static void main(String[] args) {
        int opcion;
        Float numero1, numero2, resultado;

        opcion = EntradaSalida.entradaEntero("***MENU*** \n\n 1---> SUMA \n 2---> RESTA \n 3---> MULTIPLICACIÓN \n 4---> DIVISIÓN \n 5---> RAÍZ \n\n Teclea una opción de las anteriores");
        numero1 = EntradaSalida.entradaFloat("Escribe el primer número: ");
        numero2 = EntradaSalida.entradaFloat("Escribe el segundo número: ");

        if (numero1 == null || numero2 == null) {
            EntradaSalida.salida("Debes escribir un número, no una letra", EntradaSalida.SALIDA_CONSOLA);
        } else {
            if (opcion >= 1 && opcion <= 5) {
                resultado = Calculadora.calculadora(numero1, numero2, opcion);
                if (Float.isInfinite(resultado) || Float.isNaN(resultado)) {
                    EntradaSalida.salida("Dividir entre cero es infinito, prueba con otros números", EntradaSalida.SALIDA_CONSOLA);
                    EntradaSalida.salida("Cero entre cero no es un resultado válido, prueba con otros números", EntradaSalida.SALIDA_CONSOLA);
                } else {
                    EntradaSalida.salida("El resultado de la opción seleccionada es: " + resultado, EntradaSalida.SALIDA_CONSOLA);
                }
            }
        }
    }
}