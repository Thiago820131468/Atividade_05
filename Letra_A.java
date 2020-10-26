
package atividade_05_hamilton;

import javax.swing.JOptionPane;


public class Letra_A {
    
    public static void main(String[] args) {
        double notas[] = new double[20];
        double soma = 0, media = 0;
        String msg = " ";
        for(int i = 0; i < notas.length; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(i+1)));
            soma = soma + notas[i];
        }
        media = soma / notas.length;

        for (int i = 0; i < notas.length; i++){
            if (notas[i]<media){
                msg = msg + "notas["+i+"] = "+ notas[i]+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, "A media eh? "+media);
        JOptionPane.showMessageDialog(null,msg);
    }
    
}
