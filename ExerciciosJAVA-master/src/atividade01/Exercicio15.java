
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio15 {
    public static void main(String[] args) {
        double caloria1=0,caloria2=0,caloria3=0,calsoma=0;
        int escolha1=0,escolha2=0,escolha3=0;
        String aux=null,st=null;
   
     try{
     aux=JOptionPane.showInputDialog(null, "Escolha um prato com caractere numerico: "+"\n"
             + "1- Vegetariano"+"\n"
             + "2- Peixe"+"\n"
             + "3- Frango"+"\n"
             + "4- Carne"+"\n");
    escolha1=Integer.parseInt(aux);
    
    switch(escolha1){
    case 1 : st = "Vegetariano";caloria1=180; break;
    case 2 : st = "Peixe";caloria1=230; break;
    case 3 : st = "Frango";caloria1=250; break;
    case 4 : st = "Carne";caloria1=350; break;
    default : st = "Inexistente !";  
}
    
    aux=JOptionPane.showInputDialog(null, "Escolha uma sobremesa com caractere numerico: "+"\n"
             + "1- Abacaxi"+"\n"
             + "2- Sorvete diet"+"\n"
             + "3- Mouse diet"+"\n"
             + "4- Mouse de chocolate"+"\n");
    escolha2=Integer.parseInt(aux);    
    
    switch(escolha2){
    case 1 : st = "Abacaxi";caloria2=75; break;
    case 2 : st = "Sorvete diet";caloria2=110; break;
    case 3 : st = "Mouse diet";caloria2=170; break;
    case 4 : st = "Mouse de chocolate";caloria2=200; break;
    default : st = "Inexistente !";    
}

    aux=JOptionPane.showInputDialog(null, "Escolha uma sobremesa com caractere numerico: "+"\n"
             + "1- Chá"+"\n"
             + "2- Suco de laranja"+"\n"
             + "3- Suco de melão"+"\n"
             + "4- Refrigerante diet"+"\n");
    escolha3=Integer.parseInt(aux);
     
    switch(escolha3){
    case 1 : st = "Chá";caloria3=20; break;
    case 2 : st = "Suco de laranja";caloria3=70; break;
    case 3 : st = "Suco de melão";caloria3=100; break;
    case 4 : st = "Refrigerante diet";caloria3=65; break;
    default : st = "Inexistente !";    
} 

     calsoma=caloria1+caloria2+caloria3;
     
     JOptionPane.showMessageDialog(null, "A soma de calorias é: " + calsoma );
        
}
    catch (NumberFormatException erro) {
    
        JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numericos"+ erro.toString());
    }
}
}
