package Condicoes;

import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {
        /* Ternarios sao usados para diminuir o codigo e funcionam basicamente como um if e else.
        *  Variavel = (condicao) ? valorVerdadeiro : valorFalso;
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        short idade = scanner.nextShort();

        String maioridade = (idade >= 18) ? "Maior de 18 anos " : "Menor de 18 anos ";
        System.out.println(maioridade);
    }
}
