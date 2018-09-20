/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] arg){
        Bus Bus = new Bus(10);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan panumpang
        Bus.addPenumpang(1); //tambah 1 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
    }
}
