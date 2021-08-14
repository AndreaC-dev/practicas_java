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
public class Socio extends Persona{
    public int antiguedad;
    Socio(String nombre, int identificacion, int telefono, String direccion, int antiguedad){
        super(nombre,identificacion,telefono,direccion);
        this.antiguedad=antiguedad;        
    }
        public String toString(){
        String s = '\t'+"Persona Socio - Nombre: "+nombre+'\n'+'\t'+"Identificación: "+identificacion+'\n'+'\t'+"Teléfono: "+telefono+'\n'+'\t'+"Dirección: "+direccion+'\n'+'\t'+"Antigüedad: "+antiguedad+" años";
        return s;
    }
}
