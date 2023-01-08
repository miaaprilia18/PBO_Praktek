/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts181122;

import java.io.*;

/**
 *
 * @author user
 */
public class warnetMia {
    private int Kode;
    private String NamaPelanggan;
    private String JenisPelanggan;
    private String  TglMasuk;
    private int JamMasuk;
    private int JamKeluar;
    private double Tarif;
    private double Total;
    private int Lama;
  
    private double diskon;
    
    public int getKode(){
        return Kode;
    }
    
    public void setKode(int Kode){
        this.Kode = Kode;
    }
    
    public String getNamaPelanggan(){
        return NamaPelanggan;
    }
    
    public void setNamaPelanggan(String NamaPelanggan){
        this.NamaPelanggan = NamaPelanggan;
    }
    
    public String getJenisPelanggan(){
        return JenisPelanggan;
    }
    
     public void setJenisPelanggan(String JenisPelanggan){
        this.JenisPelanggan = JenisPelanggan;
    }
     
    public String getTglMasuk(){
        return TglMasuk;
    }
     
    public void setTglMasuk(String TglMasuk){
        this.TglMasuk = TglMasuk;
    }
    
    public int getJamMasuk(){
        return JamMasuk;
    }
    
    public void setJamMasuk(int JamMasuk){
        this.JamMasuk = JamMasuk;
    }
    
    public int getJamKeluar(){
        return JamKeluar;
    }
    
    public void setJamKeluar(int JamKeluar){
        this.JamKeluar = JamKeluar;
    }
    
    public double getTarif(){
        return Tarif;
    }
    
     public double getdiskon(){
        return diskon;
     }
    public void setTarif(double Tarif){
        this.Tarif = Tarif;
    }
 
    public int getLama(){
        Lama = JamKeluar - JamMasuk;
        return Lama;
    }
    
    public double getTotal(){
        Total = Lama * Tarif - diskon;
        return Total;
    }

   
}
  
        

