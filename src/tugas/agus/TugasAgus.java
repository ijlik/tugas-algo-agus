/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.agus;

import java.util.Scanner;

/**
 *
 * @author r-ijlik
 */
public class TugasAgus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hari;
        int dewasa, anak, tiketDewasa, tiketAnak, diskon = 0, total, diskonAnak = 0;
        
        System.out.print("Masukan Hari : ");
        hari = sc.next();
        System.out.print("Dewasa : ");
        dewasa = sc.nextInt();
        System.out.print("Anak - anak : ");
        anak = sc.nextInt();
        
        switch(hari){
            case "minggu":
                tiketDewasa = 35000;
                tiketAnak = 20000;
                if ((dewasa + anak) > 5) {
                    diskon = 10000;
                }
                if ((dewasa + anak) > 10 && anak != 0){
                    diskonAnak = 5000;
                }
                total = (dewasa * tiketDewasa) + (anak * (tiketAnak - diskonAnak)) - diskon;
                break;
            default:
                tiketDewasa = 25000;
                tiketAnak = 15000;
                if ((dewasa + anak) > 10) {
                    diskon = 5000;
                }
                total = (dewasa * (tiketDewasa - diskon)) + ((anak * (tiketAnak - diskon)));
                break;
        }
        System.out.println("Sekarang hari "+hari+"\nJumlah Dewasa : "+dewasa+"\nJumlah Anak-anak : "+anak+"\n\nTotal harga = "+total);
    }
    
}
