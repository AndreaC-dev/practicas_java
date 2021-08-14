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
public class JavaApplication7 {
    public static int [][] cuadrado_matriz(int[][]X){
        int [][]Y=new int [X.length][X[0].length];
        for(int i=0; i<X.length;i++){
            for(int j=0; j<X[i].length;j++){
            Y[i][j]=X[i][j]*X[i][j];
        }
       }
    return Y;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] var3=new int [][]{{3,4,5,2},{3,4,5,2}};
        int var2[][]=(cuadrado_matriz(var3));
        for(int[]i:var2){
            for(int j:i){
            System.out.println(j);
            
        }
    }
    
}
}
