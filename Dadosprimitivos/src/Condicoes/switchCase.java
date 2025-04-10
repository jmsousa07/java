package Condicoes;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        /* Switch case é uma estrutura condicional que serve para quando eu quero aplicara opçoes especificas para o meu usuario dar entrada e com base nisso eu defino as condicoes por casos.
        * Objetivo: criar um algoritmo para um programa que de opcoes de personagens e peca para que o usuario escolha qual ele quiser.
        * */

        /*
        System.out.println("Escolha seu personagem: ");
        System.out.println("[1] - Naruto Uzumaki ");
        System.out.println("[2] - Sasuke Uchiha ");
        System.out.println("[3] - Sakura Haruno ");
        Scanner scanner = new Scanner(System.in);
        int opcDoUsuario = scanner.nextInt();
        switch (opcDoUsuario) {
            case 1:
                System.out.println("Voce escolheu o Naruto, o personagem mais engraçado da turma. ");
                break;
            case 2:
                System.out.println("Voce escolheu o Sasuke, o renegado mais serio da turma. ");
                break;
            case 3:
                System.out.println("Voce escolheu a Sakura, a mais inteligente da turma. ");
                break;
            default:
                System.out.println("Voce digitou uma opcao invalida, tente novamente! ");
                break;
        }
        scanner.close();
        */

        // ESCOLHENDO JUTSU
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha seu jutsu: ");
        System.out.println("[1] - Rasengan ");
        System.out.println("[2] - Chidori ");
        System.out.println("[3] - Clone das sombras ");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Voce escolheu o Rasengan, arrebenta muitos rivais quando usado no momento certo. ");
                break;
            case 2:
                System.out.println("Voce escolheu o Chidori, um dos jutsus mais fortes quando bem upado. ");
                break;
            case 3:
                System.out.println("Voce escolheu o Justu clone das sombras, otimo para combates em equipe. ");
                break;
            default:
                System.out.println("Voce escolheu uma opcao invalida, tente novamente! ");
                break;
        }

        scanner.close();
    }
}
