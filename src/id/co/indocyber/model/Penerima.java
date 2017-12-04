/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import id.co.indocyber.dao.KotaDanTarifDAO;

/**
 *
 * @author user
 */
public class Penerima {
    KotaDanTarifDAO kdtd = new KotaDanTarifDAO();
    private String namaPenerima;
    private String alamatPenerima;
    private String kotaPenerima;
    private String kodeposPenerima;
    private String provinsiPenerima;
    private String teleponPenerima;
    

    public Penerima() {
    }

    public Penerima(String namaPenerima, String alamatPenerima, String kotaPenerima, String kodeposPenerima, String provinsiPenerima, String teleponPenerima) {
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.kotaPenerima = kotaPenerima;
        this.kodeposPenerima = kodeposPenerima;
        this.provinsiPenerima = provinsiPenerima;
        this.teleponPenerima = teleponPenerima;
    }
    
    

    
    /**
     * @return the namaPenerima
     */
    public String getNamaPenerima() {
        return namaPenerima;
    }

    /**
     * @param namaPenerima the namaPenerima to set
     */
    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }


    /**
     * @return the alamatPenerima
     */
    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    /**
     * @param alamatPenerima the alamatPenerima to set
     */
    public void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    /**
     * @return the kotaPenerima
     */
    public String getKotaPenerima() {
        return kotaPenerima;
    }

    /**
     * @param kotaPenerima the kotaPenerima to set
     */
    public void setKotaPenerima(String kotaPenerima) {
        this.kotaPenerima = kotaPenerima;
    }

    /**
     * @return the kodeposPenerima
     */
    public String getKodeposPenerima() {
        return kodeposPenerima;
    }

    /**
     * @param kodeposPenerima the kodeposPenerima to set
     */
    public void setKodeposPenerima(String kodeposPenerima) {
        this.kodeposPenerima = kodeposPenerima;
    }

    /**
     * @return the provinsiPenerima
     */
    public String getProvinsiPenerima() {
        return provinsiPenerima;
    }

    /**
     * @param provinsiPenerima the provinsiPenerima to set
     */
    public void setProvinsiPenerima(String provinsiPenerima) {
        this.provinsiPenerima = provinsiPenerima;
    }

    /**
     * @return the teleponPenerima
     */
    public String getTeleponPenerima() {
        return teleponPenerima;
    }

    /**
     * @param teleponPenerima the teleponPenerima to set
     */
    public void setTeleponPenerima(String teleponPenerima) {
        this.teleponPenerima = teleponPenerima;
    }
}
