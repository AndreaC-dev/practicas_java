/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author argon
 */
public class JavaApplication8 {
    public static boolean matriz_simetrica(char[][] X){
    boolean bandera = true;
    for( int i=0; i<X.length-1; i++){
        for( int j=i+1; j<X.length; j++){
        bandera &= (X[i][j] == X[j][i]);
        }
    }
    return bandera;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [][]x=new char [][]{{'t','r','c'},{'m','c','c'}};
        System.out.println(matriz_simetrica(x));
        
    }
    
}
