/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class DetailPengeluaran {
    
    private int IdDetailPengeluaran;
    private int IdPengeluaran;
    private int IdKaryawanMengeluarkan;
    private String JenisPengeluaran;
    private String Keterangan;
    private int JumlahRP;
    
    public DetailPengeluaran(){} //Cosntructor

    //Set Methods
    
    public void setIdDetailPengeluaran(int IdDetailPengeluaran) {
        this.IdDetailPengeluaran = IdDetailPengeluaran;
    }

    public void setIdPengeluaran(int IdPengeluaran) {
        this.IdPengeluaran = IdPengeluaran;
    }

    public void setIdKaryawanMengeluarkan(int IdKaryawanMengeluarkan) {
        this.IdKaryawanMengeluarkan = IdKaryawanMengeluarkan;
    }

    public void setJenisPengeluaran(String JenisPengeluaran) {
        this.JenisPengeluaran = JenisPengeluaran;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public void setJumlahRP(int JumlahRP) {
        this.JumlahRP = JumlahRP;
    }
   
    //Get Methods

    public int getIdDetailPengeluaran() {
        return IdDetailPengeluaran;
    }

    public int getIdPengeluaran() {
        return IdPengeluaran;
    }

    public int getIdKaryawanMengeluarkan() {
        return IdKaryawanMengeluarkan;
    }

    public String getJenisPengeluaran() {
        return JenisPengeluaran;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public int getJumlahRP() {
        return JumlahRP;
    }
}
