/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts181122;



/**
 *
 * @author user
 */
public class warnetMiaExample {
    
    public static void main (String[] args) {
        warnetMia customer1 = new warnetMia();
        //
        customer1.setKode(21);
        customer1.setNamaPelanggan("Mia");
        customer1.setJenisPelanggan("VIP");
        customer1.setTglMasuk("18112022");
        customer1.setJamMasuk(5);
        customer1.setJamKeluar(9);
        customer1.setTarif(10000);
        
        //
        
        System.out.println("Masukkan Kode           :"+customer1.getKode());
        System.out.println("Nama Pelanggan          :"+customer1.getNamaPelanggan());
        System.out.println("Jenis Pelanngan         :"+customer1.getJenisPelanggan());
        System.out.println("Masukkan Tgl Masuk      :"+customer1.getTglMasuk());
        System.out.println("Masukkan Jam Masuk      :"+customer1.getJamMasuk());
        System.out.println("Masukkan Jam Keluar     :"+customer1.getJamKeluar());
        System.out.println("1ama menggunakan Warnet :"+customer1.getLama());
        System.out.println("Besar Tarif             :"+customer1.getTarif());
         System.out.println("Besar Diskon Penjualan :"+customer1.getdiskon());
        System.out.println("Total Pembayaran        :"+customer1.getTotal());
      
        
        
    }
        
    
}
