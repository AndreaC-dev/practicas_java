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
public class Reto1 {
public int student;
public int trainer;
public int assistant;
public String group;
Reto1(int student, int trainer, int assistant, String group){
    this.student=student;
    this.trainer=trainer;
    this.assistant=assistant;
    this.group=group;
}
Reto1(){
    
}
public String calculator(int assistant){  
    this.student=(2*this.assistant)+4;
    this.trainer=(this.student+this.assistant)/5;
    return (this.assistant+" "+this.student+" "+this.trainer);
    
}
public String grouper(int trainer){  
    if(this.trainer>50){
        this.group="cuatro";
    }else if(this.trainer>31){
        this.group="tres"; 
    }else if(this.trainer>21){
        this.group="dos";
    }else{
        this.group="uno";
    }
    return this.group;

    
}
    /**
     * @param args the command line arguments
     */
    public void doing() {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        this.assistant=sc.nextInt();
        System.out.println(this.calculator(this.assistant));
        System.out.println(this.grouper(this.trainer));
        
    }
    
}
