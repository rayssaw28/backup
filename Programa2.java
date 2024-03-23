/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exemplo2;
import java.util.*;

/**
 *
 * @author Rayssa Alves<rayssaalves.go@gmail.com>
 */
public class Programa {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o número da conta: ");
        Integer numero = scanner.nextInt();
        
        System.out.println("Insira nome do Títular da conta: ");
        String nome = scanner.next();
        
        System.out.println("Deseja fazer um depósito inicial? (s/n) ");
        char resposta = scanner.next().charAt(0);
        
        double deposito1 = 0;
        
        if (resposta == 's') {
            System.out.println("Insira o valor do depósito: ");
            deposito1 = scanner.nextDouble();
        }
        
        Conta conta = new Conta (numero, nome, deposito1);
        
        System.out.println();
        System.out.println("Dados da conta: " + conta);
        
        while (true) {
        System.out.println();
        System.out.println("Escolha uma operação: ");
            System.out.println("1 - Depósito.");
            System.out.println("2 - Saque.");
            System.out.println("3 - Finalizar.");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Insira o valor do depósito: ");
                    double valorD = scanner.nextDouble();
                    conta.depositar(valorD);
                    break;
                case 2:
                    System.out.println("Insira o valor do saque: ");
                    double valorS = scanner.nextDouble();
                    conta.sacar(valorS);
                    break;
                case 3: 
                    return;
                default:
                    System.out.println("Opçãp inválida.");
                
            }
            
            System.out.println();
            System.out.println("Dados da conta: " + conta);
        
        }
        
    }
}
