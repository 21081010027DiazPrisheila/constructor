/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class kubus {
    public int sisi;
    public int volume;
    
    public kubus() {
        this.sisi = 0;
    }
    public kubus(int sisi){
        this.sisi = sisi;
    }
    
    public void Setsisi(int sisi){
        this.sisi = sisi;
    }
    
    public void ComputeAndSetVolume (){
        int calculate_vol = this.sisi * this.sisi * this.sisi;
        this.volume = calculate_vol;
    }
    
    public int GetVolume (){
        return this.volume;
    }
    
}
