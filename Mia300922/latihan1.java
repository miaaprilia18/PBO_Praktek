/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia300922;

/**
 *
 * @author user
 */

  import java.io.BufferedReader;
  import java.io.InputStreamReader;
  import java.io.IOException;  

public class latihan1 {
    public static void main( String[] args ){
       
     
       
    BufferedReader dataIn = new BufferedReader(new 
        InputStreamReader( System.in));
    
    String name = "";
    String addres ="";
    String jurusan= "";
    
    
    try{
        System.out.print("Please Enter Your Name:");
        name = dataIn.readLine();
    }
    catch( IOException e ){
        System.out.println("Error!");
    }
        System.out.println("Hello " + name +"!"+ "\n"
              +"alamat saya :" + addres + "\n"
              +"jurusan saya :"+ jurusan);
    }
}
