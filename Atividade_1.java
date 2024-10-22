/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicaçoes
 * Turma C
 */

import java.util.Scanner;
public class Atividade_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int comprimento_palavra = palavra.length();

        System.out.printf("A palavra digitada tem: %d digitos", palavra.length());
        System.out.println("A primeira letra é: " + palavra.charAt(0));
        
        if (comprimento_palavra > 0) {

            if (comprimento_palavra % 2 != 0) {
                int letra_central = comprimento_palavra / 2;
                System.out.println("A letra central da palavra é: " + palavra.charAt(letra_central));

                 } else{
                    int letra_central_par = comprimento_palavra / 2;
                    System.out.println("A letra central da palavra é: " + palavra.charAt(letra_central_par));

                 }

        System.out.println("A ultima letra da palavra é: " + palavra.charAt(palavra.length() - 1) );
        
        System.out.print("String ao contrário: ");
        for (int string = palavra.length() - 1; string >= 0; string--) {
        System.out.print(palavra.charAt(string)); }
        
        System.out.println("A palavra toda em maiusculo: " + palavra.toUpperCase());
        System.out.println("A palavra toda em minusculo: " + palavra.toLowerCase());
    }

    }

}
