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
public class  Persona {
    public String nombre;
    public int identificacion;
    public int telefono;
    public String direccion;

    Persona(String nombre, int identificacion, int telefono, String direccion){
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.telefono=telefono;
        this.direccion=direccion;
    }        
    @Override
    public String toString(){
        String s = '\t'+"Persona - Nombre: "+nombre+'\n'+'\t'+"Identificación: "+identificacion+'\n'+'\t'+"Teléfono: "+telefono+'\n'+'\t'+"Dirección: "+direccion;
        return s;
    }

    
}
