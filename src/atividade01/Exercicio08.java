
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {
        double horaaula=0,aulasmes=0,desconto=0,liquido=0;
        String aux = null;
        
        aux = JOptionPane.showInputDialog(null, "Digite o valor da hora/aula ");
        horaaula = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite quantos números de aulas dadas no mês");
        aulasmes = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o percentual de desconto do INSS sem %");
        desconto = Double.parseDouble(aux);
        
        
    }
}
