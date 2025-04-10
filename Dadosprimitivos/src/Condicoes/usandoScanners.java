package Condicoes;
import java.util.Scanner;

public class usandoScanners {
    public static void main(String[] args) {

        /* Scanner é uma forma de receber uma interacao so usuario na sua aplicacao.
        * Objetivo: criar um ninja com base nos dados fornecidos do usuario.
        * */

        /*System.out.print("Digite o nome do seu ninja: ");
        Scanner scannerNinja = new Scanner(System.in);
        String nomeNinja = scannerNinja.nextLine();

        System.out.print("Digite a idade do seu ninja: ");
        int idadeNinja = scannerNinja.nextInt();

        scannerNinja.close();

        String maioridade;
        if (idadeNinja >= 18)
        {
            maioridade = "Seu ninja já é maior de idade. ";
        } else
        {
            maioridade = "Seu ninja ainda é menor de idade. ";
        }


        System.out.println("===========================================");
        System.out.println("O nome do seu ninja é: " + nomeNinja);
        System.out.println("A idade do seu ninja é: " + idadeNinja);
        System.out.println(maioridade);
        System.out.println("===========================================");
         */


        // EXAME CHUUNIM:
        System.out.print("Digite o nome do ninja: ");
        Scanner caixaDeEntradas = new Scanner(System.in);
        String nomeNinja = caixaDeEntradas.nextLine();
        System.out.print("Digite a idade do ninja: ");
        int idadeNinja = caixaDeEntradas.nextInt();
        System.out.print("Digite o numero de missoes que este ninja ja realizou: ");
        int numMissoes = caixaDeEntradas.nextInt();

        String habilitacaoExame;
        if (idadeNinja >= 17 && numMissoes >= 10) {
            habilitacaoExame = "Essa ninja está habilitado para fazer o Exame Chuunim! ";
        } else {
            habilitacaoExame = "Esse ninja nao está habilitado para fazer o Exame Chuunim!";
        }

        System.out.println("========================================================");
        System.out.println("Nome do ninja; " + nomeNinja);
        System.out.println("Idade do ninja: " + idadeNinja);
        System.out.println(habilitacaoExame);
        System.out.println("========================================================");
        caixaDeEntradas.close();
    }
}
