/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

/**
 *
 * @author argon
 */
public class Main {
    public static void main(String[] args) {
    Pareja<Integer,String> a =
    new Pareja<Integer,String>(20,"Pedro Paramo");
    System.out.println( a );
    Integer c = a.clave() + 10;
    System.out.println( c );
    System.out.println(a.valor().charAt(2));
    System.out.println(a.toString());
    }
}
