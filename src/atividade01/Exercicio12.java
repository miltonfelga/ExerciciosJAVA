
package atividade01;

import javax.swing.JOptionPane;


public class Exercicio12 {
    public static void main(String[] args) {
        double numero=0, antecessor=0,sucessor=0;
        String aux=null;
    
    try{
        aux = JOptionPane.showInputDialog(null, "Digite um numero: ");
        numero = Double.parseDouble(aux);
        
        antecessor=numero-1;
        sucessor=numero+1;
        
        JOptionPane.showMessageDialog(null,"Seu numero é : "+numero+"\n"
                + "antecessor: "+antecessor+"\n"
                        + "sucessor: "+sucessor );
                
}
   catch (NumberFormatException erro) {
    
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
           main(args); 
}
}
}
