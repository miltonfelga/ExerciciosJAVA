
package atividade01;
import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        double pi=3.14159,raio=0,altura=0,volume=0;
        String aux;
        
        try{
            aux = JOptionPane.showInputDialog(null, "Digite o valor do raio");
            raio = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null, "Digite o valor da altura ");
            altura = Double.parseDouble(aux);
            
            volume=pi*(raio*raio)*altura;
            
            JOptionPane.showMessageDialog(null,"O volume de uma lata de óleo é: "+ volume);
        }
        catch (NumberFormatException erro) {
    
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
        
    }
}
}
