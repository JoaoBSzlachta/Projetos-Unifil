package JogoDaVelha;

import Utils.ConsoleDisplay;
import java.util.Scanner;

// Classe usada apenas para visual
public class Visual extends ConsoleDisplay {
    // o metodo mount() monta o visual do jogo da velha no console
    public static void mount(Character[][] velha) {
        Visual.linha(velha);

        for (Character[] characters : velha) {
            printBr("");

            for (int j = 0; j < velha.length; j++) {
                if (characters[j] == null) {
                    ConsoleDisplay.print("| * |");
                    continue;
                }

                print("| " + characters[j] + " |");
            }
            Visual.linha(velha);
        }

        printBr("");
    }

    // este metodo faz as linhas de separação horizontal da velha
    protected static void linha(Character[][] velha) {
        printBr("");
        ConsoleDisplay.linha(velha.length * 5);
    }

    public static void mostrarGanhador(Character $jogador) {
        printBr("");
        print("\uD83D\uDEA9  Jogador \"" + $jogador + "\" Ganhou");
        printBr("");
    }

    public static void digiteEnter(String label) {
        Visual.printBr("");
        Visual.printBr(label);
        Visual.printBr("");
        Visual.print("\uD83D\uDC49 Digite ENTER para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception $e) {}
    }
}
