/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia071022;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class latihan7 {
    public static void main (String [] arg){
        
         String angka="";
         
         angka=JOptionPane.showInputDialog("masukan angka :");
         int z= Integer.valueOf(angka).intValue();
         
         String hasil="";
         switch (z){
             case 1: hasil+="valid number"; break;
             case 2: hasil+="valid number"; break;
             case 3: hasil+="valid number"; break;
             case 4: hasil+="valid number"; break;
             case 5: hasil+="valid number"; break;
             case 6: hasil+="valid number"; break;
             case 7: hasil+="valid number"; break;
             case 8: hasil+="valid number"; break;
             case 9: hasil+="valid number"; break;
             case 10: hasil+="valid number"; break;
             default: hasil+="invalid number"; break;
              
             
         }
         JOptionPane.showInputDialog(null,hasil);
    }
           
    
}
