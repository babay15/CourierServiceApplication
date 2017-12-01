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
public class Tarif {
    private String provinsi;
    private String kota;
    private double tarifReguler;
    private double tarifTDS;
    private double tarifONS;
    private double tarifSDS;
    private double tarifHDS;

    public Tarif() {
    }

    
    
    
    public Tarif(String provinsi, String kota, double tarifReguler, double tarifTDS, double tarifONS, double tarifSDS, double tarifHDS) {
        this.provinsi = provinsi;
        this.kota = kota;
        this.tarifReguler = tarifReguler;
        this.tarifTDS = tarifTDS;
        this.tarifONS = tarifONS;
        this.tarifSDS = tarifSDS;
        this.tarifHDS = tarifHDS;
    }

    
    
    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the tarifReguler
     */
    public double getTarifReguler() {
        return tarifReguler;
    }

    /**
     * @param tarifReguler the tarifReguler to set
     */
    public void setTarifReguler(double tarifReguler) {
        this.tarifReguler = tarifReguler;
    }

    /**
     * @return the tarifTDS
     */
    public double getTarifTDS() {
        return tarifTDS;
    }

    /**
     * @param tarifTDS the tarifTDS to set
     */
    public void setTarifTDS(double tarifTDS) {
        this.tarifTDS = tarifTDS;
    }

    /**
     * @return the tarifONS
     */
    public double getTarifONS() {
        return tarifONS;
    }

    /**
     * @param tarifONS the tarifONS to set
     */
    public void setTarifONS(double tarifONS) {
        this.tarifONS = tarifONS;
    }

    /**
     * @return the tarifSDS
     */
    public double getTarifSDS() {
        return tarifSDS;
    }

    /**
     * @param tarifSDS the tarifSDS to set
     */
    public void setTarifSDS(double tarifSDS) {
        this.tarifSDS = tarifSDS;
    }

    /**
     * @return the tarifHDS
     */
    public double getTarifHDS() {
        return tarifHDS;
    }

    /**
     * @param tarifHDS the tarifHDS to set
     */
    public void setTarifHDS(double tarifHDS) {
        this.tarifHDS = tarifHDS;
    }
}
