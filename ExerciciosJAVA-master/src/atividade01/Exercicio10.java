
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        double distancia=0,velocidade=0,tempo=0,litros=0;
        String aux=null;
        
        try{
            aux = JOptionPane.showInputDialog(null, "Digite o tempo gasto da viagem em horas ");
            tempo = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null, "Digite a velocidade media ");
            velocidade = Double.parseDouble(aux);
            
            distancia = tempo * velocidade;
            litros = distancia /12;
            
            JOptionPane.showMessageDialog(null,"Litros gasto na viagem é : "+ litros);

            
       
        }
        catch (NumberFormatException erro) {
    
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
    }   
    }
    
}
