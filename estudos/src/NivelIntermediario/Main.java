package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        // Criar ninja Naruto
        String nome = "Naruto";
        short idade = 17;
        String aldeia = "Aldeia da Folha";

        // Criar ninja Sasuke
        String nomeSasuke = "Sasuke";
        int idadeSasuke = 17;
        String aldeiaSasuke = "Aldeia da Folha";


        // Comecando a trabalhar com CLASSES e OBJETOS:
        Ninja Sakura = new Ninja(); // Inicializando um novo OBJETO com nome Sakura e da CLASSE Ninja
        Sakura.nome = "Sakura Haruno"; // Acessando o ATRIBUTO nome, do OBJETO Sakura, da CLASSE Ninja
        Sakura.idade = 17; // Acessando o ATRIBUTO idade, do OBJETO Sakura, da CLASSE Ninja
        Sakura.aldeia = "Aldeia da Folha"; // Acessando o ATRIBUTO aldeia, do OBJETO Sakura, da CLASSE Ninja

        Ninja Kakashi = new Ninja();
        Kakashi.nome = "Kakashi Sensei";
        Kakashi.idade = 21;
        Kakashi.aldeia = "Aldeia da Folha";
        
    }
}
