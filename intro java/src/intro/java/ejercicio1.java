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
public class ejercicio1 {
     public static void main(String[] args) {
       
         double num1;
         double num2;
         Scanner entrada = new Scanner(System.in );
         System.out.println("ingresar numero 1"); 
         num1 = entrada.nextInt();
         System.out.println("ingresar numero 2");
         num2 = entrada.nextInt();
       
         if (num1 == num2){
         System.out.println("los nmeros son iguales");
             
         }else    
             System.out.println("los nuneros no son iguales");
     }}