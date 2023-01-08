/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiaModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AnggotaDaoImpl implements AnggotaDao {
    
    private List<Anggota> data = new ArrayList<>();

    public AnggotaDaoImpl(){
        data.add(new Anggota("1111","Mia","Padang"));
        data.add(new Anggota("1112","Nisa","jakarta"));
        data.add(new Anggota("1113","Diah","Padang Panjang"));
    }
    @Override
    public Anggota save(Anggota anggota) {
        data.add(anggota);
        return anggota;
    }

    @Override
    public Anggota update(int index, Anggota anggota) {
       data.set(index,anggota);
        return anggota;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
        
    }

    @Override
    public Anggota getAnggota(int index) {
        return data.get(index);
    }

    @Override
    public List<Anggota> getAllAnggota() {
       return data;
    }
    
}
