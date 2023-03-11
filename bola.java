/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

public class bola {
    public double radius;
    public double volume;
    
    public bola(){
        this.radius = 0;
    }
    
    public bola(double radius){
        this.radius = radius;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void ComputeAndSetVolume(){
        double calculate_vol = ( 4* Math.PI * this.radius * this.radius * this.radius ) / 3;
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
    
}
