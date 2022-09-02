package JogoDaVelha;

import Utils.ConsoleDisplay;

public class JogoDaVelhaVisual extends ConsoleDisplay {
    private String[][] velha;

    public JogoDaVelhaVisual(String velha[][]) {
        this.velha = velha;
    }

    public void mountJogoDaVelha() {
        linha();

        for (int i = 0; i < velha.length; i++) {
            printBr("");

            for (int j = 0; j < velha[i].length; j++) {
                if (velha[i][j] == null) {
                    print("| * |");
                    continue;
                }

                print("| " + velha[i][j] + " |");
            }
            linha();
        }

        printBr("");
    }

    // pseudo @Override
    protected void linha() {
        printBr("");
        super.linha(velha.length * 5);
    }

    public void mostrarGanhador() {
        print("Alguém Ganhou!!!");
    }
}
