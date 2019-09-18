
package atividade01;

import javax.swing.JOptionPane;


public class Exercicio04arrumar {
    public static void main(String[] args) {
        double numero=1,numerosoma=0;
        String aux=null;
        
        try{ 
            
           
        
        JOptionPane.showMessageDialog(null, "Some a sequencia de numeros digitados."+"\n"
        +"Digite 0 para efetuar a soma.");
        
        while
             (numero!=00){
           aux = JOptionPane.showInputDialog(null, "digite um numero. ");
           aux = aux.replace(',','.');
           numero = Double.parseDouble(aux);
           if(numero<0){
           System.exit(0);
           }
           numerosoma=numero+numerosoma;
           
            
        }
        JOptionPane.showMessageDialog(null, "A soma da sequencia é : "+ numerosoma);
        
        } 
         catch (NumberFormatException erro) {
    
        JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
         
         
    }
    
    }
}
