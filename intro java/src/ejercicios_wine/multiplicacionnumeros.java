/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_wine;

import java.util.Scanner;

/**
 *
 * @author smart
 */
public class multiplicacionnumeros {
    public static void main(String[] args) {
        Scanner datos= new Scanner (System.in);
        System.out.println("programa para multiplicar n numeros");
        int num;
        boolean op = true;
         System.out.println("ingesar su nueo numero: ");
         num=datos.nextInt();
           while(op = true){
            System.out.println("desea ingresar un numero si/no");
            String res = datos.next();
            if("si".equals(res)){
              System.out.println("ingesar su nueo numero: ");  
              num= datos.nextInt();
            }else if ("no".equals(res)){
                op = false;//hacemos que finalice el ciclo de repeticion
            }
        }
        
    }
}
