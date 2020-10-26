
package atividade_05_hamilton;

import javax.swing.JOptionPane;

public class Letra_E { 

    
    public static void main(String[] args) {
       Double n [] = new Double [15];
       int cont = 0;
       for (int i = 0; i < n.length; i++){
           n [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
           
           if(n [i] < 0){
               n [i] = 0.0;
           }
       }
       
       while(cont < n.length ){
           System.out.println(n[cont]);
           
           cont ++;
       }

    }
    
}
