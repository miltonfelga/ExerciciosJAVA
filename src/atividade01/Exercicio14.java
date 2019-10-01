
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        double idade=0,i=0,menor=1000;
        String aux=null,nome=null,menorn=null;
        
        
        try{
        for(i=1;i<11;i++){
            nome = JOptionPane.showInputDialog(null, "Digite o nome "+i+":");
            
            
            aux = JOptionPane.showInputDialog(null, "Digite a idade "+i+":");
            idade = Double.parseDouble(aux);
            
            if(idade<menor){
                menorn=nome;
                menor=idade;
    }
            
}
        JOptionPane.showMessageDialog(null,"A menor idade é do: "+menorn+" com "+menor+" ano(s).");
}
        catch (NumberFormatException erro) {
           JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos");
           main(args); 
        
        }
        catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso sistema");
            System.exit(0);
        
    }
}
}
