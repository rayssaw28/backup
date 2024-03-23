/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicioFixacao;
import java.util.*;
import java.util.Locale;

/**
 *
 * @author Rayssa Alves<rayssaalves.go@gmail.com>
 */
public class Programa {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a cotação atual do dolar: ");
        double precoDolar = scanner.nextDouble();
        
        System.out.println("Insira quantos doláres deseja comprar: ");
        double compraDolar = scanner.nextDouble();
        
        CurrencyConverter converter = new CurrencyConverter(precoDolar);
        
        double totalReais = converter.converterReais (compraDolar);
        
        System.out.println("Preço total em reais: " + totalReais);
    }
}
