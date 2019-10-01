
package atividade01;

import javax.swing.JOptionPane;

public class Atividade01 {

    public static void main(String[] args) {
        String st=null,aux=null;
        int menu=0;
        
        try{   
        aux = JOptionPane.showInputDialog(null, "Escolha o exercicio de 1 a 15 ");
        menu = Integer.parseInt(aux);
        switch(menu){
            case 1 : st = "Exercicio 01";Exercicio01.main(args); break;
            case 2 : st = "Exercicio 02";Exercicio02.main(args); break;
            case 3 : st = "Exercicio 03";Exercicio03.main(args); break;
            case 4 : st = "Exercicio 04";Exercicio04.main(args); break;
            case 5 : st = "Exercicio 05";Exercicio05.main(args); break;
            case 6 : st = "Exercicio 06";Exercicio06.main(args); break;
            case 7 : st = "Exercicio 07";Exercicio07.main(args); break;
            case 8 : st = "Exercicio 08";Exercicio08.main(args); break;
            case 9 : st = "Exercicio 09";Exercicio09.main(args); break;
            case 10 : st = "Exercicio 10";Exercicio10.main(args); break;
            case 11 : st = "Exercicio 11";Exercicio11.main(args); break;
            case 12 : st = "Exercicio 12";Exercicio12.main(args); break;
            case 13 : st = "Exercicio 13";Exercicio13.main(args); break;
            case 14 : st = "Exercicio 14";Exercicio14.main(args); break;
            case 15 : st = "Exercicio 15";Exercicio15.main(args); break;
            default : st = "Inexistente !"; 
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
