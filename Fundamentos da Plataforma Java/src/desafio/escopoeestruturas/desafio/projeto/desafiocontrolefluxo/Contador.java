package desafio.escopoeestruturas.desafio.projeto.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int n2 = leitor.nextInt();

        try {
            contar(n1, n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 >= n2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = n1; i <= n2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
