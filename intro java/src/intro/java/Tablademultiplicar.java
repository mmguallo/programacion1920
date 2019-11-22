/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author smart
 */
public class Tablademultiplicar {
    public static void main(String[] args) {
        System.out.print("GENERADOR DE TABLA DE MULTIPLICACION");
        System.out.print("ingresa el numero para generar tabla de mult.");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int cnt = 1;
        while(cnt <= 10){
            System.out.print(numero + " x " + cnt + " = " + numero*cnt);
            cnt++;
        }
}}
