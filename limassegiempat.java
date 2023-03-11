/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class limassegiempat {
    public double sisi;
    public double tinggi;
    public double volume;
    
    public limassegiempat(){
        this.sisi = 0;
        this.tinggi = 0;
    }
    
    public limassegiempat(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        double calculate_vol = (this.sisi * this.sisi * this.tinggi) / 3; 
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
