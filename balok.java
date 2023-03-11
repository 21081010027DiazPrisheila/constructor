/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public int volume;
    
    public balok(){
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }
    
    public balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        int calculate_vol = this.panjang * this.lebar * this.tinggi;
        this.volume = calculate_vol;
    }
    
    public int GetVolume (){
        return this.volume;
    }
}
