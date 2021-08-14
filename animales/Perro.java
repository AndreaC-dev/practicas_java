/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;


/**
 *
 * @author argon
 */
public class Perro implements otraInterface {
    public int edad;
    public String nombre;
    public String colorOjos;
    public Perro(int edad,String nombre,String colorOjos){
        this.edad=edad;
        this.nombre=nombre;
        this.colorOjos=colorOjos;    
    }
    public void ladrar(){
        System.out.println("Guau guau");
    }
    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }
    public void quienEsMayor(Perro perro2) {
        if (edad>perro2.edad){            
            System.out.println("El perro 1 es mayor");
        } else if(perro2.edad>edad){
        System.out.println("El perro 2 es mayor");
        }else{System.out.println("Tienen la misma edad");
        }
}
    public static void main (String[] args){
        Perro miPerro1=new Perro(5,"toby","azules");
        Perro miPerro2=new Perro(7,"mana","cafe");
        Perro miPerro3=new Perro(2,"pete","verde");
        miPerro1.saludar();
        System.out.println("Mi edad es "+miPerro1.edad);
        System.out.println("Mi color de ojos es "+miPerro1.colorOjos);
        miPerro2.saludar();
        System.out.println("Mi edad es "+miPerro2.edad);
        System.out.println("Mi color de ojos es "+miPerro2.colorOjos);
        miPerro3.saludar();
        System.out.println("Mi edad es "+miPerro3.edad);
        System.out.println("Mi color de ojos es "+miPerro3.colorOjos);
        miPerro1.quienEsMayor(miPerro2);
        System.out.println('\u00c7');
        char newLine = 70;
        System.out.println(newLine);
        System.out.println(newLine);
        System.out.println(Double.NaN);
    }
    @Override
    public void dormir(){
        
    }
    @Override
    public void sonidoAnimal(){
        
    }
    @Override
    public void metodo(){
        
    }
    
    
}
