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
public class Model implements Transaksi {
    CekSaldo lihatSaldo;
    
    Model(){
        this.lihatSaldo = new CekSaldo();
    }
    
    public int maksimal(){
        return this.lihatSaldo.minimSaldo;
    }

    @Override
    public int getjumlahSaldo() {
        return this.lihatSaldo.getjumlahSaldo();
    }

    @Override
    public void tambahSaldo(int a) {
       lihatSaldo.setCekSaldo(lihatSaldo.getjumlahSaldo() + a);
    }

    @Override
    public void kurangSaldo(int a) {
        lihatSaldo.setCekSaldo(lihatSaldo.getjumlahSaldo() - a);
    }

    @Override
    public boolean makSimal() {
        if(this.lihatSaldo.getjumlahSaldo() <= this.lihatSaldo.minimSaldo){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int cekTransaksi(int a) {
        if(a % 50000 != 0){
            return 1;
        }
        return 0;
    }
}
    

