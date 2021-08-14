/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @author argon
 */
public class Reto12 {

public static String calculator(int assistant){  
    int student;
    student=(2*assistant)+4;
    int trainer;
    trainer=(student+assistant)/5;
    String group="";
    group=grouper(trainer);
    return (assistant+" "+student+" "+trainer+'\n'+group);
    
}
public static String grouper(int trainer){  
    String group="";
    if(trainer>50){
        group="cuatro";
    }else if(trainer>=31){
        group="tres"; 
    }else if(trainer>=21){
        group="dos";
    }else{
        group="uno";
    }
    return group;

    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        int assistant;
        assistant=sc.nextInt();
        System.out.println(calculator(assistant));
        //String dato=(calculator(assistant));
        //String[]dato2=dato.split(" ");
        //int trainer=Integer.parseInt(dato2[2]);
        //System.out.println(grouper(trainer));
        System.out.println(Math.pow(3,3));
        
    }
    
}
