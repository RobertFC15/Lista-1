/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

import java.util.Scanner;
public class Atividade_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num = scanner.nextDouble();

        if (num % 2 == 0) {
            System.out.println("O numero é par");

        } else {
            System.out.println("O numero é impar");

        }

        if (num >= 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("O numero é negativo");
        
        }
        for (int i = 1; i <= num; i++) {
            System.out.println("Sim");

            for (int n = 2; n < i; n++){
                if (i % n == 0) {
                    System.out.println("Não");
                }

            }
        }
        double raiz = Math.sqrt(num);
        System.out.println("A raiz quadrada do número é: " + raiz);

        double expoente = 3;
        double resultado = Math.pow(num, expoente);

        System.out.println("O numero elevado a 3 é: " + resultado);

        
    }
}
