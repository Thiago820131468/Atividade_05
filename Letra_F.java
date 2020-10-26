
package atividade_05_hamilton;

import javax.swing.JOptionPane;

public class Letra_F {
    public static void main (String [] args){
        Double temp [] = new Double [31];
        Double maior = 0.0, menor = 0.0;
        Double soma = 0.0, cont = 0.0, media;
        for (int i =0; i < temp.length; i++){
            temp [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do dia: " + (i + 1) ));
            
            if (i == 0){
                maior = temp[i];
                menor = temp[i];
            }
            
            if (temp[i] > maior){
                 maior = temp[i];
            }
            
            if(temp[i] < menor){
                menor = temp[i];
            }
            
            soma = soma + temp[i];
            cont ++;
        }
        
        media = soma/cont;
        
        JOptionPane.showMessageDialog(null, "A media mensal é: " + media);        
        for(int i = 0; temp[i] < media; i++ ){
            
            System.out.println("A temperatura abaixo da média mensal é: " + temp[i]);
           
        }
        
    }
}
