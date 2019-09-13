
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double raio=0,perimetro=0, pi=3.14; 
        String aux = null;
                 
        try{ 
        
         JOptionPane.showMessageDialog(null, "Saiba o perimtro.");
         
         aux = JOptionPane.showInputDialog(null, "Digite o raio ");
         raio = Double.parseDouble(aux);
         
         perimetro = 2 * pi * raio;
         
           JOptionPane.showMessageDialog(null, "o perimetro é:"+ perimetro);
    }
        catch (NumberFormatException erro) {
    
        JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
    
        }
    }
}
