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
public class dataku extends datamhs {
    String jurusan;
    
    public dataku(String nim, String nama, String alamat,String jurusan){
        super(nim,nama,alamat);
        this.jurusan = jurusan;
    
    }
    dataku(){
    }
}