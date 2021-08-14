/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author argon
 */
public class conteo {
    public static void main (String[] args){
        String ini="geek for geeks";
        char bus='e';
        int suma=0;
        for (int i=0;i<ini.length();i++){
            if (ini.charAt(i)==bus){
                suma++;
            }        
    }
        System.out.println(suma);
    }
    
}
