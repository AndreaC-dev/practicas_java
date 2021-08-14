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
public class splitcadenas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] line = s.split("&");
        System.out.println(s.split("&"));
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
    }
    
}
