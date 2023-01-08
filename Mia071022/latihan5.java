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
public class latihan5 {
    public static void main (String [] args) {
        
      int angka1 =0;
      int angka2 =0;
      int angka3 =0;
      int jumlah=0;
      int rata;
      
      angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 1 ="));
      angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 2 ="));
      angka3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 3 ="));
      
      rata=((angka1+angka2+angka3)/3);
      
      if(rata>=60){
          JOptionPane.showMessageDialog(null,"rata-rata="+rata+":)");          
      }else  {
          JOptionPane.showMessageDialog(null,"rata-rata="+rata+":)"); 
      }
    
}
    
}
