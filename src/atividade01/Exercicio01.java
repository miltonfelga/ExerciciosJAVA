package atividade01;
import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        double salantigo=0,percentual=0,aumento=0,salnovo=0;
        String aux=null;
        
        try{
            JOptionPane.showMessageDialog(null, "Calcule seu aumento pelo salario e porcentagem");
            
            aux = JOptionPane.showInputDialog(null, "Digite seu salario ");
            salantigo = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null, "Digite a porcentagem do seu aumento sem %");
            percentual = Double.parseDouble(aux);
            
            aumento = salantigo*(percentual/100);
            salnovo = salantigo+aumento;
            
            JOptionPane.showMessageDialog(null,"Salario:" + salantigo + " R$ \n"
                    + "Porcentagem: " + percentual + " % \n"
                    + "Aumento: " + aumento + " R$ \n"
                    +"Novo salario : " + salnovo + " R$ \n");
        }
        catch (NumberFormatException erro) {
    
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
    }
        
        catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        
    }

    System.exit(0);
        
    }
}
