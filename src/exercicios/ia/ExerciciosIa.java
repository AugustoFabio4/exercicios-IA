
package exercicios.ia;
import java.util.Scanner;

public class ExerciciosIa {
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       int atividade;
       do{
        System.out.println("Entre com o numero da atividade que deseja executar ou 0 para parar o programa\n");
        atividade = ler.nextInt();
        System.out.println("EXECUTANDO ATIVIDADE " + atividade + ":");
        if (atividade == 1) {
        System.out.println("FAÇA UM PROGRAMA QUE ESCREVA OLÁ MUNDO\n");
        atividade1 atv1 = new atividade1();
        atv1.imprimeolamundo();
        System.out.println("-----------------------------");
        }
        if (atividade == 2) {
        System.out.println("Faça um programa que leia 10 números e os armazene em um vetor. Imprima o vetor\n");
        atividade2 atv2 = new atividade2();
        atv2.lervetor();
        System.out.println("-----------------------------");
        }
        if (atividade == 3) {
        System.out.println("Faça um programa que leia e preencha uma matriz de 10x10. No final, imprima a matriz\n");
        atividade3 atv3 = new atividade3();
        atv3.lermatriz();
        System.out.println("-----------------------------");
        }
        if (atividade == 4) {
        System.out.println("Faça um programa que leia 10 números, insira em uma pilha. O programa deve remover os dados da pilha e imprimi-los na tela.\n");
        atividade4 atv4 = new atividade4();
        atv4.minhapilha();
        System.out.println("-----------------------------");
        }
        if (atividade == 5) {
        System.out.println("Faça um programa que leia 10 números, insira em uma fila. O programa deve remover os dados da fila e imprimi-los na tela.\n");
        atividade5 atv5 = new atividade5();
        atv5.minhafila();
        System.out.println("-----------------------------");
        }
        if (atividade == 6) {
        System.out.println("Faça um programa que leia 10 tarefas. Cada tarefa contém uma descrição (string) e uma prioridade (inteiro de 0 a 5. Utilizar classe ou estrutura para representar a tarefa). As tarefas devem ser inseridas em uma fila de prioridade. programa deve imprimir as tarefas na tela de acordo com a sua prioridade.\n");
        atividade6 atv6 = new atividade6();
        atv6.tarefasporprioridade();
        System.out.println("-----------------------------");
        }
        }
        while(atividade != 0);
    }
        }
