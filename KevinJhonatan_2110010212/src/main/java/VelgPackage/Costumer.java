/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class Costumer {
    
    private int IdCostumer;
    private String NamaToko;
    private String NamaPemilik;
    private String Telepon;
    private String Email;
    private String Alamat;
    private int KreditLimit;
    private int TotalKredit;
    private int BlackList;
    
    public Costumer(){} //Constructor
    
    //Set Methods
    
    public void setIdCostumer(int IdCostumer){
        this.IdCostumer = IdCostumer;
    }
    
    public void setNamaToko(String NamaToko){
        this.NamaToko = NamaToko;
    }
    
    public void setNamaPemilik(String NamaPemilik){
        this.NamaPemilik = NamaPemilik;
    }
    
    public void setTelepon(String Telepon){
        this.Telepon = Telepon;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public void setKreditLimit(int KreditLimit){
        this.KreditLimit = KreditLimit;
    }
    
    public void setTotalKredit(int TotalKredit){
        this.TotalKredit = TotalKredit;
    }
    
    public void setBlackList(int BlackList){
        this.BlackList = BlackList;
    }
    
    //Get Methods

    public int getIdCostumer() {
        return IdCostumer;
    }

    public String getNamaToko() {
        return NamaToko;
    }

    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public String getTelepon() {
        return Telepon;
    }

    public String getEmail() {
        return Email;
    }

    public String getAlamat() {
        return Alamat;
    }

    public int getKreditLimit() {
        return KreditLimit;
    }

    public int getTotalKredit() {
        return TotalKredit;
    }

    public int getBlackList() {
        return BlackList;
    }
}
