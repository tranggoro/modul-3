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
public class univkumain {
    public static void main(String[] args){
    
        System.out.println("================================================");
        System.out.println("Nama Universitas di Setiap Daerah di Jawa Timur ");
        System.out.println("------------------------------------------------");
        
        
        univku.setnama("Universitas Trunojoyo Madura");
        System.out.println("1. UTM => "+univku.getnama());
        
        
        univku.setnama("Universitas Negeri Surabaya");
        System.out.println("2. UNESA => "+univku.getnama());
        
        
        univku.setnama("Universitas Negeri Malang");
        System.out.println("3. UM => "+univku.getnama());
        
        
        univku.setnama("Universitas Negeri Jember");
        System.out.println("4. UJ => "+univku.getnama());
        
        System.out.println("================================================");
        
    }
    
}