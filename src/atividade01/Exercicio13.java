
package atividade01;

import javax.swing.JOptionPane;


public class Exercicio13 {
    public static void main(String[] args) {
        double idade=0,i=0,maior=0;
        String aux=null;
        
        
        try{
        for(i=1;i<21;i++){
            aux = JOptionPane.showInputDialog(null, "Digite a idade "+i+":");
            idade = Double.parseDouble(aux);
            
            if(idade>=18){
                maior+=1;
            }
        }
        JOptionPane.showMessageDialog(null, maior+" pessoas são maiores de idade");
        }
         catch (NumberFormatException erro) {
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
           main(args); 
        
        }
    }
}
