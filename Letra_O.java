

import java.util.*;



package atividade_05_hamilton;


public class Letra_O {
    
        
        public static void main(String[] args) {
        
    Scanner vet = new Scanner (System.in);
    int elementos[] = new int[50];  
    
        for (int i=0; i<50; i++){  
            System.out.printf ("Informe o numero %d:",i);  
            elementos[i] = vet.nextInt();       
        }  
    ordena(elementos);
     
        System.out.println("Numeros Ordenados: ");
        for (int numero : elementos){
            System.out.println(numero);
        }    
    }  
   
    public static void ordena(int elementos[]){  
        int cont1, cont2,aux;  
            for(cont1 =0; cont1<50; cont1++){  
                for(cont2 =0; cont2 <49; cont2++){  
                    if(elementos[cont2]> elementos[cont2+1]){  
                        aux = elementos[cont2];  
                        elementos[cont2] = elementos[cont2+1];  
                        elementos[cont2+1] = aux;  
                    }  
                }  
            } 
        }
}
