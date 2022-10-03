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
public class TransController {
    Tampilan tampilan;
    Model model;
    int n;
    
    TransController(){
        this.tampilan = new Tampilan();
        this.model = new Model();
        do{
            if(n != 4){
                n = tampilan.menuUtama();
                if(n == 1){
                    tampilan.lihatSaldo(this.model);
                }else if(n == 2){
                    tampilan.tarikTunai(this.model);
                }else if(n == 3){
                    tampilan.setorTunai(this.model);
                }else if(n == 4){
                    System.out.println("Terimakasih..");
                }else {
                    System.out.println("Menu tidak terdaftar");
                }
            }
            else{
                System.out.println("Menu tidak terdaftar");
            }
        }while(n <= 5);
    
    }   
    
}
