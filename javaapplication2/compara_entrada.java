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
public class compara_entrada {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese primera cadena");
        String a= sc.nextLine();
        System.out.println("ingrese segunda cadena");
        String b=sc.nextLine();
        System.out.println("La cadena a y b "+a.contentEquals(b));

    }
    
}
