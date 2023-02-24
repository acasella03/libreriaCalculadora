# Calculadora Básica
Esta aplicación se encarga de calcular la SUMA, RESTA, MULTIPLICACIÓN y DIVISIÓN entre dos números solicitados al usuario.

## Menú de opciones para el usuario:
Al usuario le saldrá el siguiente menú y deberá teclear el número correcpondiente a la operación que quiere realizar.

    1. SUMA
    2. RESTA
    3. MULTIPLICACIÓN
    4. DIVISIÓN

### 1.SUMA:
Si el usuario teclea el número 1, entra en la operación de **SUMA**, a continuación le pedirá al usuario que escriba el primer y el segundo número, realizará dicha operación y luego confirmará el resultado imprimiéndolo en la consola para que el usuario pueda verlo. Por último, finaliza el programa, para empezar de nuevo debe volver a ejecutar.

### 2.RESTA:
Si el usuario teclea el número 2, entra en la operación de **RESTA**, a continuación le pedirá al usuario que escriba el primer y el segundo número, realizará dicha operación y luego confirmará el resultado imprimiéndolo en la consola para que el usuario pueda verlo. Por último, finaliza el programa, para empezar de nuevo debe volver a ejecutar.

### 3.MULTIPLICACIÓN:
Si el usuario teclea el número 3, entra en la operación de **MULTIPLICACIÓN**, a continuación le pedirá al usuario que escriba el primer y el segundo número, realizará dicha operación y luego confirmará el resultado imprimiéndolo en la consola para que el usuario pueda verlo. Por último, finaliza el programa, para empezar de nuevo debe volver a ejecutar.

### 4.DIVISIÓN:
Si el usuario teclea el número 4, entra en la operación de **DIVISIÓN**, a continuación le pedirá al usuario que escriba el primer y el segundo número, realizará dicha operación y luego confirmará el resultado imprimiéndolo en la consola para que el usuario pueda verlo. Por último, finaliza el programa, para empezar de nuevo debe volver a ejecutar.

Se agrega una corrección para que salga el siguiente mensaje **"Dividir entre cero es infinito, prueba con otros números"** si el usuario escribe el número cero para dar valor al segundo número. Para que salga dicho mensaje se empleó el método **isInfinite()**, en Float Class es un método incorporado en Java que devuelve verdadero si la variable respuesta es infinitamente grande en magnitud, falso de lo contrario.

Se agrega otra corrección para que salga el siguiente mensaje **"Cero entre cero no es un resultado válido, prueba con otros números"** si el usuario escribe el número cero para dar valor al primer y segundo número. Para que salga dicho mensaje se empleó el método **isNaN()**, en Float Class es un método incorporado en Java que devuelve verdadero si la variable respuesta no es un número válido, falso de lo contrario.

### 5.RAÍZ:
Si el usuario teclea el número 5, entra en la operación de **RAIZ**, a continuación le pedirá al usuario que escriba el primer y el segundo número, realizará dicha operación y luego confirmará el resultado imprimiéndolo en la consola para que el usuario pueda verlo. Por último, finaliza el programa, para empezar de nuevo debe volver a ejecutar.


[JavaDoc](https://acasella03.github.io/libreriaCalculadora/)