
package exercicios.ia;

import java.util.Scanner;

public class atividade2 {
    
    Scanner ler = new Scanner(System.in);
    
    public void lervetor() 
    {        
        int vetor[] = new int[10];        
        for (int i = 0;i < 10;i++) {
            
            vetor[i] = ler.nextInt();
       
        }
        
        System.out.println("IMPRIMINDO O VETOR:");
          for (int i = 0;i < 10;i++) {
         System.out.println(vetor[i]);
 
    }
    }
}
