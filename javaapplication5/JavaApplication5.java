/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author argon
 */
public class JavaApplication5 {
    public static int[] lee_arreglo_enteros(Scanner sc, int n){
    int[] x = new int[n];
    for( int i=0; i<n; i++ ){
    System.out.println("Componente "+i+"- ́esima?");
    x[i] = sc.nextInt();
    }
    return x;
    }
    public static void escribe_arreglos(int[] x){
        int n = x.length;
        for (int i=0; i<n;i++){
            System.out.println("x["+i+"]="+x[i]);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var=5;
        Scanner sc=new Scanner(System.in);
        int y []=lee_arreglo_enteros(sc,var);
        System.out.print("[");
        for (int i=0;i<var;i++){
            System.out.print(y[i]);
        }
        System.out.print("]");
        escribe_arreglos(y);
    }
    
}
