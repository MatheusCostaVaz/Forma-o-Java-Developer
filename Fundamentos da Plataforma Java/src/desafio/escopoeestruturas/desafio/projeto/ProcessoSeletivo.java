package desafio.escopoeestruturas.desafio.projeto;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        // //CASE 1
        // System.out.println("\n--------------CASE 1--------------");
        // analisarCandidato(1900);
        // analisarCandidato(2900);
        // analisarCandidato(2000);
        // System.out.println("\n--------------CASE 2--------------");
        // //CASE 2
        // selecaoDeCandidatos();
        // System.out.println("\n--------------CASE 3--------------");
        // //CASE 3
        // imprimirSelecionados();
        System.out.println("\n--------------CASE 4--------------");
        //CASE 4
        String[] candidatos = {"Nome 1", "Nome 2", "Nome 3", "Nome 4", "Nome 5"};
        for (String candidado : candidatos) {
            entrandoEmContato(candidado);
        }
    }

    //CASE 1 
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDADO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

        }
    }

    //CASE 2
    static void selecaoDeCandidatos() {
        String[] candidatos = {"Nome 1", "Nome 2", "Nome 3", "Nome 4", "Nome 5", "Nome 6", "Nome 7"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPredentido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPredentido);
            if (salarioBase >= salarioPredentido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //CASE 3
    static void imprimirSelecionados() {
        String[] candidatos = {"Nome 1", "Nome 2", "Nome 3", "Nome 4", "Nome 5"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("\nForma abreviada de informação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    //CASE 4
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

}
