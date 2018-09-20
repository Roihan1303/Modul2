/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] arg){
        Bus Bus = new Bus(40);
        Bus.getPenumpang(13);
        Bus.cetakPenumpang();
        
        //penambahan
        System.out.println("");
        Bus.addPenumpang(10);
        Bus.getAverage(210);
        Bus.cetakPenumpang();
        
        //penambahan
        System.out.println("");
        Bus.addPenumpang(5);
        Bus.getAverage(115.5);
        Bus.cetakPenumpang();
        
        //penambahan
        System.out.println("");
        Bus.addPenumpang(13);
        Bus.getAverage(223);
        Bus.cetakPenumpang();
        
        //penambahan
        System.out.println("");
        Bus.addPenumpang(3);
        Bus.getAverage(100);
        Bus.cetakPenumpang();
    }
}
