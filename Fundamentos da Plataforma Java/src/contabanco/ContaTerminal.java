package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor informa o seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor informa o número da sua conta:");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor informa a sua agencia:");
        agencia = sc.next();
        sc.nextLine();

        System.out.println("Por favor informe seu saldo:");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }

}
