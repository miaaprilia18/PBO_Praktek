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
public class latihan6 {
    public static void main (String [] args){
        String angka="";
        
        angka= JOptionPane.showInputDialog("masukan angka");
        int z= Integer.valueOf(angka).intValue();
        String hasil="";
        
        if (z>=1 && z<=10){
            hasil+="valid number";
        }else{
            hasil +="invalid number";
        }
         JOptionPane.showInputDialog(null,hasil);
    }
}
