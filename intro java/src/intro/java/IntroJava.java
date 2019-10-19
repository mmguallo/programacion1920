/*
Esta clase va a servir para trabajar como distintas clases de operadores
en java
 */
package intro.java;

/**
 *
 * @author Salas
 */
public class IntroJava {

    public static void main(String[] args) {
        //1. OPERADORES ARITMETICOS
        int suma = 14 + 14;
        int resta = 20 - 10;
        double multiplicacion = 50 * 0.12;
        int division = 100 / 50;
        int reciduo = 7 % 2;
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion);

//2. OPERADOR DE INCREMENTO Y DECRECIMIENTO
        int nota = 15;
     nota = nota + 1;
        System.out.println("2. operadores de incremento y decrecimiento");
        System.out.println("incremento como nota = + 1" + nota);
        nota += 1;
        System.out.println("");
    }
}
