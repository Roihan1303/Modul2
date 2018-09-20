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
public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double penumpangBaru;
    public double berat;
    
    public Bus(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
        }
    }
        public void getPenumpang(double password){
            if (password == 13){
                System.out.println("Password Benar");
            }else {
                System.out.println("Password Salah");
            }
        }
        
        public void getAverage(double berat){
            double temp;
            temp = this.berat+berat;
            double average = temp / penumpang;
            this.berat = average;
        }
        
        public void cetakPenumpang(){
            System.out.println("Penumpang bus sekarang = " + penumpang);
            System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxPenumpang);
            System.out.println("Rata- rata berat penumpang bus sekarang = " + berat);
        }
}
