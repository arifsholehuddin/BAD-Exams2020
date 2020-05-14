/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexams;

/**
 *
 * @author Arif Sholehuddin
 */
public class DataModel {
    private String kd_barang, nm_barang, satuan, qty;
    
    public DataModel(String kd_barang, String nm_barang, String satuan, String qty){
        this.kd_barang = kd_barang;
        this.nm_barang = nm_barang;
        this.satuan = satuan;
        this.qty = qty;
    }
    
    public String GetKdBarang(){
        return kd_barang;
    }
    
    public String GetNmBarang(){
        return nm_barang;
    }
    
    public String GetSatuan(){
        return satuan;
    }
    
    public String GetQty(){
        return qty;
    }
}
