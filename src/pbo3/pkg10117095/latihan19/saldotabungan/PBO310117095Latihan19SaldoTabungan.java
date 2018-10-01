/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117095.latihan19.saldotabungan;

/**
 *
  * @author 
 * Nama      : Alvin Lukman Nulhakim 
 * Kelas     : IF3 
 * NIM       : 10117095 
 * Deskripsi :Program ini berisi program untuk menghitung saldo tabungan pada bulan ke-1 sampai ke-6
 */
public class PBO310117095Latihan19SaldoTabungan {

    public static void main(String[] args) {
     double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 0;
        
        while(lama <=5){
            lama = lama + 1;
            saldoAwal = saldoAwal * bunga + saldoAwal;
            System.out.println("Saldo Bulang ke-"+lama+ " Rp. "+saldoAwal);
            
        }
    }
    
}
