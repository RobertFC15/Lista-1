/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

import java.util.Scanner;
public class Atividade_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero = 0;

        System.out.print("Informe a nota 0 a 100 para definição do conceito: ");
        numero = scanner.nextDouble();

        while (numero < 0 || numero > 100) {
            System.out.print("Numero invalido");
            System.out.print("Tente novamente: ");
            numero = scanner.nextDouble();
            
        }

        if(numero >= 90 && numero < 100) {
            System.out.println("A");

        } else if (numero >= 80 && numero < 90) {
            System.out.println("B");

        } else if (numero >= 70 && numero < 80) {
            System.out.println("C");
            
        } else if (numero >= 60 && numero < 70) {
            System.out.println("D");
            
        } else {
            System.out.println("E");
        }

        scanner.close();





            
    }

}
    

