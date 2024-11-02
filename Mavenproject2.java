/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject2 {
    
    public static void main(String[] args) {
        //CALCULAR EL AREA DE TRIANGULO Y AREA DEL CIRCULO
        //TRIANGULO
        double base;
        double altura;
        double respuesta;
                
        Scanner input = new Scanner(System.in);
                
        System.out.println("ingresar base del triangulo ");
        base = input.nextDouble();
        
        System.out.println(" ingresar altura de triangulo ");
        altura = input.nextDouble();
        
        respuesta = (base * altura) /2 );
        
        
        
        //CALCULAR EL AREA DEL CIRCULO 
        // CIRCULO 
        
        double radio;
        double pi;
        double respuesta;
                
         Scanner input = new Scanner(System.in);
         
         System.out.println(" ingresar el radio del circulo ");
         radio = input.nextDouble();
         
         System.out.println(" ingresar el pi ");
         pi = input.nextDouble();
         
         respuesta = ( radio  * pi );
         
    }
}
