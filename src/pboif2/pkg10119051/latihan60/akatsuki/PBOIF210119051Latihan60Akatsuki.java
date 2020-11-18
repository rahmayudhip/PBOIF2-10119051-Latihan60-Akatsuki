/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program menampilkan anggota Akatsuki berdasarkan desanya
 */
public class PBOIF210119051Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Akatsuki akatsuki = new Akatsuki();
        
        System.out.println("===Tokoh Akatsuki Berdasarkan Desa/Asal===");
        akatsuki.tampilDaftarDesa();
        akatsuki.setDesa(sc.nextInt());
        
        System.out.println("");
        
        akatsuki.tampilAnggotaDesa(akatsuki.getDesa());
    }
        
 }
    

