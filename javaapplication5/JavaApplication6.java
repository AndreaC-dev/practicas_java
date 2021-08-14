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
public class JavaApplication6 {
    public static int pos_maximo(int[] A){
        int m=0;
        for (int i=0; i<A.length;i++){
            if (A[i]>A[m])
                m=i;
        }
        return m;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var[]=new int[]{3,4,5,2};
        System.out.println(pos_maximo(var));
    }
    
}
