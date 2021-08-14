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
public class JavaApplication4 {
    public static int suma(int n){
        int s=0;
        for (int i=1; i<=n; i++){
            s=s+i;
        }
        return s;
    }

    public static void main(String[] args) {
        Object[] frutas=
                new Object[]{"fruta",5,6.0};
        for (Object f:frutas){
            System.out.println(f);                    
                }
    }
}