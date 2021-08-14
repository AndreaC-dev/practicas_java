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
public class whileDoWhile {
    public static void minMaqWhile(){
        float i=1;
        int num=1;
        while (i >0){
            System.out.println(num+" : "+i);
            i/=2;
            num++;
        }
        System.out.println(i+"the end");
    }
        public static void minMaqDoWhile(){
        float i=1;
        int num=1;
        do{
            i/=2;
            System.out.println(num+" : "+i);
            num++;            
        } while (i >0);
        System.out.println(i+"the end");
    }
    public static void main(String [] args){
        minMaqWhile();
        minMaqDoWhile();
    }
    
}
