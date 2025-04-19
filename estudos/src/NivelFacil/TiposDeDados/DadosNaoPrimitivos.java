package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /* Dados nao primitivos: String, Class, Array, enum;
        *  Objetivo: entender a diferença entre dados primitivos e nao primitivos e saber o que é um metodo
        * */

        String nome_ninja1 = "Naruto Uzumaki", nome_ninja2 = "Sasuke Uchiha";
        int idadeNinja1 = 16, idadeNinja2 = 16;
        String nomeNinja1UpperCase = nome_ninja1.toUpperCase();
        String nomeNinja2LowerCase = nome_ninja2.toLowerCase();
        System.out.println("Ninja 1: " + nome_ninja1 + ", Idade: " + idadeNinja1);
        System.out.println("Ninja 2: " + nome_ninja2 + ", Idade: " + idadeNinja2);
        System.out.println("Nome do Naruto em maiúsculas: " + nomeNinja1UpperCase);
        System.out.println("Nome do Sasuke em minúsculas: " + nomeNinja2LowerCase);

    }
}
