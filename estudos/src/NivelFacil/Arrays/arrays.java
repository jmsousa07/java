package Arrays;

public class arrays {
    public static void main(String[] args) {
        /* Arrays sao basicamente um grupo de espacos do mesmo tipo armazenados na memoria onde podemos guardar dados.
        * Declaracao e alocacao na memoria de um array: tipo_do_array[] nome_do_array = new tipo_do_array[indice];
        * Inicializacao de um array: nome_do_array[indice] = dado; (indice comeca no 0)
        * */

        String[] nome = new String[6];
        nome[0] = "Naruto";
        nome[1] = "Sakura";
        nome[2] = "Sasuke";
        nome[3] = "Hinata";
        nome[4] = "Kakashi";
        System.out.println(nome[0]);
        System.out.println(nome[1]);
        System.out.println(nome[2]);
        System.out.println(nome[3]);
        System.out.println(nome[4]);
        System.out.println(nome[5]);

        // shortcut para criar e inicializar um Array:
        int [] num = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);


    }
}
