/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class tabung {
    public double radius;
    public double tinggi;
    public double volume;
    
    public tabung(){
        this.radius = 0;
        this.tinggi = 0;
    }
    
    public tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        double calculate_vol = Math.PI * this.radius * this.radius * this.tinggi; 
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
