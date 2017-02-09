/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankgui;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulina
 */
class setor {
    private int saldo;
    public void menabung (int bal, int s){
        if(s%100!=0)
            JOptionPane.showMessageDialog(null,
                    "Mesin ATM BRI tidak menerima uang koin \n"
                            + "Silahkan ulangi kembali","Transaksi Gagal", 0);
        else if(s<5000)
            JOptionPane.showMessageDialog(null,
                    "Besaran minimal setor tunai adalah Rp 50000,00", "ERROR", 0);
        else if(s>5000){
            saldo = bal+s;
            JOptionPane.showMessageDialog(null, 
                    "Saldo Anda saat ini sebesar : " + saldo);
        }
    }

    int getsaldo() {
        return saldo;
    }
    
}
