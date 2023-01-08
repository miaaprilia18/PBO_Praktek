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
public class Student extends person{
    
        public Student(){
            
            super ("Mia","padang");
            System.out.println("Inside Student:Constructor");
            //beberapa kode di sini
    }
        
        public String getName(){
        System.out.println("Person: getName");
        return name;
    }
    // beberapa kode di sin
    
        public static void main( String[] args ){
            Student student = new Student();
             System.out.println(student.getName());
             System.out.println(student.getAddress());
             
            
        }
}
