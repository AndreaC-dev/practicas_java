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
public class Caja<T> {
    private T obj;
    public Caja(T obj){
        this.obj=obj;
    }
public T obtener(){
    return obj;
}

public String decorar (){
    String s = obj.toString();
    String linea = "*";
    for (int i=0; i<s.length(); i++){
        linea +="*";        
    }
    linea += "*";
    return linea + "\n*" + s + "*\n" + linea;
}

    /**
     * @param args the command line arguments
     */
    
}
