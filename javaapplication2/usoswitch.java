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
public class usoswitch {
    public static boolean esMinusc(char n){
        boolean esm;
        switch (n){
            case 'a': 
                esm=true;
            break;
            case 'e' : 
                esm=true;
           break;
           case'i':
               esm=true;
           break;
           case 'o':
               esm=true;
           break;
           case 'u':
                esm=true;               
        default:
            esm=false;
        break;
        }
        return esm;
        
            
        }
    public static boolean esMinusc2(char n){
        boolean esm;
        switch (n){
            case 'a': 
            case 'e' : 
           case'i':
           case 'o':
           case 'u':
                esm=true;  
        break;
        default:
            esm=false;
        break;
        }
        return esm;  
        }
    }
    
