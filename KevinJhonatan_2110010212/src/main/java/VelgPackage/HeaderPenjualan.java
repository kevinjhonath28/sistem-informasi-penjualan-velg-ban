/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class HeaderPenjualan {
   
    private int IdPenjualan;
    private int IdPenjual;
    private int IdCostumer;
    private String TanggalPenjualan;
    private String TanggalJatuhTempo;
    private String Keterangan;
    
    //Constructor
    public HeaderPenjualan ( ){ 
    
    }
    
    //Set Methods
    
    public void setIdPenjualan(int IdPenjualan){
        this.IdPenjualan = IdPenjualan;
    }
    
    public void setIdPenjual(int IdPenjual){
        this.IdPenjual = IdPenjual;
    }
    
    public void setIdCostumer(int IdCostumer){
        this.IdCostumer = IdCostumer;
    }
    
    public void setTanggalPenjualan(String TanggalPenjualan){
        this.TanggalPenjualan = TanggalPenjualan;
    }
    
    public void setTanggalJatuhTempo(String TanggalJatuhTempo){
        this.TanggalJatuhTempo = TanggalJatuhTempo;
    }
    
    public void setKeterangan(String Keterangan){
        this.Keterangan = Keterangan;
    }
    
    //Get Methods
    
    public int getIdPenjualan(){
        return IdPenjualan;
    }
    
    public int getIdPenjual(){
        return IdPenjual;
    }
    
    public int getIdCostumer(){
        return IdCostumer;
    }
    
    public String getTanggalPenjualan(){
        return TanggalPenjualan;
    }
    
    public String getTanggalJatuhTempo(){
        return TanggalJatuhTempo;
    }
    
    public String getKeterangan(){
        return Keterangan;
    }
}
