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
public class latihan6 {
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
        
        
        int k=1;
        int n;
        for (n=1; n<=pangkat;n++){
            k=k*angkabasis;
        }
        hasil=angkabasis +"^"+pangkat+"="+k;
        System.out.println(hasil);
            
    }
    
}
