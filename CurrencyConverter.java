

package exercicioFixacao;

/**
 *
 *@author Rayssa Alves<rayssaalves.go@gmail.com>
 *@date 22/03/2024
 *brief class CurrencyConverter
 *
 */
 
public class CurrencyConverter {

    public double precoDolar;
   
    public CurrencyConverter (double precoDolar) {
        this.precoDolar = precoDolar;
    }
    
    public double converterReais (double dolares) {
        return dolares * precoDolar * (1 + 0.06);
    }
}
