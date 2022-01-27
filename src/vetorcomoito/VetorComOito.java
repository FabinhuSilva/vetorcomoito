/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorcomoito;

import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class VetorComOito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recebendo do Tecaldo
        Scanner teclado = new Scanner(System.in);
        
        //Montando meu Vetor com 8
        int[] vetorcomoitonumeros = new int[8];
        
        //variaveis que vou usar
        int somatotal=0;
        
        
        //laço para receber os oito inteiros para o meu vetor
        for( int contador=0;contador < 8;contador++){
              //Capturando do teclado para a posição do vetor
              System.out.println("Digite a posição em vetor "+contador+" e qual seu numero:");
              vetorcomoitonumeros[contador]=teclado.nextInt();
              somatotal = somatotal+vetorcomoitonumeros[contador];
              System.out.println("Vetor "+contador+" - "+vetorcomoitonumeros[contador]);
              System.out.println("---------------------------");
        }
        for (int resultado:vetorcomoitonumeros){
         System.out.println("Valor Vetor - " +resultado);
    } 
              System.out.println("---------------------------");
              System.out.println("A soma do seu Vetor  é "+somatotal);
    }
}

