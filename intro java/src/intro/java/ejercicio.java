package intro.java;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smart
 */
public class ejercicio {
    public static void main(String[] args) {
        System.out.println("BONOS DE LOS EMPLEADOS DE LA "
                + "EMPRESA 'ABC' ");
        Scanner datos = new Scanner(System.in);
        String name ;
        int antiguedad;
        System.out.println("Ingrese su Nombre: ");
        name=datos.nextLine();
        System.out.println("Ingrese sus a;os trabajados en el empresa ABC");
        antiguedad=datos.nextInt();
        if (antiguedad == 1) {
            System.out.println("Su bono es de $100");
            
        }else if (antiguedad == 2) {
            System.out.println(name +"\tSu bono es de $200");
        }else if (antiguedad == 3) {
            System.out.println(name +"\tSu bono es de $300");
        }else if (antiguedad == 4) {
            System.out.println(name +"\tSu bono es de $400");
            
        }else if (antiguedad == 5) {
            System.out.println(name +"\tSu bono es de $500");
        }else if (antiguedad > 5) {
            System.out.println(name+"\t Su bono es de $1000");
        }
    }
    
}
