/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.app;

import id.co.indocyber.dao.KotaDanTarifDAO;
import id.co.indocyber.model.Pengiriman;
import id.co.indocyber.model.Tarif;
import java.util.List;

/**
 *
 * @author user
 */
public class Testing {
    Tarif tarif;
    List<Tarif> kumpulan;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KotaDanTarifDAO kdtd = new KotaDanTarifDAO();
        kdtd.seluruhPerhitungan();
        
        for (Tarif tarif1 : kdtd.getKumpulan()) {
            if(tarif1.getProvinsi().equalsIgnoreCase("Banten")){
            System.out.println(tarif1.getKota());}
            else if(tarif1.getProvinsi().equalsIgnoreCase("Banten")){
                System.out.println(tarif1.getKota());
            }
        }
        
        
        
        
        




    }
    
}
