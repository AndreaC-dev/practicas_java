/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author argon
 */
public class Proveedor extends Persona{
    public String producto;
    Proveedor(String nombre, int identificacion, int telefono, String direccion, String producto){
        super(nombre,identificacion,telefono,direccion);
        this.producto=producto;        
    }
        public String toString(){
        String s = '\t'+"Persona Proveedor - Nombre: "+nombre+'\n'+'\t'+"Identificación: "+identificacion+'\n'+'\t'+"Teléfono: "+telefono+'\n'+'\t'+"Dirección: "+direccion+'\n'+'\t'+"Producto: "+producto;
        return s;
    }
}
