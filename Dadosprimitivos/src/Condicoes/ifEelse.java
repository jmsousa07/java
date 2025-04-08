package Condicoes;

public class ifEelse {
    public static void main(String[] args) {

        /* IF and ELSE -> estruturas condicionais, testam uma condicao, se for verdadeira realiza um codigo, senao, realiza outro codigo;
        *  Objetivo: subir o nivel de ninja do Naruto e do Kakashi;
        * */

        String nomeNinja1 = "Naruto", nomeNinja2 = "Kakashi";
        int idadeNinja1 = 15, idadeNinja2 = 20;
        short numero_missoesN1 = 10, numero_missoesN2 = 35;
        if (idadeNinja1 >= 15 && numero_missoesN1 > 10) {
            System.out.println(nomeNinja1 + " Alcancou o rank: Chuunim. PARABÉNS!");
        } else {
            System.out.println(nomeNinja1 + " ainda esta no rank: Guenim.");
        }

        if (idadeNinja2 >= 20 || numero_missoesN2 >= 30) {
            System.out.println(nomeNinja2 + " alcancou o rank: Jounim. PARABÉNS!");
        } else {
            System.out.println(nomeNinja2 + " continua no rank: Chuunim. Faca mais missoes!");
        }

    }
}
