package Desafios;
import java.util.Scanner;

public class desafio002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opc, i = 0, numCadastros = 0;
        String[] nomeNinja = new String[100];
        String[] rankNinja = new String[100];
        int[] idadeNinja = new int[100];

        do {
            System.out.println("\n========= Menu Ninja =========");
            System.out.println(" 1. Cadastrar Ninja (máximo de 100 cadastros.) ");
            System.out.println(" 2. Listar Ninjas");
            System.out.println(" 3. Sair");
            System.out.print(" Escolha uma opção: ");
            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    if (numCadastros == 100) {
                        System.out.println("\nVoce atingiu o número máximo de cadastros! ");
                    }
                    else {
                        System.out.print("\nNome do ninja: ");
                        nomeNinja[i] = scanner.nextLine();
                        System.out.print("Idade do ninja: ");
                        idadeNinja[i] = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Rank do ninja: ");
                        rankNinja[i] = scanner.nextLine();
                        i++;
                        numCadastros++;
                    }
                    break;
                case 2:
                    if (numCadastros == 0) {
                        System.out.println("\nVoce ainda nao cadastrou nenhum ninja. ");
                    }
                    else {
                        System.out.println("\n=================== Lista de Ninjas ===================");
                        for (int j = 0; j < i; j++) {
                            System.out.println("Nome do ninja " + j + ": " + nomeNinja[j]);
                            System.out.println("Idade do ninja " + j + ": " + idadeNinja[j]);
                            System.out.println("Rank do ninja " + j + ": " + rankNinja[j] + "\n");
                        }
                        System.out.println("=======================================================");
                    }
                    break;
                case 3:
                    System.out.println("\nVoce saiu do programa... ");
                    break;
                default:
                    System.out.println("\nVoce digitou uma opcao inválida. Tente novamente. ");
                    break;
            }
        }
        while (opc != 3);

        scanner.close();

        // Adicionar opcao para deletar ninja cadastrado.
    }
}
