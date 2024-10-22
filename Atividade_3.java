/*Robert Franklin C. Coelho
 * Desenvolvimento de aplicações
 * Turma C
 */

 public class Atividade_3 {
    
    public static void main(String[] args) {

        double valor_compra = 1500;
        /*Desconto de 45% */
        double desconto = 1500 * 0.45;
        double valor_com_desconto = valor_compra - (1500 * 0.45);
        
        System.out.println("O valor cheio é: R$" + valor_compra);
        System.out.println("O valor do desconto: R$" + desconto);
        System.out.println("O novo valor é: R$" + valor_com_desconto);
        
       
    }
}
