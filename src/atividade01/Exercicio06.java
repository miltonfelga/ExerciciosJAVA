
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int dd,mm,aaaa;
        int biss;
        int ddh=0,mmh=0,aaaah=0;
        int mes,dias=0,somad=0,somam=0,somaa=0,somadias;
        String aux=null,st=null;
        
        try{
        
        aux = JOptionPane.showInputDialog(null, "Digite o Dia atual");
        ddh = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o Mes atual");
        mmh = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o Ano atual ");
        aaaah = Integer.parseInt(aux);    
        
        aux = JOptionPane.showInputDialog(null, "Digite o Dia em que você nasceu");
        dd = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o Mes em que você nasceu");
        mm = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o Ano em que você nasceu");
        aaaa = Integer.parseInt(aux);

        if(dd>ddh){
            mm=mm+1;
        }
        
        if(mm>mmh){
            aaaah=aaaah-1;
            somam+=31;
        }
        if(dd>ddh && mm>mmh){
            somam-=1;
        }
        
        if(aaaa<aaaah){
        aaaa=aaaah-aaaa;
        biss=aaaa/4;
        somaa=(aaaa*365)+biss;
        }
        else{
             JOptionPane.showMessageDialog(null,"Coloque uma data anterior a atual");
             main(args); 
             
        }
        for(mes=mm;mes!=mmh;mes++){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                dias=31;
            }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias=30;
            }
            else if(mes == 2){
                dias=28;
            }
            somam=dias+somam;
            if(mes==12){
                mes=1;}
        }
        
        if(mm > mmh ){
            mm = 12-mm;
            mm = mm+mmh;   
        }
        
        else{
            mm=mmh-mm;
        }
        
       
        if(dd > ddh ){
            somad = 31-dd+ddh;
        }
        else{
            somad=ddh-dd;
        }
       
        
        somadias=somaa+somam+somad;
        JOptionPane.showMessageDialog(null, "São "+ somadias + " dias desde a data escolhida até o dia atual");
    }
           catch (NumberFormatException erro) {
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
            
        
        }
    }

    
}
