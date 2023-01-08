/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia091222;

/**
 *
 * @author user
 */
public class PolimorfisExample {
    public static void main (String [] args){
        person ref;
        Student student =new Student ();
        Employee employee =new Employee ();
        ref = student;
        
         String temp = ref.getName(); //getName dari Student
         //class dipanggil
         System.out.println( "Name"+temp );
         ref = employee; //Person menunjuk kepada
         
         // object Employee
         String temp1 = ref.getName(); //getName dari Employee
         //class dipanggil
         System.out.println( "Mia"+temp1 );
    }
    
}
