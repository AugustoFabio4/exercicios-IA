
package exercicios.ia;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class atividade6 {
    
    Scanner ler = new Scanner(System.in);
    
        String vetor[] = new String[10];
        int vetorprioridade[] = new int[10];
    
    public atividade6() {
        
        this.vetor = vetor;
        this.vetorprioridade = vetorprioridade;
    }
    
    
    public void tarefasporprioridade() {
    
 PriorityQueue<Integer> tar = new PriorityQueue<>();
 
 System.out.println("Entre com 10 tarefas:\n");
 for (int y=0 ; y < 10 ; y++) {
     
  // tarefas de prioridade 1 SÃO DE MAIOR PRIORIDADE já as de prioridade 5 SÃO DE MENOS PRIORIDADE.
     System.out.println("TAREFA " + (y+1) + ": ");
     vetor[y] = ler.next();
 }
     for (int y=0 ; y < 10 ; y++) {
     System.out.println ("Prioridade da tarefa " + (y+1) + " de 1 a 5: ");
     tar.add(ler.nextInt());
     
     }   
        while (!tar.isEmpty()) {
            
             System.out.println("\nTAREFAS EM ORDEM DE PRIORIDADE");
            for (int y=0 ; y < 10 ; y++) {
            System.out.println("Tarefa " + (y+1) + ":\n" + vetor[y] + "\n" + "Prioridade: " + tar.remove());
            }
        }
       
    }
    }
 