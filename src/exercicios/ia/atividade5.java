
package exercicios.ia;

import java.util.Collection;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


public class atividade5 {
    
    Scanner ler = new Scanner(System.in);
    boolean resposta;
    
    public void minhafila() {
 Queue<Integer> fila = new LinkedList<>();
 
 System.out.println("Comece adicionando 10 elementos na fila");
        for (int i = 0 ; i < 10 ; i++) {
            
    fila.add(ler.nextInt());  
        }
        System.out.println("Elementos adicionados com sucesso");
        System.out.println("Deseja remover elementos da fila? Envie 'true'  ou 'false'");
        
        if (ler.nextBoolean() == true)
        {
            for (int i = 0 ; i < 10 ; i++) {
                System.out.println("O elemento " + fila.remove() + " foi removido da fila");
            }
        }
        else {
            System.out.println("Nenhum elemento foi removido");
        }
        
   
        
        
        
        
    }
    
    } 
    
