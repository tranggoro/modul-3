/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author trian
 */
import java.util.Scanner;
public class datamhsmain {
    public static void main(String[] args){
        String tanya;
        int pilihan;
        do{
        dataku data = new dataku();
        
        System.out.println("=======================");
        System.out.println("Inputtan Data Mahasiswa");
        System.out.println("-----------------------");
        
        Scanner input=new Scanner (System.in);
      
        System.out.print("Masukkan NIM Anda: ");
        data.nim=input.nextLine();
        System.out.print("Masukkan Nama Anda: ");
        data.nama=input.nextLine();
        System.out.print("Masukkan Alamat Anda: ");
        data.alamat=input.nextLine();
        
        System.out.println("");
        System.out.println("Pilihan Jurusan");
        System.out.println("1. 61=Matematika");
        System.out.println("2. 62=Bologi");
        System.out.println("3. 63=Kimia");
        System.out.println("4. 64=Fisika");
        System.out.println("5. 65=Teknik Informatika");
        System.out.println("6. 66=Sistem Informasi");

        System.out.print("Jurusan Mana Anda Pilih?? ");
        
        pilihan=input.nextInt();
        switch (pilihan){
            case 1:
                data.jurusan="Matematika";
                break;
            
            case 2:
                data.jurusan="Biologi";
                break;
            
            case 3:
                data.jurusan="Kimia";
                break;
                
            case 4:
                data.jurusan="Fisika";
                break;
                
            case 5:
                data.jurusan="Teknik Informatika";
                break;
                
            case 6:
                data.jurusan="Sistem Informssi";
                break;
            default:
                data.jurusan="Anda Salah Memasukkan Pilihan";
                return;
        
        }
        System.out.println("");
        System.out.println("<<<<<<<<>>>>>>>>");
        System.out.println("Data Mahasiswa");
        System.out.println("~~~~~~");
        System.out.println("NIM     :"+data.nim);
        System.out.println("Nama    :"+data.nama);
        System.out.println("Alamat  :"+data.alamat);
        System.out.println("Jurusan :"+data.jurusan);
        
        
        System.out.print("Apakah Anda Ingin Mengulangi Lagi (y/n)?? ");
        Scanner pilih=new Scanner(System.in);
        tanya=pilih.next();
        switch (tanya){
            
            case"y":
                break;
            case"n":
        }
    
    }
    while (tanya.equals("y"));
    System.out.println("~~~~~~~~~~");
    System.out.println("Terima Kasih Telah Mengisi");
    System.out.println("**********");
    }
    
}