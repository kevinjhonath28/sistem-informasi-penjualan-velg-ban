/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class UserAdminAccess {
    
    private int IdUserAccess;
    private int IdUser;
    private int PenjualanBaru;
    private int PenjualanRetur;
    private int Penyetujuan;
    private int Pembayaran;
    private int PembelianBaru;
    private int PembelianRetur;
    private int PengeluaranKantor;
    
    public UserAdminAccess (){} //Constructor
    
    // Set Methods
    
    public void setIdUserAccess(int IdUserAccess){
        this.IdUserAccess = IdUserAccess;
    } 
    
    public void setIdUser(int IdUser){
        this.IdUser = IdUser;
    }
    
    public void setPenjualanBaru(int PenjualanBaru){
        this.PenjualanBaru = PenjualanBaru;
    }
    
    public void setPenjualanRetur(int PenjualanRetur){
        this.PenjualanRetur = PenjualanRetur;
    }

    public void setPenyetujuan(int Penyetujuan) {
        this.Penyetujuan = Penyetujuan;
    }

    public void setPembayaran(int Pembayaran) {
        this.Pembayaran = Pembayaran;
    }

    public void setPembelianBaru(int PembelianBaru) {
        this.PembelianBaru = PembelianBaru;
    }

    public void setPembelianRetur(int PembelianRetur) {
        this.PembelianRetur = PembelianRetur;
    }

    public void setPengeluaranKantor(int PengeluaranKantor) {
        this.PengeluaranKantor = PengeluaranKantor;
    }
    
    //Get Methods

    public int getIdUserAccess() {
        return IdUserAccess;
    }

    public int getIdUser() {
        return IdUser;
    }

    public int getPenjualanBaru() {
        return PenjualanBaru;
    }

    public int getPenjualanRetur() {
        return PenjualanRetur;
    }

    public int getPenyetujuan() {
        return Penyetujuan;
    }

    public int getPembayaran() {
        return Pembayaran;
    }

    public int getPembelianBaru() {
        return PembelianBaru;
    }

    public int getPembelianRetur() {
        return PembelianRetur;
    }

    public int getPengeluaranKantor() {
        return PengeluaranKantor;
    }
}
