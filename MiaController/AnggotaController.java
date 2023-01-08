/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiaController;

import MiaModel.*;
import Miaviews.*;
import java.util.List;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class AnggotaController {
 
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    
    
    public AnggotaController(FormAnggota formAnggota ){
        this.formAnggota = formAnggota;
        anggotaDao= new AnggotaDaoImpl();
        
    }
    
    public void bersihForm(){
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    public void saveAnggota (){
        
        anggota= new Anggota ();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota,"Insert Ok");
    }
    public void updateAnggota (){
        
        int index =formAnggota.getTblAnggota().getSelectedRow();
        anggota= anggotaDao.getAnggota (index);
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.update(index,anggota);
        JOptionPane.showMessageDialog(formAnggota,"Update Ok");
    }
    
    
     public void deleteAnggota (){
        
        int index= formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota,"Delete Ok");
    }
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota : list){
            Object [] row = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat(),
            };
            tabelModel.addRow(row);
        }
       
    }
    public void getAnggota() {
        int index= formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
           formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            
        }
    }
   

    
}
    
    

