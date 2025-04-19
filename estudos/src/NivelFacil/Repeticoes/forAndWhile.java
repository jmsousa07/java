package Repeticoes;

public class forAndWhile {
    public static void main(String[] args) {
        // aprendendo a usar estruturas de repeticao FOR e WHILE

        int numNinjas = 1, maxNumNinjas = 9;

        while (numNinjas <= maxNumNinjas) {
            System.out.println("0" + numNinjas);
            numNinjas++;
        }

        System.out.println("");

        for (int i = 1; i <= 9; i++) {
            System.out.println("0" + i);
        }
    }
}
