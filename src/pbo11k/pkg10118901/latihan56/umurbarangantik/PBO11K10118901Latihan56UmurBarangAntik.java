/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan56.umurbarangantik;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan umur barang antik konsep pewarisan class
 */
public class PBO11K10118901Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang Antik : "+r.getName());
        r.tampilUmur();
        
    }
    
}
