/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalsatu.newpackage;

/**
 *
 * @author Mus
 */
public class SOAL1 {
    
    private String nama;
    private int id;
    private String jurusan;
    private String posisi;
    
    
        public SOAL1 (String nama, int id, String jurusan, String posisi) {
            this.nama = nama;
            this.id = id;
            this.jurusan = jurusan;
            this.posisi = posisi;
        }
        
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public String getjurusan(){
        return jurusan;
    }
    
    public void setjurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public String getposisi(){
        return posisi;
    }
    
    public void setposisi(String posisi){
        this.posisi = posisi;
    }
    
    public String toString(){
        return String.format("data : %s %s %s %s",nama,id,jurusan,posisi );
    }

    public static void main (String[] args){
      karyawan pertama = new karyawan ("Susan Meyers", 47899, "Marketing", "Sales Rep");
      karyawan kedua = new karyawan ("Mark Jones", 39119, "IT", "Progammer");
      karyawan ketiga = new karyawan ("Joy Rogers", 81774, "Manufacturing", "Engineer");
      System.out.println(pertama);
      System.out.println(kedua);
      System.out.println(ketiga);
    }
    
}


