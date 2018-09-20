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
public class Test {

    public static void main(String[] arg) {
        Scanner masuk = new Scanner(System.in);
        int jawab;
        System.out.println("~~ Luas Permukaan dan Volume Bola ~~");
        do {
        System.out.println("");
        Bola scan = new Bola();
        scan.setJariJari();
        scan.showDiameter();
        scan.showLuasPermukaan();
        scan.showVolume();
        System.out.println("Apakah ingin mengulang? y=1,n-0");
        jawab = masuk.nextInt();
        }while (jawab == 1);
        System.out.println("");
        System.out.println("Terimakasih");
    }
    }
