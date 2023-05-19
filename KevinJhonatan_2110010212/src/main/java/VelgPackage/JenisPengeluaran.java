/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VelgPackage;

/**
 *
 * @author jvm21
 */
public class JenisPengeluaran {
    
    private String JenisPengeluaran;
    private String JenisModul;
    
    public JenisPengeluaran(){} //Constructor

    //Set Methods
    
    public void setJenisPengeluaran(String JenisPengeluaran) {
        this.JenisPengeluaran = JenisPengeluaran;
    }

    public void setJenisModul(String JenisModul) {
        this.JenisModul = JenisModul;
    }
    
    //Get Methods

    public String getJenisPengeluaran() {
        return JenisPengeluaran;
    }

    public String getJenisModul() {
        return JenisModul;
    }
}
