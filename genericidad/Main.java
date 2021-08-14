/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericidad;

/**
 *
 * @author argon
 */
public class Main {
    public static void main(String [] args){
        Caja<String> caja = new Caja<> ("Pedro Paramo");
        System.out.println(caja.decorar());
        char c=(caja.obtener()).charAt(2);
        System.out.println(c);
        Caja<Double> caja1 = new Caja<> (5.3);
        System.out.println(caja1.decorar());
        double y = caja1.obtener()+20;
        System.out.println(y);
    }
    
}
