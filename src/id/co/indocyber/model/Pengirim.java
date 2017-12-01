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
public class Pengirim {
    private String namaPengirim;
    private String alamatPengirim;
    private String kotaPengirim;
    private String kodeposPengirim;
    private String provinsiPengirim;
    private String teleponPengirim;

    public Pengirim() {
    }

    public Pengirim(String namaPengirim, String alamatPengirim, String kotaPengirim, String kodeposPengirim, String provinsiPengirim, String telepon) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.kotaPengirim = kotaPengirim;
        this.kodeposPengirim = kodeposPengirim;
        this.provinsiPengirim = provinsiPengirim;
        this.teleponPengirim = telepon;
    }
    
    

    /**
     * @return the namaPengirim
     */
    public String getNamaPengirim() {
        return namaPengirim;
    }

    /**
     * @param namaPengirim the namaPengirim to set
     */
    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    /**
     * @return the alamatPengirim
     */
    public String getAlamatPengirim() {
        return alamatPengirim;
    }

    /**
     * @param alamatPengirim the alamatPengirim to set
     */
    public void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }

    /**
     * @return the kotaPengirim
     */
    public String getKotaPengirim() {
        return kotaPengirim;
    }

    /**
     * @param kotaPengirim the kotaPengirim to set
     */
    public void setKotaPengirim(String kotaPengirim) {
        this.kotaPengirim = kotaPengirim;
    }

    /**
     * @return the kodeposPengirim
     */
    public String getKodeposPengirim() {
        return kodeposPengirim;
    }

    /**
     * @param kodeposPengirim the kodeposPengirim to set
     */
    public void setKodeposPengirim(String kodeposPengirim) {
        this.kodeposPengirim = kodeposPengirim;
    }

    /**
     * @return the provinsiPengirim
     */
    public String getProvinsiPengirim() {
        return provinsiPengirim;
    }

    /**
     * @param provinsiPengirim the provinsiPengirim to set
     */
    public void setProvinsiPengirim(String provinsiPengirim) {
        this.provinsiPengirim = provinsiPengirim;
    }

    /**
     * @return the telepon
     */
    public String getTeleponPengirim() {
        return teleponPengirim;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTeleponPengirim(String telepon) {
        this.teleponPengirim = telepon;
    }
}
