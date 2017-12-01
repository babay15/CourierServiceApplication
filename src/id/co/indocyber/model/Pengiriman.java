/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import id.co.indocyber.dao.KotaDanTarifDAO;
import java.util.Date;

/**
 *
 * @author user
 */
public class Pengiriman {
    KotaDanTarifDAO kdtd = new KotaDanTarifDAO();
    private String nomorPaket;
    private String kotaTujuan;
    private String jenisBarang;
    private int beratBerang;
    private Date tanggalKirim;
    private double panjang;
    private double lebar;
    private double tinggi;
    private String paket;
    private boolean asuransi;
    private double hargaBarang = 0;
    private String pembayaran;
    private double hargaPaket;
    private double hargaDikaliBarang;
    private double hargaSetelahAsuransi;
    private double dimensi;
    private double nilaiAsuransi;
    
    public void getHargaPaketReguler(){
    kdtd.seluruhPerhitungan();
    
        for (Tarif tarif : kdtd.getKumpulan()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKota())){
                setHargaPaket(tarif.getTarifReguler());
            }
        }
    }
    
    public void getHargaPaketTDS(){
    kdtd.seluruhPerhitungan();
    
        for (Tarif tarif : kdtd.getKumpulan()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKota())){
                setHargaPaket(tarif.getTarifTDS());
            }
        }
    }

    public void getHargaPaketSDS(){
    kdtd.seluruhPerhitungan();
    
        for (Tarif tarif : kdtd.getKumpulan()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKota())){
                setHargaPaket(tarif.getTarifSDS());
            }
        }
    }

    public void getHargaPaketONS(){
    kdtd.seluruhPerhitungan();
    
        for (Tarif tarif : kdtd.getKumpulan()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKota())){
                setHargaPaket(tarif.getTarifONS());
            }
        }
    }    
    
    public void getHargaPaketHDS(){
    kdtd.seluruhPerhitungan();
    
        for (Tarif tarif : kdtd.getKumpulan()) {
            if(this.getKotaTujuan().equalsIgnoreCase(tarif.getKota())){
                setHargaPaket(tarif.getTarifHDS());
            }
        }
    }
        
    

    /**
     * @return the nomorPaket
     */
    public String getNomorPaket() {
        return nomorPaket;
    }

    /**
     * @param nomorPaket the nomorPaket to set
     */
    public void setNomorPaket(String nomorPaket) {
        this.nomorPaket = nomorPaket;
    }

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @return the beratBerang
     */
    public int getBeratBerang() {
        return beratBerang;
    }

    /**
     * @param beratBerang the beratBerang to set
     */
    public void setBeratBerang(int beratBerang) {
        this.beratBerang = beratBerang;
    }

    /**
     * @return the tanggalKirim
     */
    public Date getTanggalKirim() {
        return tanggalKirim;
    }

    /**
     * @param tanggalKirim the tanggalKirim to set
     */
    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the paket
     */
    public String getPaket() {
        return paket;
    }

    /**
     * @param paket the paket to set
     */
    public void setPaket(String paket) {
        this.paket = paket;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the hargaPaket
     */
    public double getHargaPaket() {
        return hargaPaket;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    /**
     * @return the hargaDikaliBarang
     */
    public double getHargaDikaliBarang() {
        return hargaDikaliBarang;
    }

    /**
     * @param hargaDikaliBarang the hargaDikaliBarang to set
     */
    public void setHargaDikaliBarang() {
        this.hargaDikaliBarang = hargaPaket * beratBerang;
    }

    /**
     * @return the hargaSetelahAsuransi
     */
    public double getHargaSetelahAsuransi() {
        return hargaSetelahAsuransi;
    }

    /**
     * @param hargaSetelahAsuransi the hargaSetelahAsuransi to set
     */
    public void setHargaSetelahAsuransi() {
        if(this.asuransi==true){
        this.hargaSetelahAsuransi = hargaDikaliBarang + (getNilaiAsuransi());}
        else if(this.asuransi==false){
        this.hargaSetelahAsuransi = hargaDikaliBarang;
        }
    }

    /**
     * @return the dimensi
     */
    public double getDimensi() {
        return dimensi;
    }

    /**
     * @param dimensi the dimensi to set
     */
    public void setDimensi() {
        this.dimensi = getPanjang() * getLebar() * getTinggi();
    }

    /**
     * @return the nilaiAsuransi
     */
    public double getNilaiAsuransi() {
        return nilaiAsuransi;
    }

    /**
     * @param nilaiAsuransi the nilaiAsuransi to set
     */
    public void setNilaiAsuransi() {
        if (this.asuransi==true){
        this.nilaiAsuransi = getHargaBarang() * 0.05;}
        else if(this.asuransi==false){
        this.nilaiAsuransi = 0.0;
        }
    }
}
