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
public class comparacion {
    public static void main(String[] args){
        String a = "hola";
        String b = "hola";
        String c = "HOLA";
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.substring(2));
        
    }
}
