
import java.util.ArrayList;
import java.util.List;

//abstract não permite fazer um new, apenas os filhos, que no caso são conta corrente e conta poupança
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    //Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static List<Conta> contas = new ArrayList<>();

    //Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Construtor 
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Métodos
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.printf(String.format("Agencia: %d", this.agencia));
        System.out.printf(String.format("\nNumero: %d", this.numero));
        System.out.printf(String.format("\nSaldo: %.2f", this.saldo));
    }


}
