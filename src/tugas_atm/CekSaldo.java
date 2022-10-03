/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_atm;

/**
 *
 * @author ACER
 */
public class CekSaldo { 
    private int jumlahSaldo;
    public int minimSaldo;
    
    public CekSaldo(){
        this.jumlahSaldo = 500000;
        this.minimSaldo = 100000;
    }

    public int getjumlahSaldo() {
        return this.jumlahSaldo;
    }

    public void setCekSaldo(int a) {
        this.jumlahSaldo = a;
    }
    
}
