
public class Main {

    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");

        Conta cc = new ContaCorrente(matheus);
        cc.depositar(5000);
        cc.sacar(758.25);

        Conta cp = new ContaPoupanca(matheus);

        cc.transferir(cp, 33.25);
        

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
