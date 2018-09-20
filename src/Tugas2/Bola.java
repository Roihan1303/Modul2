/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bola {

    public double jariJari;
    public final double phi = 3.14;

    public void setJariJari() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Bola : ");
        int jari2 = scan.nextInt();
        this.jariJari = jari2;
    }

    public void showDiameter() {
        double temp;
        double diameter = 2 * jariJari;
        temp = diameter;
        System.out.println("Diameter Bola : " + temp);
    }

    public void showLuasPermukaan() {
        double temp;
        double luas = 4 * phi * jariJari * jariJari;
        temp = luas;
        System.out.println("Luas Permukaan Bola : " + temp);
    }

    public void showVolume() {
        double temp;
        double volume = 4/3 * phi * jariJari * jariJari * jariJari;
        temp = volume;
        System.out.println("Volume Bola : " + volume);
    }

}
