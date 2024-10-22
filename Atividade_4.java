/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

import java.util.Scanner;
public class Atividade_4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double maior_nota = 0;
        double menor_nota = 10;

        int notas[] = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite a nota dos alunos: ");
            notas[i] = scanner.nextInt(); 
        
        soma += notas[i];
        
        if(notas[i] > maior_nota) {
            maior_nota = notas[i];

        }
        if(notas[i] < menor_nota) {
            menor_nota = notas[i];
        }

      }
        double media = soma/5; 
        System.out.println("A maior nota da sala é: " +maior_nota);
        System.out.println("A menor nota da sala é: "+menor_nota);
        System.out.println("A media da turma foi: "+media);
        

    }

}
