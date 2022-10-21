/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_dannacasco;

import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Lab2P1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MCD de dos números 
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero A:");
        int A = entrada.nextInt();

        System.out.print("Ingrese número B:");
        int B = entrada.nextInt();
        
        if ((A<=0)&&(B<=0)){
        System.out.println("Los números ingresados deben ser positivos");
        } else{
            
            while (A != B) {

                if (A > B) {

                    A = A - B;

                } else {
                    B = B - A;      

                }
            }  


            }
        System.out.println("El MCD es:" + B);
    }

}


    /*public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese año de nacimiento:");
        int nacimiento = entrada.nextInt();
        
        if((nacimiento>=1946)&&(nacimiento<=1964)){
            System.out.println("Usted es Baby Boomer ");
        }else if((nacimiento>=1960)&&(nacimiento<=1979)){
            System.out.println("Usted es Generación X "); 
        }else if ((nacimiento>=1975)&&(nacimiento<=1985)){
            System.out.println("Usted es Xennial");
        }else if ((nacimiento>=1980)&&(nacimiento<=1994)){
            System.out.println("Usted es Millenial ");
        }else if ((nacimiento>=1990)&&(nacimiento<=2012)){
            System.out.println("Usted es Gen Z");
        }else{
            System.out.println("Usted es Gen Alpha");
            
        }   
        }       
        }
        