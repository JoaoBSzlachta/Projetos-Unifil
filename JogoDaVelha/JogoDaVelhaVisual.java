package JogoDaVelha;

import Utils.ConsoleDisplay;

public class JogoDaVelhaVisual extends ConsoleDisplay {
    private String[][] velha;

    public JogoDaVelhaVisual(String velha[][]) {
        this.velha = velha;
    }

    public void mountJogoDaVelha() {
        velhaLinha();

        for (int i = 0; i < velha.length; i++) {
            printBr("");

            for (int j = 0; j < velha[i].length; j++) {
                if (velha[i][j] == null) {
                    print("| * |");
                    continue;
                }

                print("| " + velha[i][j] + " |");
            }
            velhaLinha();
        }
    }

    private void velhaLinha() {
        printBr("");
        linha(velha.length * 5);
    }
}
