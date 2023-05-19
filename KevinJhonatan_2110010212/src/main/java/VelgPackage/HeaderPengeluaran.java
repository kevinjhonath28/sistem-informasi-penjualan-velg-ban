/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class HeaderPengeluaran {
    
    private int IdPengeluaran;
    private int IdPenyetuju;
    private String Tanggal;
    
    public HeaderPengeluaran(){} //Constructor
    
    //Set Methods

    public void setIdPengeluaran(int IdPengeluaran) {
        this.IdPengeluaran = IdPengeluaran;
    }

    public void setIdPenyetuju(int IdPenyetuju) {
        this.IdPenyetuju = IdPenyetuju;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    //Get Methods

    public int getIdPengeluaran() {
        return IdPengeluaran;
    }

    public int getIdPenyetuju() {
        return IdPenyetuju;
    }

    public String getTanggal() {
        return Tanggal;
    }
}
