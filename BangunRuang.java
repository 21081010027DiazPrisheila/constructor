/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;

public class BangunRuang {

    public static void main(String[] args) {
        kubus kotak = new kubus(5);
        kotak.ComputeAndSetVolume();
        System.out.println("Volume kubus dengan sisi "+kotak.sisi+" adalah "+kotak.GetVolume());
        
        balok kp = new balok(7, 5, 6);
        kp.ComputeAndSetVolume();
        System.out.println("Volume balok dengan panjang "+kp.panjang+" lebar "+kp.lebar+" tinggi "+kp.tinggi+" adalah "+kp.GetVolume());
        
        tabung tb = new tabung(14, 10);
        tb.ComputeAndSetVolume();
        System.out.println("Volume tabung dengan radius "+tb.radius+" tinggi "+tb.tinggi+" adalah "+tb.GetVolume());
        
        limassegiempat limas = new limassegiempat(6,9);
        limas.ComputeAndSetVolume();
        System.out.println("Volume limas segi empat dengan sisi "+limas.sisi+" tinggi "+limas.tinggi+" adalah "+limas.GetVolume());
        
        bola bola = new bola(21);
        bola.ComputeAndSetVolume();
        System.out.println("Volume bola dengan radius "+bola.radius+" adalah "+bola.GetVolume());
    }
    
}
