/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author argon
 */
public class JavaApplication2 {
    public static double pagoFinal(int n, int precio) {
        double valor;
        if (n>20){
            valor=n*precio*.8;
        }else if(n>10){
            valor=n*precio*.9;
        }else if (n>5){
            valor=n*precio*.95;
        }else{
            valor=n*precio;
        };
        return valor;
            }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n;
        System.out.println("Ingrese cantidad");
        n=sc.nextInt();
        int precio;
        System.out.println("Ingrese precio");
        precio=sc.nextInt();
        System.out.println("El valor total es: " + pagoFinal(n, precio));
           
        
    }
    public static boolean condicional(boolean p, boolean q){        
        return !(p==true && q==false);
    }

    
}
