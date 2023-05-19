/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class DetailPenjualan {
 
    private int IdPenjualan;
    private int IdVelg;
    private int Jumlah;
    private int Harga;
    private int Diskon;

    public DetailPenjualan(){}  //Constructor

//Set Methods

    public void setIdPenjualan(int IdPenjualan){
        this.IdPenjualan = IdPenjualan;
    }

    public void setIdVelg(int IdVelg){
        this.IdVelg = IdVelg;
    }

    public void setJumlah(int Jumlah){
        this.Jumlah = Jumlah; 
    }

    public void setHarga(int Harga){
        this.Harga = Harga;
    }

    public void setDiskon(int Diskon){
        this.Diskon = Diskon;
    }

//Get methods

    public int getIdPenjualan(){
        return IdPenjualan;
    }

    public int getIdVelg(){
        return IdVelg;
    }

    public int getJumlah(){
        return Jumlah;
    }
    
    public int getHarga(){
        return Harga;
    }
    
    public int getDiskon(){
        return Diskon;
    }
}
