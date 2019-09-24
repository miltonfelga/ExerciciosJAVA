
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        String  aux=null;
        double n1=0, n2=0, resultado=0,senha=0, senhacomprov=0;
        
        try{
        
            aux = JOptionPane.showInputDialog(null, "Digite sua senha: ");
            senha = Double.parseDouble(aux);
            
            JOptionPane.showMessageDialog(null,"digite dois numeros para serem divididos");
            
            aux = JOptionPane.showInputDialog(null, "Digite um numero:  ");
            n1 = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null, "Digite o segundo numero: ");
            n2 = Double.parseDouble(aux);
        
            resultado = n1/n2;
            
            aux = JOptionPane.showInputDialog(null, "confirme sua senha: ");
            senhacomprov = Double.parseDouble(aux);
            
            if(senha == senhacomprov){
                
                JOptionPane.showMessageDialog(null,"o resultado é: " + resultado);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"senha incorreta");
                main(args);
            }
            
            
        
        }
        catch (NumberFormatException erro) {
    
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
           main(args);
    }
    
}
}
