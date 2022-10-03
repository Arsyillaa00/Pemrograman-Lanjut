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
public interface Transaksi {
    int getjumlahSaldo();
    void tambahSaldo(int a);
    void kurangSaldo(int a);
    boolean makSimal();
    int cekTransaksi(int a);
}
