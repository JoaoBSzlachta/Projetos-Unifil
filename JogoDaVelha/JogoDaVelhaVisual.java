package JogoDaVelha;

import Utils.ConsoleDisplay;
import Velha.Velha;

public class JogoDaVelhaVisual extends ConsoleDisplay {
    private Velha velha;

    public JogoDaVelhaVisual(Velha velha) {
        this.velha = velha;
    }

    public void mount() {
        linha();

        Character[][] velha = this.velha.getVelha();

        for (int i = 0; i < velha.length; i++) {
            printBr("");

            for (int j = 0; j < velha.length; j++) {
                if (this.velha.casa(i, j) == null) {
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
        super.linha(velha.getVelha().length * 5);
    }

    public void mostrarGanhador() {
        print("Alguém Ganhou!!!");
    }
}
