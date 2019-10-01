
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double salario=0,prestacao=0,porcentagem=0.3,valormax=0;
        String aux=null;
        
        try{ 
        
         JOptionPane.showMessageDialog(null, "Saiba se seu empréstimo pode ou não ser concedido.");
         
            aux = JOptionPane.showInputDialog(null, "Digite seu salario ");
            salario = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null, "Digite o valor da prestação");
            prestacao = Double.parseDouble(aux);
            
            valormax = (salario * porcentagem);
            
            if(prestacao<=valormax){
                JOptionPane.showMessageDialog(null,"Seu emprestimo é concebivel");  
            }
            else{
                JOptionPane.showMessageDialog(null,"Sua prestação é maior que 30% do salario e não é possivel ser concebivel");
            }
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
