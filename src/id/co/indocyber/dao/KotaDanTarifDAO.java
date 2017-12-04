/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.dao;

import id.co.indocyber.model.Kota;
import id.co.indocyber.model.Pengirim;
import id.co.indocyber.model.Pengiriman;
import id.co.indocyber.model.Tarif;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class KotaDanTarifDAO {    
    private List <Tarif> kumpulan = new ArrayList<>();
    private List<String> kumpulanKota = new ArrayList<>();
    private Set <String> kumpulanProvinsi = new HashSet<>();
    private String provinsi;
    private String kota;
    private double reguler;
    private double tds;
    private double sds;
    private double ons;
    private double hds;
    private double hargaPaket;
    private double hargaDikaliBarang;
    private double hargaSetelahAsuransi;
 
    
    public void seluruhPerhitungan(){
        try {
            Scanner scan = new Scanner(new File("C:/Users/user/Documents/NetBeansProjects/AplikasiPengirimanPaket/daftarTarifKota.txt"));
            
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] data = line.split(",");
                setProvinsi(data[0].trim());
                setKota(data[1].trim());
                setReguler(Double.parseDouble(data[2].trim()));
                setTds(Double.parseDouble(data[3].trim()));
                setOns(Double.parseDouble(data[4].trim()));
                setSds(Double.parseDouble(data[5].trim()));
                setHds(Double.parseDouble(data[6].trim()));
                Tarif tarif = new Tarif(provinsi, kota, reguler, tds, ons, sds, hds);
                
                getKumpulan().add(tarif);
            }   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KotaDanTarifDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void seluruhProvinsi(){
        try {
            Scanner scan = new Scanner(new File("C:/Users/user/Documents/NetBeansProjects/AplikasiPengirimanPaket/daftarTarifKota.txt"));
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] data = line.split(",");
                String provinsi = (data[0].trim());
                getKumpulanProvinsi().add(provinsi);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KotaDanTarifDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[] seluruhKota(String provinsiX){
        String[] arrayKota = {};
        try {
            Scanner scan = new Scanner(new File("C:/Users/user/Documents/NetBeansProjects/AplikasiPengirimanPaket/daftarTarifKota.txt"));
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] data = line.split(",");
                String provinsi1 = (data[0].trim());
                if(provinsiX.equalsIgnoreCase(provinsi1)){
                String kota = (data[1].trim());
                getKumpulanKota().add(kota);}
            }
            for (String kumpulan : getKumpulanKota()) {
                arrayKota = getKumpulanKota().toArray(new String[getKumpulanKota().size()]);
                return arrayKota;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KotaDanTarifDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayKota;
        
    }
    

    /**
     * @return the kumpulan
     */
    public List <Tarif> getKumpulan() {
        return kumpulan;
    }

    /**
     * @param kumpulan the kumpulan to set
     */
    public void setKumpulan(List <Tarif> kumpulan) {
        this.kumpulan = kumpulan;
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
    public void setHargaDikaliBarang(double hargaDikaliBarang) {
        this.hargaDikaliBarang = hargaDikaliBarang;
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
    public void setHargaSetelahAsuransi(double hargaSetelahAsuransi) {
        this.hargaSetelahAsuransi = hargaSetelahAsuransi;
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
     * @return the reguler
     */
    public double getReguler() {
        return reguler;
    }

    /**
     * @param reguler the reguler to set
     */
    public void setReguler(double reguler) {
        this.reguler = reguler;
    }

    /**
     * @return the tds
     */
    public double getTds() {
        return tds;
    }

    /**
     * @param tds the tds to set
     */
    public void setTds(double tds) {
        this.tds = tds;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the ons
     */
    public double getOns() {
        return ons;
    }

    /**
     * @param ons the ons to set
     */
    public void setOns(double ons) {
        this.ons = ons;
    }

    /**
     * @return the hds
     */
    public double getHds() {
        return hds;
    }

    /**
     * @param hds the hds to set
     */
    public void setHds(double hds) {
        this.hds = hds;
    }

    /**
     * @return the kumpulanProvinsi
     */
    public Set <String> getKumpulanProvinsi() {
        return kumpulanProvinsi;
    }

    /**
     * @param kumpulanProvinsi the kumpulanProvinsi to set
     */
    public void setKumpulanProvinsi(Set <String> kumpulanProvinsi) {
        this.kumpulanProvinsi = kumpulanProvinsi;
    }

    /**
     * @return the kumpulanKota
     */
    public List<String> getKumpulanKota() {
        return kumpulanKota;
    }

    /**
     * @param kumpulanKota the kumpulanKota to set
     */
    public void setKumpulanKota(List<String> kumpulanKota) {
        this.kumpulanKota = kumpulanKota;
    }
}
