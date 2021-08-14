/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author argon
 */
public class Gestion {
    public static List Personas;
    
    public static void inicializacion(){
    Personas = new ArrayList<>();
    }
   public static void AgregarPersona( Persona persona){
        Personas.add(persona);
   }
    
   public static String ListarPersona(){ 
       String s="***Inventario de Personas***"+'\n';
       if (!Personas.isEmpty()){
       for (Object p:Personas)
            s +=p.toString() + '\n';}
       System.out.println(s);
       return s;
   }
   public static void ProcesarComandos(){
        Scanner sc = new Scanner(System.in);
        int i=0;
        do{
            String leido=sc.nextLine();
            if(leido.equals("3")){
                i++;
            }else if(leido.equals("2")){
                ListarPersona();
            } else {
                String[] line =leido.split("&");
                String nombre=line[2];
                int identificacion=Integer.parseInt(line[3]);
                int telefono=Integer.parseInt(line[4]);
                String direccion=line[5];
                String dato=line[1];
                if (dato.equals("Proveedor")){
                    String producto=line[6]; 
                    Persona persona=new Proveedor(nombre,identificacion,telefono,direccion,producto);
                    AgregarPersona(persona);
                    
                }else{
                    int antiguedad=Integer.parseInt(line[6]); 
                    Persona persona=new Socio(nombre,identificacion,telefono,direccion,antiguedad);
                    AgregarPersona(persona);}
                        }             
        }while (i == 0);
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicializacion();
        ProcesarComandos();
        // TODO code application logic here
    }
    
}
