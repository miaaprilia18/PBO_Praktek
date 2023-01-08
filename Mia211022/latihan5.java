/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia211022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class latihan5 {
     public static void main (String[] args){
        BufferedReader dataIn =new BufferedReader (
        new InputStreamReader (System.in));
        
        int angkabasis=0;
        int pangkat=0;
        int i;
        String hasil="";
        
        try {
         
            System.out.print("masukkan basis =");
            angkabasis=Integer.parseInt(dataIn.readLine());
            System.out.print("masukkan pangkat =");
            pangkat=Integer.parseInt(dataIn.readLine());
              
        }catch (IOException e){
            System.out.println("eror");  
        }
       // int pangkat= Integer.valueOf(pangkat).intValue();
       // int angkabasis= Integer.valueOf(angkabasis).intValue();
        
        int n=1;
        int k=1;
        do {
            n++;
            k=k*angkabasis;
        }while (n <= pangkat);
        hasil=angkabasis +"^"+pangkat+"="+k;
        System.out.println(hasil);
            
    }
    
}
