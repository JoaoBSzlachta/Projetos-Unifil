package Utils;

import java.util.Scanner;

public class ConsoleDisplay {
    public static void print(String conteudo) {
        System.out.print(conteudo);
    }

    public static void printBr(String conteudo) {
        System.out.println(conteudo);
    }

    public static void linha(int length) {
        for (int i = 0; i < length; i++) {
            print("_");
        }
    }

    public static int read(String conteudo) {
        System.out.println();
        System.out.print("\uD83D\uDC49 " + conteudo + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
