package Utils;

import org.jetbrains.annotations.Nullable;

import java.util.Scanner;

public abstract class ConsoleDisplay {
    public static void print(String conteudo) {
        System.out.print(conteudo);
    }

    public static void printBr(String... conteudo) {
        System.out.println(conteudo);
    }

    protected void linha(int length) {
        for (int i = 0; i < length; i++) {
            print("_");
        }
    }

    public static int read(String conteudo) {
        System.out.println("> " + conteudo);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
