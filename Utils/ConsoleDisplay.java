package Utils;

public abstract class ConsoleDisplay {
    protected static void print(String conteudo) {
        System.out.print(conteudo);
    }

    protected static void printBr(String conteudo) {
        System.out.println(conteudo);
    }

    protected static void linha(int length) {
        for (int i = 0; i < length; i++) {
            print("_");
        }
    }
}
