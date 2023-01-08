/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia281022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class latihan3 {
       public static void main (String [] args){
       BufferedReader dataIn =new BufferedReader (
        new InputStreamReader (System.in));
       
       int max=999;
       int data[]= new int [10] ;
       
       try {
           for (int i=0; i< data.length; i++)
           {
               System.out.print("masukkan nilai ke "+(i+1)+":");
               data[i]=Integer.parseInt(dataIn.readLine());
           }
       }catch (IOException e){
           
       }
       
       for(int i=0; i<data.length;i++){
           if (data [i] > max){
               max=data[i];
           }
       }
       System.out.println("nilai terbesar :"+ max);
       
      
      
  }
   
}
