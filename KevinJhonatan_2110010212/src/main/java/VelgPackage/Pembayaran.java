/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class Pembayaran {
    
    private int IdPembayaran;
    private int IdPenyetujuan;
    private int IdPenerimaBayar;
    private int IdCostumer;
    private String CaraPembayaran;
    private int TotalBayar;
    private String Tanggal;
    
    public Pembayaran(){} //Constructor

    //Set Methods
    
    public void setIdPembayaran(int IdPembayaran) {
        this.IdPembayaran = IdPembayaran;
    }

    public void setIdPenyetujuan(int IdPenyetujuan) {
        this.IdPenyetujuan = IdPenyetujuan;
    }

    public void setIdPenerimaBayar(int IdPenerimaBayar) {
        this.IdPenerimaBayar = IdPenerimaBayar;
    }

    public void setIdCostumer(int IdCostumer) {
        this.IdCostumer = IdCostumer;
    }

    public void setCaraPembayaran(String CaraPembayaran) {
        this.CaraPembayaran = CaraPembayaran;
    }

    public void setTotalBayar(int TotalBayar) {
        this.TotalBayar = TotalBayar;
    }

    public void setTanggal(String Tanggal) {
        this.Tanggal = Tanggal;
    }
    
    //Get Methods

    public int getIdPembayaran() {
        return IdPembayaran;
    }

    public int getIdPenyetujuan() {
        return IdPenyetujuan;
    }

    public int getIdPenerimaBayar() {
        return IdPenerimaBayar;
    }

    public int getIdCostumer() {
        return IdCostumer;
    }

    public String getCaraPembayaran() {
        return CaraPembayaran;
    }

    public int getTotalBayar() {
        return TotalBayar;
    }

    public String getTanggal() {
        return Tanggal;
    }
}
