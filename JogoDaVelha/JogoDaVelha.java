package JogoDaVelha;

public class JogoDaVelha {
    protected String[][] velha = new String[3][3];
    protected boolean won = false;
    protected int maxJogadas = 9;
    protected int jogadas = 0;
    protected int jogador = 0;

    public JogoDaVelha() {
        while (won || jogadas < maxJogadas) {
            JogoDaVelhaVisual visual = new JogoDaVelhaVisual(velha);
            visual.mountJogoDaVelha();

            if (jogada()) jogadas++;

            if (ganhou()) break;
        }
    }

    private boolean jogada() {
        JogoDaVelhaVisual visual = new JogoDaVelhaVisual(velha);

        int linha = visual.read("Linha: ");
        int coluna = visual.read("Coluna: ");

        if (casaOcupada(velha[linha][coluna])) {
            visual.printBr("Casa Ocupada !!!");
            return false;
        }

        if (jogador == 0) {
            velha[linha][coluna] = "X";
            jogador = 1;
        } else {
            velha[linha][coluna] = "O";
            jogador = 0;
        }

        return true;
    }

    private boolean casaOcupada(String casa) {
        // se casa estiver ocupada
        if (casa != null) {
            return true;
        }

        return false;
    }

    private boolean ganhou() {
        boolean is = false;
        for (int i = 0; i < velha.length; i++) {
            if (velha[i][0] == velha[i][1] && velha[i][1] == velha[i][2] && jogadas > 1) {
              return true;
            }
            //for (int j = 0; j < velha.length; j++) {
            //}
        }

        return false;
    }
}
