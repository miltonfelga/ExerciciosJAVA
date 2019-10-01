
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        double produto=0,porcentagem=0.09,desconto=0,novovalor=0;
        String aux=null;
        
        try{
            aux = JOptionPane.showInputDialog(null, "Digite o valor do produto ");
            produto = Double.parseDouble(aux);
            
            desconto=produto*porcentagem;
            novovalor=produto-desconto;
            
            JOptionPane.showMessageDialog(null,"O valor descontado 9% será de: "+ novovalor);
            
        }
            catch (NumberFormatException erro) {
    
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
    }
            catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        
    }
        
    }
    
}
