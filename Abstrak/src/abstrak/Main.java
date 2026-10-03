/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstrak;

/**
 *
 * @author PF54A
 */
public class Main {
    public static void main(String [] argv){
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println ("Luas STSK= "+stsk.luas);
        System.out.println ("Keliling STSK= "+
                stsk.keliling);
    }
}
