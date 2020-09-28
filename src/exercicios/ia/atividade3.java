
package exercicios.ia;

import java.util.Scanner;

public class atividade3 {
    
    Scanner ler = new Scanner(System.in);
    
    
        public void lermatriz() 
    {
        int nlinhas;
        int ncolunas;
        
       System.out.printf("Entre com o numero de linhas da matriz: ");        
       nlinhas = ler.nextInt();
       System.out.printf("Entre com o numero de colunas da matriz: ");        
       ncolunas = ler.nextInt();
        
       int matriz[][] = new int[nlinhas][ncolunas];        
        
        for (int i = 0; i < matriz.length ;i++)     
        { 
            for (int y = 0;y < matriz[0].length;y++)
            {
               System.out.printf("Digite o valor da linha " + (i+1) + " e coluna " + (y+1) + " : ");
              matriz[i][y] = ler.nextInt();      
        }
        }   
         for (int i = 0; i < matriz.length ;i++) 
        {
            for (int y = 0;y < matriz[0].length;y++)
            {
        System.out.print(matriz[i][y] + " ");
        }
            System.out.println("");
    }
    }
             
}

