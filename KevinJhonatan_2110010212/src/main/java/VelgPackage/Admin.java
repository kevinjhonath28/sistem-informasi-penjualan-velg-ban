/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class Admin {
    
    private int IdUser;
    private String Status;
    private String Nama;
    private int Telepon;
    private String Email;
    private String Alamat;
    private String UserName;
    private String Password;
    
    public Admin (){ //Constructor
    
    }
    
    //Set Methods
    public void setIdUser(int IdUser){
        this.IdUser = IdUser;
    }
    
    public void setStatus(String Status){
        this.Status = Status;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setTelepon(int Telepon){
        this.Telepon = Telepon;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    //Get Methods
    public int getIdUser(){
        return IdUser;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public int getTelepon(){
        return Telepon;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public String getUserName(){
        return UserName;
    }
    
    public String getPassword(){
        return Password;
    }
}

    
