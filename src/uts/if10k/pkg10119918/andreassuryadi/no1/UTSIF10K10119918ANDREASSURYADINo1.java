/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119918.andreassuryadi.no1;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan keterangan 
 * berdasarkan umur
 * 
 */

public class UTSIF10K10119918ANDREASSURYADINo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        Age age = new Age(date.getYear() + 1900);
        
        int yearBirth;
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        yearBirth = scanner.nextInt();
        
        age.setYearBirth(yearBirth);
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu hari ini adalah " + age.hitungUmur());
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
