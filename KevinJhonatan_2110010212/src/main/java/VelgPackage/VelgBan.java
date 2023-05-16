/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class VelgBan {
    
    private int IdVelg;
    private int ItemNo;
    private String Kategori;
    private String NamaBan;
    private String PCD;
    private String Ukuran;
    private int Offset;
    private int Holes;
    private String CB;
    private String Warna;
    private String Stok;
    private int HargaJual;
    private int HargaBeli;
    private String Keterangan;
    
    public VelgBan(){} //Constructor
    
    public void setIdVelg(int IdVelg){
        this.IdVelg = IdVelg;
    }
    
    public void setItemNo(int ItemNo){
        this.ItemNo = ItemNo;
    }
    
    public void setKategori(String Kategori){
        this.Kategori = Kategori;
    }
    
    public void setNamaBan(String NamaBan){
        this.NamaBan = NamaBan;
    }
    
    public void setPCD(String PCD){
        this.PCD = PCD;
    }
    
    public void setUkuran(String Ukuran){
        this.Ukuran = Ukuran;
    }
    
    public void setOffset(int Offset){
        this.Offset = Offset;
    }
    
    public void setHoles(int Holes){
        this.Holes = Holes;
    }
    
    public void setCB(String CB){
        this.CB = CB;
    }
    
    public void setWarna(String Warna){
        this.Warna = Warna;
    }
    
    public void setStok(String Stok){
        this.Stok = Stok;
    }
    
    public void setHargaJual(int HargaJual){
        this.HargaJual = HargaJual;
    }
    
    public void setHargaBeli(int HargaBeli){
        this.HargaBeli = HargaBeli;
    }
    
    public void setKeterangan(String Keterangan){
        this.Keterangan = Keterangan;
    }
    
    //Get Methods
    
    public int getIdVelg(){
        return IdVelg;
    }
    
    public int getItemNo(){
        return ItemNo;
    }
    
    public String getKategori(){
        return Kategori;
    }
    
    public String getNamaBan(){
        return NamaBan;
    }
    
    public String getPCD(){
        return PCD;
    }
    
    public String getUkuran(){
        return Ukuran;
    }
    
    public int getOffset(){
        return Offset;
    }
    
    public int getHoles(){
        return Holes;
    }
    
    public String getCB(){
        return CB;
    }
    
    public String getWarna(){
        return Warna;
    }
    
    public String getStok(){
        return Stok;
    }
    
    public int getHargajual(){
        return HargaJual;
    }
    
    public int getHargaBeli(){
        return HargaBeli;
    }
    
    public String getKeterangan(){
        return Keterangan;
    }
}
