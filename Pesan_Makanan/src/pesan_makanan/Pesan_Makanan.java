
package pesan_makanan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pesan_Makanan {
    public static void main(String[] args) {

        int a = 0;     
        int bayar = 0;  

        System.out.println("   SELAMAT DATANG  ");      //menampilkan
        System.out.println(" __________________");      //menampilkan
        System.out.println("|Pemesanan Makanan|");     //Judul
        System.out.println(".-----------------.");     //makanan
        System.out.println("|1. Nasi Goreng   |");     //Nasi goreng
        System.out.println("|2. Seblak Jamur  |");     //Seblak jamur
        System.out.println("|3. Es Kepal      |");     //Es kepal
        System.out.println("|4. Telor itik    |");     //Telor Itik
        System.out.println("|_________________|");
        System.out.println("");

      
        for(String b = "y"; b.equals("y") || b.equals("Y");){

        Scanner makanan = new Scanner(System.in);   //scanner
        Scanner makanan2 = new Scanner (System.in); //scanner
       
        System.out.print("pesanan : ");        //untuk menginput pilihan menu
        a = makanan.nextInt();

       
        if(a == 1){
            System.out.println("Nasi Goreng    : 10000");
            bayar = bayar + 100000;
        }else if(a==2){
            System.out.println("Seblak Jamur   : 10000");
            bayar = bayar + 10000;
        }else if(a==3){
            System.out.println("Es kepal       : 15000");
            bayar = bayar + 15000;
            }else if(a==4){
            System.out.println("Telor itik     : 10000");
            bayar = bayar + 10000;
        }else{
            System.out.println("Maaf Menu Kami Hanya Ada 4, Terimakasih");
       
        }

        System.out.print("Input lagi? (Y/T) "); 
      
        b = makanan.next();

        }

        System.out.println("Total Harga = Rp."+bayar);      //menampilkan total harga menu yg dipilih

    }
 }