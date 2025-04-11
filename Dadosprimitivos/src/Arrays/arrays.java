package Arrays;

public class arrays {
    public static void main(String[] args) {
        /* Arrays sao basicamente um grupo de espacos do mesmo tipo armazenados na memoria onde podemos guardar dados.
        * Declaracao e alocacao na memoria de um array: tipo_do_array[] nome_do_array = new tipo_do_array[indice];
        * Inicializacao de um array: nome_do_array[indice] = dado; (indice comeca no 0)
        * */

        String[] nome = new String[3];
        nome[0] = "Naruto";
        nome[1] = "Sakura";
        nome[2] = "Sasuke";
        System.out.println(nome[0]);
        System.out.println(nome[1]);
        System.out.println(nome[2]);

        /* Outra maneira: String[] idade = new String[9];
        *  idade[] = {1, 2, 3
        *             4, 5, 6
        *             7, 8, 9};
        * */
    }
}
