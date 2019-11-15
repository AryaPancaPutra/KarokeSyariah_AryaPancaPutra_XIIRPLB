/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karokesyariah_aryapancaputra_xiirplb;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL08
 */
public class KarokeSyariah_AryaPancaPutra_XIIRPLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double diskon1 = 11.11/100*55000;
        double diskon2 = 11.11/100*70000;
        double diskon3 = 11.11/100*120000;
        double diskon4 = 11.11/100*150000;
        
        double ds;

        
        String nama;
        int room_aryap, jam_aryap, harga_aryap, total_aryap;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===============================================");
        System.out.println("List Room :");
        System.out.println("1. Room Small, Harga Rp.55000/jam");
        System.out.println("2. Room Medium, Harga Rp.70000/jam");
        System.out.println("3. Room Large, Harga Rp.120000/jam");
        System.out.println("4. Family Room, Harga Rp.150000/jam");
        System.out.println("Bookin lebih dari 3 jam dapat diskon 11.11%");
        System.out.println("===============================================");
        
        System.out.println("Pilih Room : ");
        room_aryap = sc.nextInt();
        if (room_aryap == 1) {
            System.out.println("Anda memilih Room Small");
            System.out.println("Masukkan nama anda : ");
            nama = sc.next();
            System.out.println("Booking berapa jam ?");
            jam_aryap = sc.nextInt();
            if (jam_aryap > 3) {
                System.out.println("nama : " + nama);
                System.out.println("Room : Small");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Selamat" + nama +", anda mendapatkan diskon 11.11%");
                total_aryap = 55000*jam_aryap;
                ds = total_aryap-diskon1;
                System.out.println("Total Bayar = Rp." + ds );
                
            } else{
                System.out.println("nama : " + nama);
                System.out.println("Room Small");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Total bayar Rp." + 55000*jam_aryap);
            }
            
        } else if(room_aryap == 2){
            System.out.println("Anda memilih Room Medium");
            System.out.println("Masukkan nama anda : ");
            nama = sc.next();
            System.out.println("Booking berapa jam ?");
            jam_aryap = sc.nextInt();
            if (jam_aryap > 3) {
                System.out.println("nama : " + nama);
                System.out.println("Room : Medium");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Selamat" + nama +", anda mendapatkan diskon 11.11%");
                total_aryap = 70000*jam_aryap;
                ds = total_aryap-diskon2;
                System.out.println("Total Bayar = Rp." + ds );
                
            } else{
                System.out.println("nama : " + nama);
                System.out.println("Room Medium");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Total bayar Rp." + 70000*jam_aryap);
            }
            
        } else if(room_aryap == 3){
            System.out.println("Anda memilih Room Large");
            System.out.println("Masukkan nama anda : ");
            nama = sc.next();
            System.out.println("Booking berapa jam ?");
            jam_aryap = sc.nextInt();
            if (jam_aryap > 3) {
                System.out.println("nama : " + nama);
                System.out.println("Room : Small");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Selamat" + nama +", anda mendapatkan diskon 11.11%");
                total_aryap = 120000*jam_aryap;
                ds = total_aryap-diskon3;
                System.out.println("Total Bayar = Rp." + ds );
                
            } else{
                System.out.println("nama : " + nama);
                System.out.println("Room Large");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Total bayar Rp." + 120000*jam_aryap);
            }
            
        } else if(room_aryap == 4){
            System.out.println("Anda memilih Family Room");
            System.out.println("Masukkan nama anda : ");
            nama = sc.next();
            System.out.println("Booking berapa jam ?");
            jam_aryap = sc.nextInt();
            if (jam_aryap > 3) {
                System.out.println("nama : " + nama);
                System.out.println("Room : Family");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Selamat" + nama +", anda mendapatkan diskon 11.11%");
                total_aryap = 150000*jam_aryap;
                ds = total_aryap-diskon4;
                System.out.println("Total Bayar = Rp." + ds );
                
            } else{
                System.out.println("nama : " + nama);
                System.out.println("Family Room");
                System.out.println("Lama booking : " + jam_aryap);
                System.out.println("Total bayar Rp." + 150000*jam_aryap);
            }
        }
    }
        
    }
    
