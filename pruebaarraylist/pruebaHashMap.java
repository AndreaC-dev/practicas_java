/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarraylist;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;

/**
 *
 * @author argon
 */
public class pruebaHashMap {
    public static void main(String [] args){
        TreeMap <String,Double> mapa =new TreeMap<>();
        mapa.put("nota1",3.2);
        mapa.put("nota2",4.3);
        mapa.put("nota3", 3.9);
        mapa.put("nota3", 5.9);
        mapa.put("nota4", 5.9);
        System.out.println("tamaño: " + mapa.size());
        System.out.println("HashMap 1: " +mapa);
        if (mapa.containsKey("nota2")){
            Double valor = mapa.get("nota2");
            System.out.println("nota 2 === " + valor);
        }
        mapa.remove("nota1");
        System.out.println("HashMapFinal:");
        ArrayList<Object> lista= new ArrayList();
        for (Map.Entry<String,Double> element: mapa.entrySet()){
            System.out.println(element.getKey() + " : "+element.getValue());
            if(element.getValue()==5.9){
                lista.add(element.getKey());
            }
        }
        for(Double elem:mapa.values()){
            System.out.println(elem);
        }
        System.out.println(lista);
    }
    
}
