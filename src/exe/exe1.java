package exe;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;
        import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista: ");
        int tamanho = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(100) + 1);
        }
        System.out.println("Lista gerada: " + lista);
        System.out.println("Números múltiplos de 3:");
        for (int i : lista) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Números pares e ímpares:");
        for (int i : lista) {
            if (i % 3 != 0) {
                if (i % 2 == 0) {
                    System.out.println(i + " é par");
                } else {
                    System.out.println(i + " é ímpar");
                }
            }
        }
    }
}
