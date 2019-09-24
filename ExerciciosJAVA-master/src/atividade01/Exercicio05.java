
package atividade01;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int i=5,j,k;
        j=--i;
        k=i++;
        i+=10;
        JOptionPane.showMessageDialog(null, "valor i = "+i+"\n"
                + "valor j = "+j+ "\n"
                        + "valor k = "+k );
    }
}
