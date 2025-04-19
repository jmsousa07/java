package Desafios;

public class desafio001 {
    public static void main(String[] args) {

        String nomeNinja1 = "Sasuke", nomeNinja2 = "Naruto", nomeNinja3 = "Kakashi";
        int idadeN1 = 15, idadeN2 = 15, idadeN3 = 20;

        String missaoN1 = "Luta contra Itachi", missaoN2 = "Luta contra Rock", missaoN3 = "Invasao a Aldeia rival";
        char nivelmissaoN1 = 'S', nivelmissaoN2 = 'C', nivelmissaoN3 = 'A';
        boolean status_missaoN2 = false, status_missaoN3 = true;

        // NINJA 1
        System.out.println("Nome do ninja 1: " + nomeNinja1);
        System.out.println("Idade do ninja 1: " + idadeN1);
        System.out.println("Missao do ninja 1: " + missaoN1);
        System.out.println("Nivel da missao: " + nivelmissaoN1);
        System.out.println("Status: Analise...");
        System.out.println("");

        // NINJA 2
        System.out.println("Nome do ninja 2: " + nomeNinja2);
        System.out.println("Idade do ninja 2: " + idadeN2);
        System.out.println("Missao do ninja 2: " + missaoN2);
        System.out.println("Nivel da missao: " + nivelmissaoN2);
        System.out.println("Status: Em andamento...");
        System.out.println("");

        // NINJA 3
        System.out.println("Nome do ninja 3: " + nomeNinja3);
        System.out.println("Idade do ninja 3: " + idadeN3);
        System.out.println("Missao do ninja 3: " + missaoN3);
        System.out.println("Nivel da missao: " + nivelmissaoN3);
        System.out.println("Status: Concluida.");
        System.out.println("");


        if (idadeN1 <= 15 && (nivelmissaoN1 == 'B' || nivelmissaoN1 == 'A' || nivelmissaoN1 == 'S')) {
            System.out.println(nomeNinja1 + " nao pode realizar esta missao pois sua idade nao permite a realizacao de missoes de nivel B ou superior");
        } else {
            System.out.println(nomeNinja1 + " pode realizar esta missao.");
        }

        if (idadeN2 <= 15 && (nivelmissaoN2 == 'B' || nivelmissaoN2 == 'A' || nivelmissaoN2 == 'S')) {
            System.out.println(nomeNinja2 + " nao pode realizar esta missao pois sua idade nao permite a realizacao de missoes de nivel B ou superior");
        } else {
            System.out.println(nomeNinja2 + " pode realizar esta missao.");
        }

        if (idadeN3 <= 15 && (nivelmissaoN3 == 'B' || nivelmissaoN3 == 'A' || nivelmissaoN3 == 'S')) {
            System.out.println(nomeNinja3 + " nao pode realizar esta missao pois sua idade nao permite a realizacao de missoes de nivel B ou superior");
        } else {
            System.out.println(nomeNinja3 + " pode realizar esta missao.");
        }

        System.out.println("");

        if (status_missaoN2 == true) {
            System.out.println(nomeNinja2 + " conseguiu completar a missao com exito. ");
        } else {
            System.out.println(nomeNinja2 + " nao conseguiu concluir esta missao. ");
        }

        if (status_missaoN3 == true) {
            System.out.println(nomeNinja3 + " conseguiu completar a missao com exito. ");
        } else {
            System.out.println(nomeNinja3 + " nao conseguiu concluir esta missao. ");
        }

    }
}
