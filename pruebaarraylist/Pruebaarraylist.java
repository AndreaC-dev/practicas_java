/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Pruebaarraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> lista = new ArrayList<>();
                
        for (int i =1; i<=10; i++){
            lista.add(i);}
        System.out.println(lista);
        lista.remove(3);
        System.out.println(lista);
        for (int i =0; i<lista.size();i++){
            System.out.println(lista.get(i)+" ");}
        System.out.println();
        for (Object n:lista) System.out.println(n+" ");
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("prueba1");

        lista.addAll(0, lista1);
        lista.addAll(lista1);
        System.out.println(lista);
        System.out.println(lista1);
        
        System.out.println(lista.removeAll(lista1));
        System.out.println(lista);
        List<Integer> miLista = new ArrayList<Integer>(Arrays.asList(3, 1, 4));
        System.out.println(miLista);
        
    }
    
}
