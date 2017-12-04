/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

/**
 *
 * @author user
 */
public class Kota {
    
    private String namaKota;

    /**
     * @return the namaKota
     */
    
    
    public Kota() {
    }

    public Kota(String namaKota) {
        this.namaKota = namaKota;
    }
    
    

    public String getNamaKota() {
        return namaKota;
    }

    /**
     * @param namaKota the namaKota to set
     */
    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }
}
