
package exercicios.ia;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;
public class atividade4 {

    Stack pilha = new Stack();
    int aux = 0;
    boolean resposta;
    Scanner ler = new Scanner(System.in);
    
    public void minhapilha() {

     System.out.println("INSERINDO 10 NUMEROS NA PILHA: ");
     
        for (int i = 0 ; i < 10 ; i++) {
        aux = ler.nextInt();
        pilha.push(aux);
         }
        
        System.out.println("Deseja remover os dados da pilha?");
        
        
        for (int i = 0 ; i < 10 ; i++) {     
            System.out.println("O numero " + pilha.pop() + " foi removido da pilha");    
        }
        
        // retornando se a pilha esta vazia ou não após remoção dos elementos.
            System.out.println("Pilha vazia? " + pilha.empty());
        }
}
    
