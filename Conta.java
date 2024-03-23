

package exemplo2;


/**
 *
 *@author Rayssa Alves<rayssaalves.go@gmail.com>
 *@date 22/03/2024
 *brief class Conta
 *
 */
 
public class Conta {

    private Integer numero;
    private String nome;
    private double saldo;
    
    public Conta (Integer numero, String nome, double deposito1) {
        this.numero = numero;
        this.nome = nome;
        if (deposito1 > 0) {
            depositar(deposito1);
        }   
    }
    
    public Integer getNumero() {
        return numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void depositar (double valor) {
        saldo += valor;
    }
    
    public void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            saldo -= 5.00;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    @Override
    public String toString() {
        return "Número da conta: " + numero + " Titular da conta: " + nome + " Saldo: $ " + saldo;
    }
}
